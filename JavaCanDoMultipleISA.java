interface A{
    int  X = 10; // public static final int X = 10;
    void show();
}
interface B{
    void show();
    int X = 20;
}
interface C extends A, B{

}
class D implements C{
    @Override
    public void show(){
        System.out.println("D Show "+(A.X + B.X));
    }
}

public class JavaCanDoMultipleISA {
    // Java Supports Multiple Inheritance

    
}
