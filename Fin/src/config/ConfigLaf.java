package config;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;
import laf.DarkLaf;
import laf.ModeLaf;
import laf.LightLaf;

public class ConfigLaf {
    
    private BasicLookAndFeel laf;
    
    public void setLaf(ModeLaf mode) {
        
        switch (mode) {
            case DARK:
                laf = new DarkLaf();
                break;
            case LIGHT:
                laf = new LightLaf();
                break;
            default:
                throw new AssertionError();
        }
        
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
