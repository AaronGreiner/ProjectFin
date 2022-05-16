package classes.border;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.border.Border;

public class RoundedPanelBorder implements Border {
    
    private int radius;
    private Color color = new Color(0, 0, 0, 0);
    
    public RoundedPanelBorder(int radius) {
        this.radius = radius;
    }
    
    public void setBackground(Color color) {
        this.color = color;
    }
    
    public Color getBackground() {
        return color;
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
        g2.setColor(color);
        g2.fillRoundRect(x, y, width, height, radius, radius);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius, this.radius, this.radius, this.radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
    
}
