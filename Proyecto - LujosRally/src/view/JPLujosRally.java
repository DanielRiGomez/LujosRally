package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JPLujosRally extends JPanel {

	private static final long serialVersionUID = 1L;

	public JPLujosRally(ActionListener listener) {
		setVisible(true);
		setOpaque(false);
		initComponents(listener);
	}

	private void initComponents(ActionListener actionListener) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(new JMenuOption(actionListener));
		add(labelPanel());
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		panel.setBorder(new EmptyBorder(200, 150, 350, 0));
		JLabelImage image = new JLabelImage(15, 15, Constants.ICON_CAPT, 600, 400, Constants.COLOR_GRAY_LOG);

		panel.add(image);
		add(panel);
		return panel;
	}

}
