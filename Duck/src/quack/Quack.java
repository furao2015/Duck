package quack;  
  
/** 
 * 嘎嘎叫 
 */  
public class Quack implements QuackBehavior{  
  
    @Override  
    public void quack() {  
        System.out.println("Quack");  
    }  
  
}  