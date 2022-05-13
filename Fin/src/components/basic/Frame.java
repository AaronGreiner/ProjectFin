package components.basic;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Frame extends JFrame {
    
    public Frame() throws HeadlessException {
        
    }
    
    public Frame(GraphicsConfiguration gc) {
        super(gc);
    }
    
    public Frame(String title) throws HeadlessException {
        super(title);
    }
    
    public Frame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
}
