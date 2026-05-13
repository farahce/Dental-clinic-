/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinicemail.sendmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service

public class sendEmail {
    
    @Autowired
    private JavaMailSender sender;
   public void send(String toEmailAdd,String Subject,String Message){
SimpleMailMessage smm=new SimpleMailMessage();
smm.setFrom("farahrabi2211@gmail.com");
smm.setTo(toEmailAdd);
smm.setSubject(Subject);
smm.setText(Message);
sender.send(smm);
   }
}
