package edu.design.model.object.factory.abstracter;




public class SendMailFactory implements Provider {  
      
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}  

 

