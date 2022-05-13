package components.basic;

import javax.swing.Action;
import javax.swing.JMenu;

public class Menu extends JMenu {
    
    public Menu() {
        
    }
    
    public Menu(String s) {
        super(s);
    }
    
    public Menu(Action a) {
        super(a);
    }
    
    public Menu(String s, boolean b) {
        super(s, b);
    }
    
}
