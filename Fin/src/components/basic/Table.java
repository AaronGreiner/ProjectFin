package components.basic;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class Table extends JTable {
    
    public Table() {
        
    }
    
    public Table(TableModel dm) {
        super(dm);
    }
    
    public Table(TableModel dm, TableColumnModel cm) {
        super(dm, cm);
    }
    
    public Table(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {
        super(dm, cm, sm);
    }
    
    public Table(int numRows, int numColumns) {
        super(numRows, numColumns);
    }
    
    public Table(Vector<? extends Vector> rowData, Vector<?> columnNames) {
        super(rowData, columnNames);
    }
    
    public Table(Object[][] rowData, Object[] columnNames) {
        super(rowData, columnNames);
    }
    
}
