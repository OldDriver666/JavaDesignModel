package edu.design.model.struct.proxy.dynamic2;

import net.sf.cglib.proxy.Enhancer;


public class TestCGLibProxy {  
    
    public static void main(String[] args) {  
        DBQueryProxy dbQueryProxy = new DBQueryProxy();  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(DBQuery.class);  
        enhancer.setCallback(dbQueryProxy);  
//        DBQuery dbQuery = (DBQuery)enhancer.create(new Class[]{Integer.class}, new Object[]{1});  
        DBQuery dbQuery = (DBQuery) enhancer.create();  
        System.out.println(dbQuery.getElement("Hello"));  
        System.out.println();  
        System.out.println(dbQuery.getAllElements());  
        System.out.println();  
        System.out.println(dbQuery.sayHello());  
    }  
}  