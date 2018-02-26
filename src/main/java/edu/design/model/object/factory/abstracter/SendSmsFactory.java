package edu.design.model.object.factory.abstracter;





public class SendSmsFactory implements Provider{  
  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  


 

