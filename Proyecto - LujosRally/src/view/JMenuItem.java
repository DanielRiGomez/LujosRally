package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JMenuItem extends JMenuBar {
	private static final long serialVersionUID = 1L;

	public JMenuItem(ActionListener listener) {
		setVisible(true);
		initComponents(listener);
	}

	private void initComponents(ActionListener listener) {
		add(generateOptionReport(listener));
	}

	private JMenu generateOptionReport(ActionListener listener) {

		JMenuTypeBar menu = new JMenuTypeBar(Constants.BUTTON_EDI_INFOR, Constants.FONT_NUNITO, Color.BLACK,
				Constants.ICON_EDIT, 60, 60);

		JMenuType report1 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_NAME, Constants.FONT_NUNITO,
				Color.BLACK);

		report1.setActionCommand(Constants.TEXT_EDI_NAME);
		report1.addActionListener(listener);

		JMenuType report2 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_UNIT, Constants.FONT_NUNITO,
				Color.BLACK);

		report2.setActionCommand(Constants.TEXT_EDI_UNIT);
		report2.addActionListener(listener);

		JMenuType report3 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_PRICE, Constants.FONT_NUNITO,
				Color.BLACK);
		report3.setActionCommand(Constants.TEXT_EDI_PRICE);
		report3.addActionListener(listener);

		JMenuType report4 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_TYCAR, Constants.FONT_NUNITO,
				Color.BLACK);
		report4.setActionCommand(Constants.TEXT_EDI_TYCAR);
		report4.addActionListener(listener);

		JMenuType report5 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_MARC, Constants.FONT_NUNITO,
				Color.BLACK);
		report5.setActionCommand(Constants.TEXT_EDI_MARC);
		report5.addActionListener(listener);

		JMenuType report6 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_REF, Constants.FONT_NUNITO,
				Color.BLACK);
		report6.setActionCommand(Constants.TEXT_EDI_REF);
		report6.addActionListener(listener);

		JMenuType report7 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_DESCR, Constants.FONT_NUNITO,
				Color.BLACK);
		report7.setActionCommand(Constants.TEXT_EDI_DESCR);
		report7.addActionListener(listener);

		JMenuType report8 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_EDI_CHARAC, Constants.FONT_NUNITO,
				Color.BLACK);
		report8.setActionCommand(Constants.TEXT_EDI_CHARAC);
		report8.addActionListener(listener);

		JMenuType report9 = new JMenuType(Constants.COLOR_BLUE_PANEL, Constants.TEXT_DELETE, Constants.FONT_NUNITO,
				Color.BLACK);
		report9.setActionCommand(Constants.TEXT_DELETE);
		report9.addActionListener(listener);

		menu.add(report1);
		menu.add(report2);
		menu.add(report3);
		menu.add(report4);
		menu.add(report5);
		menu.add(report6);
		menu.add(report7);
		menu.add(report8);
		menu.add(report9);

		return menu;
	}
}