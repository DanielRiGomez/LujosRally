package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class JMenuOption extends JPanel {

	private static final long serialVersionUID = 1L;

	public JMenuOption(ActionListener listener) {
		setBackground(Constants.COLOR_BLUE_PANEL);
		initComponents(listener);
		setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(labelPanel());
		add(addStart(listener));
		add(addRegProduct(listener));
		add(addSellProduct(listener));
		add(addShowInve(listener));
		add(addShowSell(listener));
		add(addEdit(listener));
		add(addClose(listener));
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLabelImage imageLog = new JLabelImage(80, 80, Constants.ICON_LOGCAR, 250, 150, Constants.COLOR_BLUE_LOG);

		panel.add(imageLog);
		add(panel);
		return panel;
	}

	public JPanel addStart(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setBackground(Constants.COLOR_BLUE_LOG);

		JButtonInformation buttInit = new JButtonInformation(10, 10, Constants.BUTTON_START, Constants.ICON_START, 60,
				60, Constants.COLOR_BLUE_PANEL2, Color.black, Constants.FONT_NUNITO);
		buttInit.setActionCommand(Constants.BUTTON_START);
		buttInit.addActionListener(listener);

		panel.add(buttInit);

		return panel;
	}

	public JPanel addRegProduct(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setBackground(Constants.COLOR_BLUE_LOG);

		JButtonInformation ini = new JButtonInformation(10, 10, Constants.BUTTON_REG_PRODUCT, Constants.ICON_REGIS, 60,
				60, Constants.COLOR_BLUE_PANEL2, Color.black, Constants.FONT_NUNITO);
		ini.setActionCommand(Constants.BUTTON_REG_PRODUCT);
		ini.addActionListener(listener);
		panel.add(ini);

		return panel;
	}

	public JPanel addSellProduct(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setBackground(Constants.COLOR_BLUE_LOG);

		JButtonInformation ini = new JButtonInformation(10, 10, Constants.BUTTON_SEL_PRODUCT, Constants.ICON_SELL, 60,
				60, Constants.COLOR_BLUE_PANEL2, Color.black, Constants.FONT_NUNITO);
		ini.setActionCommand(Constants.BUTTON_SEL_PRODUCT);
		ini.addActionListener(listener);
		panel.add(ini);

		return panel;
	}

	public JPanel addShowInve(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setBackground(Constants.COLOR_BLUE_LOG);

		JMenuInvent ini = new JMenuInvent(listener);
		panel.add(ini);

		return panel;
	}

	public JPanel addShowSell(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setBackground(Constants.COLOR_BLUE_LOG);

		JButtonInformation ini = new JButtonInformation(10, 10, Constants.BUTTON_SHO_SELLS, Constants.ICON_MONEY, 60,
				60, Constants.COLOR_BLUE_PANEL2, Color.black, Constants.FONT_NUNITO);
		ini.setActionCommand(Constants.BUTTON_SHO_SELLS);
		ini.addActionListener(listener);
		panel.add(ini);

		return panel;
	}

	public JPanel addEdit(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setBackground(Constants.COLOR_BLUE_LOG);
		JMenuItem ini = new JMenuItem(listener);
		panel.add(ini);

		return panel;
	}

	public JPanel addClose(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setBackground(Constants.COLOR_BLUE_LOG);

		JButtonInformation ini = new JButtonInformation(10, 10, Constants.BUTTON_CLOSE, Constants.ICON_EXIT, 60,
				60, Constants.COLOR_BLUE_PANEL2, Color.black, Constants.FONT_NUNITO);
		ini.setActionCommand(Constants.BUTTON_CLOSE);
		ini.addActionListener(listener);
		panel.add(ini);

		return panel;
	}

}
