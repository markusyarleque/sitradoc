package MAIN;

import INTERFACES.Login;
import INTERFACES.Front;

public class SITRADOC {

    public static void main(String[] args) throws InterruptedException {
        
        Front f = new Front();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        Thread.sleep(5000);
        f.dispose();
        
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        
    }
    
}
