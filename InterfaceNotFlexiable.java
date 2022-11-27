import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.*;
interface I{
    void a();
    void b();
    void c();
}
class MyWindow2 extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
}
class MyWindow implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
public class InterfaceNotFlexiable {
    public static void main(String[] args) {
        //WindowListener w;
        WindowAdapter w;
    }
}
