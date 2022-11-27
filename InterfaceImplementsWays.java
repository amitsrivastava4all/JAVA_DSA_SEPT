// SAM Interface
@FunctionalInterface
interface Calc{
    int compute(int x, int y);
}
//1st
class A1 implements Calc{

    @Override
    public int compute(int x, int y) {
        // TODO Auto-generated method stub
        return x + y;
    }
    
}
class T{
    void show(){
        System.out.println("T Show");
    }
}
public class InterfaceImplementsWays {
    public static void main(String[] args) {
        T t = new T(){
            @Override
            void show(){
                super.show();
                System.out.println("T Another Show");
            }
        };
        t.show();

        A1 obj = new A1();
        A1 obj3 = new A1();
        int c = obj.compute(10, 20);
        System.out.println(c);

        Calc o = (a,b)->a+b;
        Calc o2 = (a,b)->{
            System.out.println("A is "+a+" B is "+b);
            return a * b;
        };
        System.out.println("Lambda "+o.compute(10, 20));
        System.out.println(o2.compute(10, 20));
        /* *
        // Anonymous Class
        Calc obj2 = new Calc(){

            @Override
            public int compute(int x, int y) {
                // TODO Auto-generated method stub
                return x + y;
            }
            
        };
        int d = obj2.compute(1000, 2000);
        */

        // Java 8 Lambda 
    }
}
