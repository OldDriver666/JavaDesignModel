package edu.design.model.object.singleton;

public class Singleton {  
	  
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static Singleton instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private Singleton() {  
    } 
    
    /* 静态工程方法，创建实例 */  
    public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  
    
    /* 静态工程方法，创建实例   线程安全 */ 
    public static synchronized Singleton getInstance1() {  
            if (instance == null) {  
                instance = new Singleton();  
            }  
            return instance;  
        }  

  
    /*synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁，事实上，
     * 只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进*/
    public static Singleton getInstance2() {  
            if (instance == null) {  
                synchronized (instance) {  
                    if (instance == null) {  
                        instance = new Singleton();  
                    }  
                }  
            }  
            return instance;  
        }  

    
    private static class SingletonFactory{           
        private static Singleton instance = new Singleton();           
    }           
    public static Singleton getInstance3(){           
        return SingletonFactory.instance;           
    } 
    
    /*因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字*/
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
    }  
  
    public static Singleton getInstance4() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  
    
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }  
}  
