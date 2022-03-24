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
	private JTextField idPro, anName, aUnit, aPrice,  aType,  aMarc,  aReferen, aDescrip, aChara;
	private JPanel panel1;

	public JPChangeInfor() {

	}

	public JPanel labelGeneral(JPanel chan, JPanel butt) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.add(labelPanel());
		panel.add(addAIdPro());
		panel.add(chan);
		panel.add(butt);
		add(panel);
		return panel;
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		panel.setLayout(new FlowLayout(1));
		JLWindow window = new JLWindow("Bienvenido a la secci�n de edici�n", Constants.FONT_NUNITO_BOLD, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);

		panel.add(window);
		add(panel);
		return panel;
	}

	public JPanel addAIdPro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Ingrese el código del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 10));

		idPro = new JTextField(15);
		idPro.setFont(Constants.FONT_NUNITO_TEXT);
		idPro.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(idPro);
		return panel;
	}

	public JPanel addNamePro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Nombre del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(0, 20, 0, 100));

		anName = new JTextField(15);
		anName.setFont(Constants.FONT_NUNITO_TEXT);
		anName.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(anName);
		return panel;
	}

	public JPanel addUnitPro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Unidades del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 100));

		aUnit = new JTextField(15);
		aUnit.setFont(Constants.FONT_NUNITO_TEXT);
		aUnit.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(aUnit);
		return panel;
	}

	public JPanel addPricePro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Precio del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 140));

		aPrice = new JTextField(15);
		aPrice.setFont(Constants.FONT_NUNITO_TEXT);
		aPrice.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(aPrice);
		return panel;
	}

	public JPanel addTypePro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Tipo de carro del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 65));

		aType = new JTextField(15);
		aType.setFont(Constants.FONT_NUNITO_TEXT);
		aType.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(aType);
		return panel;
	}
	
	public JPanel addMarPro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Marca del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 140));

		aMarc = new JTextField(15);
		aMarc.setFont(Constants.FONT_NUNITO_TEXT);
		aMarc.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(aMarc);
		return panel;
	}

	public JPanel addRefePro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Referencia del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 90));

		aReferen = new JTextField(15);
		aReferen.setFont(Constants.FONT_NUNITO_TEXT);
		aReferen.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(aReferen);
		return panel;
	}

	public JPanel addDdescPro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Descripción del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 70));

		aDescrip = new JTextField(15);
		aDescrip.setFont(Constants.FONT_NUNITO_TEXT);
		aDescrip.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(aDescrip);
		return panel;
	}

	public JPanel addCaracPro() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Característica del producto", Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 50));

		aChara = new JTextField(15);
		aChara.setFont(Constants.FONT_NUNITO_TEXT);
		aChara.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(aChara);
		return panel;
	}

	public JButtonInformation addButtGeneral(ActionListener listener) {
		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
		butLog.addActionListener(listener);

		return butLog;
	}
	
	public JPanel addButtonName(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_NAME, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_ED_NAME);
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}

	public JPanel addButtonUnit(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_QUAN, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_ED_QUAN);
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}

	public JPanel addButtonPrice(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_PRIC, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_ED_PRIC);
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}

	public JPanel addButtonType(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_TYPE, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_ED_TYPE);
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}

	public JPanel addButtonMarc(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_MARC, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_ED_MARC);
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}

	public JPanel addButtonRefe(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_REFE, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_ED_REFE);
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}

	public JPanel addButtonDesc(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_DESC, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand("descripcion");
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}

	public JPanel addButtonChar(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_ED_CHAR, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand("Características");
		addBook.addActionListener(listener);

		panel.add(addBook);
		panel.add(addButtGeneral(listener));
		return panel;
	}
	
	public String getIdPro() {
		return idPro.getText();
	}

	public String getAName() {
		return anName.getText();
	}

	public String getAUnit() {
		return aUnit.getText();
	}

	public String getAPrice() {
		return aPrice.getText();
	}

	public String getAType() {
		return aType.getText();
	}

	public String getAMarc() {
		return aMarc.getText();
	}

	public String getARef() {
		return aReferen.getText();
	}

	public String getADesc() {
		return aDescrip.getText();
	}

	public String getAChara() {
		return aChara.getText();
	}

	public JPanel getPanel1() {
		return panel1;
	}
}