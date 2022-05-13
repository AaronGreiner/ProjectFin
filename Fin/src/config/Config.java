package config;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;
import laf.*;

public final class Config {
    
    private static BasicLookAndFeel laf;
    
    public static void setLaf(LafMode mode) {
        
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
