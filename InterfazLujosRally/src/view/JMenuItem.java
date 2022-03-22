package view;

import java.awt.Color;
import java.awt.Dimension;
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
//		add(generateOptionReport(listener));
	}

//	private JMenu generateOptionReport(ActionListener listener) {
//		JMenuTypeBar menu = new JMenuTypeBar(Constants.TEXT_MENU, Constants.FONT_NUNITO_BOLD,
//				Constants.COLOR_PURPLE_PANEL, Constants.ICON_MENU, 30, 30);
//		menu.setPreferredSize(new Dimension(130, 50));
//
//		JMenuType report1 = new JMenuType(Constants.COLOR_PURPLE_PANEL, Constants.TEXT_AVAILABLE, Constants.FONT_NUNITO,
//				Color.WHITE);
//
//		report1.setActionCommand(Constants.TEXT_AVAILABLE);
//		report1.addActionListener(listener);
//
//		JMenuType report2 = new JMenuType(Constants.COLOR_PURPLE_PANEL, Constants.TEXT_ADD_BOOK, Constants.FONT_NUNITO,
//				Color.WHITE);
//
//		report2.setActionCommand(Constants.TEXT_ADD_BOOK);
//		report2.addActionListener(listener);
//		
//		JMenuType report3 = new JMenuType(Constants.COLOR_PURPLE_PANEL, Constants.TEXT_DELETE, Constants.FONT_NUNITO,
//				Color.WHITE);
//		report3.setActionCommand(Constants.TEXT_DELETE);
//		report3.addActionListener(listener);
//
//		JMenuType report4 = new JMenuType(Constants.COLOR_PURPLE_PANEL, Constants.TEXT_SEARCH_TITLE,
//				Constants.FONT_NUNITO, Color.WHITE);
//		report4.setActionCommand(Constants.TEXT_SEARCH_TITLE);
//		report4.addActionListener(listener);
//
//		JMenuType report5 = new JMenuType(Constants.COLOR_PURPLE_PANEL, Constants.TEXT_SEARCH_AUTHOR,
//				Constants.FONT_NUNITO, Color.WHITE);
//		report5.setActionCommand(Constants.TEXT_SEARCH_AUTHOR);
//		report5.addActionListener(listener);
//
//		JMenuType report6 = new JMenuType(Constants.COLOR_PURPLE_PANEL, Constants.BUTTON_EXIT, Constants.FONT_NUNITO,
//				Color.WHITE);
//		report6.setActionCommand(Constants.BUTTON_EXIT);
//		report6.addActionListener(listener);
//
//		menu.add(report1);
//		menu.add(report2);
//		menu.add(report3);
//		menu.add(report4);
//		menu.add(report5);
//		menu.add(report6);

//		return menu;
//	}
}