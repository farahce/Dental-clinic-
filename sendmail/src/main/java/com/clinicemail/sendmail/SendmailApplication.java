package com.clinicemail.sendmail;

import static com.clinicemail.sendmail.forgotpass.emailadd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendmailApplication {
@Autowired
private sendEmail senderservice;
	
@EventListener(ApplicationReadyEvent.class)
public void sendemail(){
    senderservice.send(forgotpass.emailadd, "Email verification", Integer.toString(forgotpass.otp));
 
}

}
