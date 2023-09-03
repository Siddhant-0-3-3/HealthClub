package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired(required=false)
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(EmailRequest emailRequest) {

        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom("abc@xyz");
        mailMessage.setTo(emailRequest.getRecipient());
        mailMessage.setText(emailRequest.getMsgBody());
        mailMessage.setSubject(emailRequest.getSubject());
        javaMailSender.send(mailMessage);
    }
}