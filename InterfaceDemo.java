// abstract interface IPlayer
interface IPlayer{ // What to do (100% Abstract)
    int MAX_POWER = 100; // public static final int MAX_POWER=100
    void kick();  // public abstract void kick()
    void jump();
    void run();
    void walk();
    void punch(int power);
}
class Ken implements IPlayer{

    @Override
    public void kick() {
        System.out.println("Kick is weak...");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void jump() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void punch(int power) {
        System.out.println("Punch Hard");
        // TODO Auto-generated method stub
        
    }
    
}
class Ryu implements IPlayer{

    @Override
    public void kick() {
        System.out.println("Kick Hard");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void jump() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void punch(int power) {
        // TODO Auto-generated method stub
        
    }
    
}
public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
