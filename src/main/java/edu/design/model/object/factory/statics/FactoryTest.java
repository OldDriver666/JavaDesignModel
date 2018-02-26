package edu.design.model.object.factory.statics;



public class FactoryTest {  
  
    public static void main(String[] args) {  
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
    }  
}  

