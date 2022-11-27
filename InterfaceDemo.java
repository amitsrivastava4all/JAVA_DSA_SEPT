// abstract interface IPlayer
// all methods of interface are public
interface IPlayer{ // What to do (100% Abstract)
    int MAX_POWER = 100; // public static final int MAX_POWER=100
    void kick();  // public abstract void kick()
    void jump();
    void run();
    void walk();
    void punch(int power);
}
abstract class GenericPlayer implements IPlayer{
    @Override
    public void walk(){
        System.out.println("Walk Slow...");
    }
}
interface IExtra{
    void hide();
    void size();
}
// interface can inherit another interface (Interface can inherit N Interfaces)
// but class can implement another interface
interface IHybridPlayer extends IPlayer, IExtra{

}
class Ken extends GenericPlayer implements IPlayer{

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
// One class implements N Interfaces
// one class inherit only one class
class Ryu extends GenericPlayer implements IPlayer, IExtra{

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

    @Override
    public void hide() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void size() {
        // TODO Auto-generated method stub
        
    }
    
}
public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
