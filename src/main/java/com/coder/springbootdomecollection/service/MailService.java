package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.Mail;

public interface MailService {

    boolean sendMail(String to,String subject,String content);

    void sendMail(Mail mail);

}
