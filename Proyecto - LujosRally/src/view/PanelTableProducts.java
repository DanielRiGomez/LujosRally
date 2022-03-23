package view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelTableProducts extends JPanel {

	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmObject;
	private JTable table;
	private JScrollPane scroll;

	public PanelTableProducts() {
		initComponents();
	}

	private void initComponents() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.BLUE);
		dtmObject = new DefaultTableModel(null, Constants.TABLE_PRODUCTS);
		creteTable();
	}
	
	public void addData(Object[][] data) {
		dtmObject = new DefaultTableModel(data, Constants.TABLE_PRODUCTS);
		table.setModel(dtmObject);
		table.updateUI();
		table.revalidate();
		this.updateUI();
		this.revalidate();
	}

	private void creteTable() {
		table = new JTable();
		table.setModel(dtmObject);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setBackground(Constants.COLOR_BLUE_BACKGROUND);
		table.getTableHeader().setForeground(Color.BLACK);
		table.getTableHeader().setFont(Constants.FONT_NUNITO_NORMAL);
		table.setRowHeight(30);
		table.setBackground(Color.WHITE);
		table.setFont(Constants.FONT_NUNITO_NORMAL);
		table.setFillsViewportHeight(true);
		table.setBorder(null);
		scroll = new JScrollPane(table);
		scroll.setForeground(Color.BLACK);
		scroll.setBorder(null);
		this.add(scroll);
		updateUI();
		table.revalidate();
		table.updateUI();
	}
	
	public void addElementToTable(Object[] vector) {
		dtmObject.addRow(vector);
	}

}
