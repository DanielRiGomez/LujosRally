package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JPChangeInfor extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField anName, newName, aUnit, newUnit, aPrice, newPrice, aType, newType, aMarc, newMarc, aReferen,
			newRefe, aDescrip, newDescrip, aChara, newChara;

//	public JPChangeInfor(ActionListener listener) {
//		setOpaque(false);
//		initComponents(listener);
//		setVisible(true);
//	}
//
//	private void initComponents(ActionListener listener) {
////		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
////		setBorder(new EmptyBorder(50, 300, 160, 300));
////		add(labelPanel());
////		add(addButton(listener));
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	private JPanel labelPanel() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new FlowLayout(1));
//		JLWindow window = new JLWindow("Bienvenido a la sección de edición", Constants.FONT_NUNITO_BOLD, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//
//		panel.add(window);
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelUnits(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addNamePro());
//		panel.add(addAUnit());
//		panel.add(addNewUnit());
//		panel.add(addButton1(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addAUnit() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antigua cantidad del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewUnit() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nueva cantidad del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton1(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_QUAN, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_QUAN);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelPrice(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addNamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	private JPanel labelPanel() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new FlowLayout(1));
//		JLWindow window = new JLWindow("Bienvenido a la sección de edición", Constants.FONT_NUNITO_BOLD, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//
//		panel.add(window);
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	private JPanel labelPanel() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new FlowLayout(1));
//		JLWindow window = new JLWindow("Bienvenido a la sección de edición", Constants.FONT_NUNITO_BOLD, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//
//		panel.add(window);
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}
//
//	public JPanel labelName(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setBorder(new EmptyBorder(50, 300, 160, 300));
//
//		panel.add(labelPanel());
//		panel.add(addANamePro());
//		panel.add(addNewNamePro());
//		panel.add(addButton(listener));
//		add(panel);
//		return panel;
//	}
//
//	private JPanel labelPanel() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		panel.setLayout(new FlowLayout(1));
//		JLWindow window = new JLWindow("Bienvenido a la sección de edición", Constants.FONT_NUNITO_BOLD, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//
//		panel.add(window);
//		add(panel);
//		return panel;
//	}
//
//	public JPanel addANamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow idUserText = new JLWindow("Antiguo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));
//
//		anName = new JTextField(15);
//		anName.setFont(Constants.FONT_NUNITO_TEXT);
//		anName.setBackground(Color.white);
//
//		panel.add(idUserText);
//		panel.add(anName);
//		return panel;
//	}
//
//	public JPanel addNewNamePro() {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//
//		JLWindow passText = new JLWindow("Nuevo nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
//				Constants.COLOR_BLUE_PANEL2);
//		passText.setBorder(new EmptyBorder(0, 0, 20, 25));
//
//		newName = new JTextField(15);
//		newName.setFont(Constants.FONT_NUNITO_TEXT);
//		newName.setBackground(Color.white);
//
//		panel.add(passText);
//		panel.add(newName);
//		return panel;
//	}
//
//	public JPanel addButton(ActionListener listener) {
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
//		addBook.addActionListener(listener);
//
//		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
//				Color.BLACK, Constants.FONT_NUNITO);
//		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
//		butLog.addActionListener(listener);
//
//		panel.add(addBook);
//		panel.add(butLog);
//		return panel;
//	}

	public String getAName() {
		return anName.getText();
	}

	public String getNewName() {
		return newName.getText();
	}

	public String getAUnit() {
		return aUnit.getText();
	}

	public String getNewUnit() {
		return newUnit.getText();
	}

	public String getAPrice() {
		return aPrice.getText();
	}

	public String getNewPrice() {
		return newPrice.getText();
	}

	public String getAType() {
		return aType.getText();
	}

	public String getNewType() {
		return newType.getText();
	}

	public String getAMarc() {
		return aMarc.getText();
	}

	public String getNewMarc() {
		return newMarc.getText();
	}

	public String getARef() {
		return aReferen.getText();
	}

	public String getNewRefe() {
		return newRefe.getText();
	}

	public String getADesc() {
		return aDescrip.getText();
	}

	public String getNewDesc() {
		return newDescrip.getText();
	}

	public String getAChara() {
		return aChara.getText();
	}

	public String getNewChara() {
		return newChara.getText();
	}
}
