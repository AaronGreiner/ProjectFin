package components.cutom;

import components.basic.Panel;
import java.awt.LayoutManager;

public class RoundedPanel extends Panel {
    
    public RoundedPanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }
    
    public RoundedPanel(LayoutManager layout) {
        super(layout);
    }
    
    public RoundedPanel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }
    
    public RoundedPanel() {
        
    }
    
}
