package main;

import components.formwindow.FrameTest;
import config.Config;
import java.awt.EventQueue;
import laf.LafMode;

public class Main {
    
    public static void main(String[] args) {
        
        Config.LAF.setLaf(LafMode.DARK);
        
        FrameTest frame = new FrameTest();
        
        EventQueue.invokeLater(() -> {
            frame.setVisible(true);
        });
        
    }
    
}
