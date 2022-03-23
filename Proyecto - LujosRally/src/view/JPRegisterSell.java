package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JPRegisterSell extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField productName, sellUnit, sellTotal, idProduct;

	public JPRegisterSell(ActionListener listener) {
		setOpaque(false);
		initComponents(listener);
		setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(labelPanel());
		add(labelText());
		add(addSellDate());
		add(addSellId());
		add(addSellName());
		add(addSellUnit());
		add(addSellTotal());
		add(addButton(listener));
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow window = new JLWindow(Constants.TEXT_REGISTER_SELL, Constants.FONT_NUNITO_BOLD, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);

		panel.add(window);
		add(panel);
		return panel;
	}

	private JPanel labelText() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow window = new JLWindow(Constants.TEXT_CONDITION, Constants.FONT_NUNITO_PLAIN, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		panel.add(window);
		add(panel);
		return panel;
	}

	public JPanel addSellDate() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow nameText = new JLWindow(Constants.TEXT_SELL_DATE, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);

		JLWindow dateText = new JLWindow(new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime()),
				Constants.FONT_NUNITO, Color.BLACK, Constants.COLOR_BLUE_PANEL2);

		panel.add(nameText);
		panel.add(dateText);
		return panel;
	}

	public JPanel addSellId() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow emailText = new JLWindow(Constants.TEXT_SELL_ID, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		emailText.setBorder(new EmptyBorder(0, 0, 0, 20));

		idProduct = new JTextField(20);
		idProduct.setFont(Constants.FONT_NUNITO_TEXT);
		idProduct.setBackground(Color.white);

		productName = idProduct;
		panel.add(emailText);
		panel.add(idProduct);
		return panel;
	}

	public JPanel addSellName() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow passText = new JLWindow(Constants.TEXT_SELL_NAME, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		passText.setBorder(new EmptyBorder(0, 0, 0, 115));

		productName = new JTextField(20);
		productName.setFont(Constants.FONT_NUNITO_TEXT);
		productName.setBackground(Color.white);

		
		panel.add(passText);
		panel.add(productName);
		return panel;
	}

	public JPanel addSellUnit() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow conPassText = new JLWindow(Constants.TEXT_SELL_UNIT, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		conPassText.setBorder(new EmptyBorder(0, 0, 0, 105));

		sellUnit = new JTextField(20);
		sellUnit.setFont(Constants.FONT_NUNITO_TEXT);
		sellUnit.setBackground(Color.white);

		panel.add(conPassText);
		panel.add(sellUnit);
		return panel;
	}

	public JPanel addSellTotal() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow conPassText = new JLWindow(Constants.TEXT_SELL_total, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		conPassText.setBorder(new EmptyBorder(0, 0, 0, 200));

		sellTotal = new JTextField(20);
		sellTotal.setFont(Constants.FONT_NUNITO_TEXT);
		sellTotal.setBackground(Color.white);

		panel.add(conPassText);
		panel.add(sellTotal);
		return panel;
	}

	public JPanel addButton(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_REGISTER_SELL, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_REGISTER_SELL);
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

	public String getSellUnit() {
		return sellUnit.getText();
	}

	public String getSellTotal() {
		return sellTotal.getText();
	}

	public String getIdProduct() {
		return idProduct.getText();
	}
	
	

}
