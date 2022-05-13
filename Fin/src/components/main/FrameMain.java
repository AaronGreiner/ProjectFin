package components.main;

import components.basic.Frame;
import config.Config;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain extends Frame {
    
    public FrameMain() {
        init();
    }
    
    private void init() {
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                
                Frame f = (Frame) e.getWindow();
                
                Config.FILE.value_window_width = f.getSize().width;
                Config.FILE.value_window_height = f.getSize().height;
                Config.FILE.value_window_pos_x = f.getLocation().x;
                Config.FILE.value_window_pos_y = f.getLocation().y;
                Config.FILE.value_window_title = f.getTitle();
                
                Config.FILE.update();
            }
        });
    }
    
    public void loadConfig() {
        
        Config.FILE.load(true);
        
        if (!Config.FILE.configNewCreated) {
            
            this.setSize(Config.FILE.value_window_width, Config.FILE.value_window_height);
            this.setLocation(Config.FILE.value_window_pos_x, Config.FILE.value_window_pos_y);
            this.setExtendedState(Config.FILE.value_window_state); //NOT WORKING
            this.setTitle(Config.FILE.value_window_title);
            
        } else {
            
            this.setSize(900, 600);
            this.setLocationRelativeTo(null);
            this.setTitle("ProjectFin");
        }
    }
    
}
