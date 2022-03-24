package view;

import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JPRallySell extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel1;

	public JPRallySell() {
		setVisible(true);
		setOpaque(false);
	}
	public JPanel addPanelRegistrerSell(ActionListener actionListener){
		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.setOpaque(false);

		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JMenuOption(actionListener));
		panel.add(labelPanel(actionListener));
		add(panel);
		return panel;		
	}

	public JPanel addPanelSellTotal(ActionListener actionListener){
		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.setOpaque(false);

		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JMenuOption(actionListener));
		panel.add(addShowTotalSell());
		add(panel);
		return panel;		
	}

	private JPanel labelPanel(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		rounderPanel.setBorder(new EmptyBorder(30, 40, 30, 40));
		JPRegisterSell image = new JPRegisterSell(listener);
		
		rounderPanel.add(image);
		
		panel.setBorder(new EmptyBorder(100, 250, 250, 300));
		
		panel1 = image;
		panel.add(rounderPanel);
		
		add(panel);
		return panel;
	}

	private JPanel addShowTotalSell() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		rounderPanel.setBorder(new EmptyBorder(30, 40, 30, 40));
		JLWindow nameText = new JLWindow("Precio total del inventario:  ", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		JLWindow value = new JLWindow("    Precio total del inventario", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		
		rounderPanel.add(nameText);
		rounderPanel.add(value);
				
		panel.add(rounderPanel);
		panel.setBorder(new EmptyBorder(300, 40, 30, 40));
		
		add(panel);
		return panel;
	}

	public JPanel getPanel1() {
		return panel1;
	}

}
