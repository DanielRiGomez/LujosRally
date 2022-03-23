package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JPRallyTableProducts extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel panel1;

	public JPRallyTableProducts(ActionListener listener, Object[][] data) {
		setVisible(true);
		setOpaque(false);
		initComponents(listener, data);
	}

	private void initComponents(ActionListener actionListener, Object[][] data) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		PanelTableProducts image = new PanelTableProducts();
		image.addData(data);
		add(new JMenuOption(actionListener));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(950, 250, 190, -200));
		panel.setOpaque(false);
		
		add(panel);
		add(image);
	}

	public JPanel getPanel1() {
		return panel1;
	}

}
