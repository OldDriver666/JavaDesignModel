package edu.design.model.object.factory.multi;


public class SmsSender implements Sender {  
  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
}  

