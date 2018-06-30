package com.coder.springbootdomecollection.controller;

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/")
public class ZookeeperController {

    @RequestMapping(value="/testZookeeper")
    public String testZookeeper(){
        Watcher watcher = (event) ->{System.out.println("receive event:" + event);};
        String value = null;
        try{
            final ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181",2000,watcher);
            final byte[] data = zooKeeper.getData("/node_1",watcher,null);
            value = new String(data);
            zooKeeper.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "get value:" + value;
    }

}
