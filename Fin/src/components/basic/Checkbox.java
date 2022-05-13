package components.basic;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;

public class Checkbox extends JCheckBox {
    
    public Checkbox() {
        
    }
    
    public Checkbox(Icon icon) {
        super(icon);
    }
    
    public Checkbox(Icon icon, boolean selected) {
        super(icon, selected);
    }
    
    public Checkbox(String text) {
        super(text);
    }
    
    public Checkbox(Action a) {
        super(a);
    }
    
    public Checkbox(String text, boolean selected) {
        super(text, selected);
    }
    
    public Checkbox(String text, Icon icon) {
        super(text, icon);
    }
    
    public Checkbox(String text, Icon icon, boolean selected) {
        super(text, icon, selected);
    }
    
}
