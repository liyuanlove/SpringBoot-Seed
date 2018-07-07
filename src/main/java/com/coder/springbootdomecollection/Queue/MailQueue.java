package com.coder.springbootdomecollection.Queue;

import com.coder.springbootdomecollection.model.Mail;
import com.coder.springbootdomecollection.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

@Configuration
public class MailQueue {

    private static final String SENDMAIL_QUEUE = "sendmail.queue";

    @Autowired
    private MailService mailService;

    @JmsListener(destination = SENDMAIL_QUEUE,containerFactory = "queueListenerFactory")
    public void sendMail(ObjectMessage message) {
        Mail mail = null;
        try {
            mail = (Mail) message.getObject();
            mailService.sendMail(mail);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
