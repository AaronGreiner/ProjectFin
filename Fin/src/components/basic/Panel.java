package components.basic;

import java.awt.LayoutManager;
import javax.swing.JPanel;

public class Panel extends JPanel {
    
    public Panel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }
    
    public Panel(LayoutManager layout) {
        super(layout);
    }
    
    public Panel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }
    
    public Panel() {
        
    }
    
}
