package components.basic;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JMenuItem;

public class Menuitem extends JMenuItem {
    
    public Menuitem() {
        
    }
    
    public Menuitem(Icon icon) {
        super(icon);
    }
    
    public Menuitem(String text) {
        super(text);
    }
    
    public Menuitem(Action a) {
        super(a);
    }
    
    public Menuitem(String text, Icon icon) {
        super(text, icon);
    }
    
    public Menuitem(String text, int mnemonic) {
        super(text, mnemonic);
    }
    
}
