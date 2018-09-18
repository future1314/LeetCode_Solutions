```java
//This is the Proxy Design pattern, The difference between proxy and decorator is that proxy does not pass subject as parameter
interface Subject{
    void request();
}

class RealSubject implements Subject{
    public void request(){
        System.out.println("doStuff");
    }
}

class Proxy implements Subject{
    RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }
    
    public void request(){
        addOnFunc();
        realSubject.request();
    }
    
    public void addOnFunc(){
        System.out.println("this is addon");
    }
    
}
```
