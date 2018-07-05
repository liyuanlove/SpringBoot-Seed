package com.coder.springbootdomecollection.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.coder.springbootdomecollection.service.ZookeeperService;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import javax.validation.constraints.NotNull;

@Service
public class ZookeeperServiceImpl implements ZookeeperService {

    @Override
    public String get(String nodeName) {
        Watcher watcher = (event) ->{
            System.out.println("Event:" + event);
        };
        String value = null;
        try{
            final ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181",2000,watcher);
            final byte[] data = zooKeeper.getData("/" + nodeName,watcher,null);
            value = new String(data);
            zooKeeper.close();
        }catch (Exception e){
            return e.getMessage();
        }
        return "value" + value;
    }

    @Override
    public String add(@NotNull String nodeName,@NotNull String value) {
        Watcher watcher = (event -> {
            System.out.println("Event:" + event);
        });

        try{
            final ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181",2000,watcher);
            String data = zooKeeper.create("/" + nodeName,value.getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT_SEQUENTIAL);
            zooKeeper.close();
            return "创建：" + nodeName + "成功";
        }catch (Exception e){
            e.printStackTrace();
            return "创建：" + nodeName + "失败";
        }
    }

    @Override
    public String update(String nodeName, String value) {
        Watcher watcher = (event -> {
            System.out.println("Event:" + event);
        });
        try{
            final ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181",2000,watcher);

            Stat stat = zooKeeper.setData("/" + nodeName,value.getBytes(),1);
            zooKeeper.close();
            return "修改：" + nodeName + "成功";
        }catch (Exception e){
            e.printStackTrace();
            return "修改：" + nodeName + "失败";
        }
    }
}