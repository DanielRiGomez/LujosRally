package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JPLujosRally extends JPanel {

	private static final long serialVersionUID = 1L;

	public JPLujosRally() {
		setOpaque(false);
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(new EmptyBorder(50, 300, 160, 300));
		add(labelPanel());
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLabelImage image = new JLabelImage(10, 10, Constants.ICON_CAPT, 100, 100, Constants.COLOR_BLUE_PANEL);

		panel.add(image);
		add(panel);
		return panel;
	}

}
