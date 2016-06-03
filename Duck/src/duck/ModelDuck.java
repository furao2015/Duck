package duck;  
  
import fly.FlyNoWay;  
import quack.Quack;  
  
/** 
 * 模型鸭 
 */  
public class ModelDuck extends Duck{  
  
    public ModelDuck(){  
        quackBehavior = new Quack();  
        flyBehavior = new FlyNoWay();  
    }  
      
    @Override  
    public void display() {  
        System.out.println("I'm a model duck");  
    }  
  
}  