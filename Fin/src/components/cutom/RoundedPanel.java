package components.cutom;

import components.basic.Panel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundedPanel extends Panel {
    
    protected int radius = 5;
    protected Color color_background;
    
    public RoundedPanel() {
        
        init();
    }
    
    public RoundedPanel(int radius) {
        
        this.radius = radius;
        init();
    }
    
    private void init() {
        
        color_background = this.getBackground();
        this.setOpaque(true);
    }
    
    public void setRadius(int radius) {
        
        this.radius = radius;
        this.repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
        g2.setColor(color_background);
        
        g2.fillRoundRect(0, 0, this.getWidth()-1, this.getHeight()-1, radius, radius);
    }
    
    @Override
    public void setBackground(Color color) {
        
        this.color_background = color;
        this.repaint();
    }
    
    @Override
    public Color getBackground() {
        
        return this.color_background;
    }
    
}
