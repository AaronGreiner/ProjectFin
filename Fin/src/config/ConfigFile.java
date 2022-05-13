package config;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ini4j.Ini;

public class ConfigFile {
    
    private Boolean configLoaded = false;
    private final String config_filename = "fin_config.ini";
    private File ini_file;
    private Ini ini;
    
    private final String section_window = "WINDOW";
    private final String window_state = "state";
    private final String window_width = "width";
    private final String window_height = "height";
    private final String window_pos_x = "pos_x";
    private final String window_pos_y = "pos_y";
    private final String window_title = "title";
    
    public int value_window_state = 0;
    public int value_window_width = 900;
    public int value_window_height = 600;
    public int value_window_pos_x = 0;
    public int value_window_pos_y = 0;
    public String value_window_title = "ProjectFin";
    
    public void load(Boolean forceReload) {
        
        if(forceReload || !configLoaded) {
            
            try {
                ini_file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + config_filename);
                ini_file.createNewFile();
                
                ini = new Ini(ini_file);
                read();
                
            } catch (IOException ex) {
                Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            configLoaded = true;
        }
    }
    
    private void read() {
        
        value_window_state = getInt(section_window, window_state);
        value_window_width = getInt(section_window, window_width);
        value_window_height = getInt(section_window, window_height);
        value_window_pos_x = getInt(section_window, window_pos_x);
        value_window_pos_y = getInt(section_window, window_pos_y);
        value_window_title = getString(section_window, window_title);
    }
    
    public void update() {
        
        ini.put(section_window, window_state, value_window_state);
        ini.put(section_window, window_width, value_window_width);
        ini.put(section_window, window_height, value_window_height);
        ini.put(section_window, window_pos_x, value_window_pos_x);
        ini.put(section_window, window_pos_y, value_window_pos_y);
        ini.put(section_window, window_title, value_window_title);
        
        try {
            ini.store();
        } catch (IOException ex) {
            Logger.getLogger(ConfigFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String getString(Object sectionName, Object optionName) {
        return ini.get(sectionName, optionName);
    }
    
    private int getInt(Object sectionName, Object optionName) {
        
        String s = ini.get(sectionName, optionName);
        
        if(s != null && s.length() > 0) {
            return Integer.valueOf(s);
        }
        
        return 0;
    }
    
}
