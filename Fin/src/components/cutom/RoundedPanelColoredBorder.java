package components.cutom;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundedPanelColoredBorder extends RoundedPanel {
    
    protected Color color_border;
    
    public RoundedPanelColoredBorder() {
        
        init();
    }
    
    public RoundedPanelColoredBorder(int radius) {
        
        super(radius);
        init();
    }
    
    private void init() {
        
        this.color_border = color_background;
        this.repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
        
        g2.setColor(color_border);
        
        g2.drawRoundRect(0, 0, this.getWidth()-1, this.getHeight()-1, radius, radius);
    }
    
    @Override
    public void setBackground(Color color) {
        
        this.color_border = color;
        this.color_background = new Color(color.getRed(), color.getGreen(), color.getBlue(), 100);
        this.repaint();
    }
    
    @Override
    public Color getBackground() {
        
        return this.color_border;
    }
    
}
