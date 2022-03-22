package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JPRallySell extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel1;

	public JPRallySell(ActionListener listener) {
		setVisible(true);
		setOpaque(false);
		initComponents(listener);
	}

	private void initComponents(ActionListener actionListener) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(new JMenuOption(actionListener));
		add(labelPanel(actionListener));
	}

	private JPanel labelPanel(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		panel.setBorder(new EmptyBorder(200, 150, 350, 0));
		JPRegisterSell image = new JPRegisterSell(listener);
		
		rounderPanel.add(image);
		
		panel.setBorder(new EmptyBorder(150, 200, 250, 300));
		
		panel1 = image;
		panel.add(rounderPanel);
		

		add(panel);
		return panel;
	}

	public JPanel getPanel1() {
		return panel1;
	}

}
