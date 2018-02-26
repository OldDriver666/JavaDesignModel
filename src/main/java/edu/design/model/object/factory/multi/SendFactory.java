package edu.design.model.object.factory.multi;



public class SendFactory {  
	   public Sender produceMail(){  

	            return new MailSender();  
	        }  
	          
	        public Sender produceSms(){  
	            return new SmsSender();  
	        }  
	    }  


