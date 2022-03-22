package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JPRegisterUser extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField userName, email, password, conPassword;

	public JPRegisterUser(ActionListener listener) {
		setOpaque(false);
		initComponents(listener);
		setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(new EmptyBorder(50, 300, 160, 300));
		add(labelPanel());
		add(labelText());
		add(addUserName());
		add(addEmail());
		add(addPassword());
		add(addConfPassword());
		add(addButton(listener));
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow window = new JLWindow(Constants.TEXT_REGISTER, Constants.FONT_NUNITO_BOLD, Color.BLACK,
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

	public JPanel addUserName() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow nameText = new JLWindow(Constants.TEXT_USER_NAME, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		nameText.setBorder(new EmptyBorder(0, 0, 0, 50));

		userName = new JTextField(20);
		userName.setFont(Constants.FONT_NUNITO_TEXT);
		userName.setBackground(Color.white);

		panel.add(nameText);
		panel.add(userName);
		return panel;
	}

	public JPanel addEmail() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow emailText = new JLWindow(Constants.TEXT_USER_EMAIL, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		emailText.setBorder(new EmptyBorder(0, 0, 0, 230));

		email = new JTextField(20);
		email.setFont(Constants.FONT_NUNITO_TEXT);
		email.setBackground(Color.white);

		panel.add(emailText);
		panel.add(email);
		return panel;
	}

	public JPanel addPassword() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow passText = new JLWindow(Constants.TEXT_USER_PASSWORD, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		passText.setBorder(new EmptyBorder(0, 0, 0, 151));

		password = new JPasswordField(20);
		password.setFont(Constants.FONT_NUNITO_TEXT);
		password.setBackground(Color.white);

		panel.add(passText);
		panel.add(password);
		return panel;
	}

	public JPanel addConfPassword() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow conPassText = new JLWindow(Constants.TEXT_USER_CON_PASSWORD, Constants.FONT_NUNITO, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);
		conPassText.setBorder(new EmptyBorder(0, 0, 10, 20));

		conPassword = new JPasswordField(20);
		conPassword.setFont(Constants.FONT_NUNITO_TEXT);
		conPassword.setBackground(Color.white);

		panel.add(conPassText);
		panel.add(conPassword);
		return panel;
	}

	public JPanel addButton(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_REGISTER_USER2,
				Constants.COLOR_RED, Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_REGISTER_USER2);
		addBook.addActionListener(listener);

		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_RETURN, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		butLog.setActionCommand(Constants.BUTTON_RETURN);
		butLog.addActionListener(listener);

		panel.add(addBook);
		panel.add(butLog);
		return panel;
	}

	public String getUserName() {
		return userName.getText();
	}

	public String getEmail() {
		return email.getText();
	}

	public String getPassword() {
		return password.getText();
	}

	public String getConfPassword() {
		return conPassword.getText();
	}
}
