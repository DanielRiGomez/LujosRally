package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class JPRegisterProduct extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JTextField productName, unit, value, referencia, descripcion, feature;
	private JComboBox car, marca;
	
	public JPRegisterProduct(ActionListener listener) {
		setOpaque(false);
		initComponents(listener);
		setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setBorder(new EmptyBorder(0, 0, 0, 0));
		getMenuOptions(listener);
		getRegisterProduct(listener);
	}
	
	private void getMenuOptions(ActionListener listener) {
		JMenuOption menuOption = new  JMenuOption(listener);
		menuOption.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuOption.setPreferredSize(new Dimension(260,this.getHeight()));
		this.add(menuOption);
	}
	
	private void getRegisterProduct(ActionListener listener) {
		JPanel register = new JPanel();
		register.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		register.setPreferredSize(new Dimension(800,1000));
		register.setVisible(true);
		
		register.add(getPanelTextTop());
		register.add(getPanelTextConditions());
		register.add(getPanelNameProduct());
		register.add(getPanelUnidadPrecio());
		register.add(getPanelTypeCar());
		register.add(getPanelMarkProduct());
		register.add(getPanelReferenceProduct());
		register.add(getPanelDescriptionProduct());
		register.add(getPanelFeatureProduct());
		register.add(getButtons(listener));
		JScrollPane scrollPane = new JScrollPane(register,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane);
	}
	
	private JPanel getPanelTextTop() {
		JPanel text = new JPanel();
		text.setBorder(new EmptyBorder(50, 0, 0, 0));
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_REGISTER_PRODUCT_TITLE);
		jLabel.setFont(Constants.FONT_NUNITO_BOLD);
		text.add(jLabel);
		return text;
	}
	
	private JPanel getPanelTextConditions() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_CONDITION);
		jLabel.setFont(Constants.FONT_NUNITO_PLAIN);
		text.add(jLabel);
		return text;
	}
	
	private JPanel getPanelNameProduct() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_PRODUCT_NAME);
		jLabel.setFont(Constants.FONT_NUNITO);
		jLabel.setBorder(new EmptyBorder(0, 0, 0, 100));
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(350,50));
		textField.setFont(Constants.FONT_NUNITO_TEXT);
		TextPrompt placeholder = new TextPrompt(Constants.TEXT_REGISTER_NAME_PRODUCT, textField);
	    placeholder.changeAlpha(0.75f);
	    
	    productName = textField;
	    
		text.add(jLabel);
		text.add(textField);
		return text;
	}
	
	private JPanel getPanelUnidadPrecio() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_UNITS);
		jLabel.setFont(Constants.FONT_NUNITO);
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(230,50));
		textField.setFont(Constants.FONT_NUNITO_TEXT);
		TextPrompt placeholder = new TextPrompt(Constants.TEXT_REGISTER_NUMBER_PRODUCT, textField);
		placeholder.changeAlpha(0.75f);
		
		JLabel jLabel2 = new JLabel(Constants.TEXT_PRICE);
		jLabel2.setFont(Constants.FONT_NUNITO);
		
		JTextField textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(230,50));
		textField2.setFont(Constants.FONT_NUNITO_TEXT);
		TextPrompt placeholder2 = new TextPrompt(Constants.TEXT_REGISTER_NUMBER_PRODUCT, textField2);
		placeholder2.changeAlpha(0.75f);
		
		unit = textField;
		value = textField2;
				
		text.add(jLabel);
		text.add(textField);
		text.add(jLabel2);
		text.add(textField2);
		return text;
	}
	
	
	private JPanel getPanelTypeCar() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_PRODUCT_TYPE_CAR);
		jLabel.setFont(Constants.FONT_NUNITO);
		jLabel.setBorder(new EmptyBorder(0, 0, 0, 180));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(Constants.FONT_NUNITO_TEXT);
		comboBox.setPreferredSize(new Dimension(230,50));
		
		car = comboBox;
		
		text.add(jLabel);
		text.add(comboBox);
		return text;
	}
	
	private JPanel getPanelMarkProduct() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_PRODUCT_MARK);
		jLabel.setFont(Constants.FONT_NUNITO);
		jLabel.setBorder(new EmptyBorder(0, 0, 0, 210));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(Constants.FONT_NUNITO_TEXT);
		comboBox.setPreferredSize(new Dimension(230,50));
		
		marca = comboBox;
		
		text.add(jLabel);
		text.add(comboBox);
		return text;
	}
	
	private JPanel getPanelReferenceProduct() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_PRODUCT_REFERENCE);
		jLabel.setFont(Constants.FONT_NUNITO);
		jLabel.setBorder(new EmptyBorder(0, 0, 0, 250));
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(350,100));
		textField.setFont(Constants.FONT_NUNITO_TEXT);
		TextPrompt placeholder = new TextPrompt(Constants.TEXT_REGISTER_TEXT, textField);
	    placeholder.changeAlpha(0.75f);
	    
	    referencia = textField;
	    
		text.add(jLabel);
		text.add(textField);
		return text;
	}
	
	private JPanel getPanelDescriptionProduct() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_PRODUCT_DESCRIPTION);
		jLabel.setFont(Constants.FONT_NUNITO);
		jLabel.setBorder(new EmptyBorder(0, 0, 0, 230));
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(350,100));
		textField.setFont(Constants.FONT_NUNITO_TEXT);
		TextPrompt placeholder = new TextPrompt(Constants.TEXT_REGISTER_TEXT, textField);
		placeholder.changeAlpha(0.75f);
		
		descripcion = textField;
		
		text.add(jLabel);
		text.add(textField);
		return text;
	}
	
	private JPanel getPanelFeatureProduct() {
		JPanel text = new JPanel();
		text.setBackground(Constants.COLOR_BLUE_BACKGROUND);
		JLabel jLabel = new JLabel(Constants.TEXT_PRODUCT_FEATURE);
		jLabel.setFont(Constants.FONT_NUNITO);
		jLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(350,100));
		textField.setFont(Constants.FONT_NUNITO_TEXT);
		TextPrompt placeholder = new TextPrompt(Constants.TEXT_REGISTER_TEXT, textField);
		placeholder.changeAlpha(0.75f);
		
		feature = textField;
		
		text.add(jLabel);
		text.add(textField);
		return text;
	}
	
	private JPanel getButtons(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_REGISTER_PRODUC, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_REGISTER_PRODUC);
		addBook.addActionListener(listener);

		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN_SELL, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		butLog.setActionCommand(Constants.BUTTON_RETURN_SELL);
		butLog.addActionListener(listener);

		panel.add(addBook);
		panel.add(butLog);
		return panel;
	}

	public String getProductName() {
		return productName.getText();
	}

	public String getUnit() {
		return unit.getText();
	}

	public String getValue() {
		return value.getText();
	}

	public String getReferencia() {
		return referencia.getText();
	}

	public String getDescripcion() {
		return descripcion.getText();
	}

	public String getFeature() {
		return feature.getText();
	}

	public String getCar() {
		return (String) car.getSelectedItem();
	}

	public String getMarca() {
		return (String) marca.getSelectedItem();
	}
	
	
	
}
