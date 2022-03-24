package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JMenuInvent extends JMenuBar {
	private static final long serialVersionUID = 1L;

	public JMenuInvent(ActionListener listener) {
		setVisible(true);
		initComponents(listener);
	}

	private void initComponents(ActionListener listener) {
		add(generateOptionReport(listener));
	}

	private JMenu generateOptionReport(ActionListener listener) {

		JMenuTypeBar menu = new JMenuTypeBar(Constants.BUTTON_SHO_INVENTA, Constants.FONT_NUNITO, Color.BLACK,
				Constants.ICON_EDIT, 60, 60);

		JMenuType report1 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_SHOW_INVEN, Constants.FONT_NUNITO,
				Color.BLACK);

		report1.setActionCommand(Constants.TEXT_SHOW_INVEN);
		report1.addActionListener(listener);

		JMenuType report2 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_SHOW_TOTAL_PRICE, Constants.FONT_NUNITO,
				Color.BLACK);

		report2.setActionCommand(Constants.TEXT_SHOW_TOTAL_PRICE);
		report2.addActionListener(listener);

		menu.add(report1);
		menu.add(report2);

		return menu;
	}
}