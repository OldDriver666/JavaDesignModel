package edu.design.model.action.middleclass.vistor;


public interface Subject {  
    public void accept(Visitor visitor);  
    public String getSubject();  
}  
