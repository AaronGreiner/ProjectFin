package components.cutom;

import components.basic.Table;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class TestTable extends Table {
    
    public TestTable() {
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Test");
        model.addColumn("Test5");
        model.addColumn("Test9");
        
        
        for (int i = 0; i < 1000; i++) {
            model.addRow(new Object[] { i, new JButton("Test"), "value3" });
        }
        
        
        
        
        this.setModel(model);
    }
    
}
