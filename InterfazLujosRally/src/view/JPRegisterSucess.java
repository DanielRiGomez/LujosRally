package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JPRegisterSucess extends JPanel {

	private static final long serialVersionUID = 1L;

	public JPRegisterSucess(ActionListener listener) {
		setOpaque(false);
		initComponents(listener);
		setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(new EmptyBorder(40, 0, 0, 0));
		add(labelPanel());
		add(addButton(listener));
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow window = new JLWindow(Constants.TEXT_SUCESS, Constants.FONT_NUNITO_BOLD, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);

		panel.add(window);
		add(panel);
		return panel;
	}

	public JPanel addButton(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		butLog.setActionCommand(Constants.BUTTON_RETURN);
		butLog.addActionListener(listener);

		panel.add(butLog);
		return panel;
	}
}
