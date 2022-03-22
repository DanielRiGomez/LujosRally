package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JPLogIn extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField idUser, password;

	public JPLogIn(ActionListener listener) {
		setOpaque(false);
		initComponents(listener);
		setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(new EmptyBorder(50, 300, 160, 300));
		add(labelPanel());
		add(addUser());
		add(addPassword());
		add(addButton(listener));
	}

	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		panel.setLayout(new FlowLayout(1));
		JLWindow window = new JLWindow("Bienvenido a Lujos Rally", Constants.FONT_NUNITO_BOLD, Color.BLACK,
				Constants.COLOR_BLUE_PANEL2);

		panel.add(window);
		add(panel);
		return panel;
	}

	public JPanel addUser() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow idUserText = new JLWindow("Usuario", Constants.FONT_NUNITO, Color.BLACK, Constants.COLOR_BLUE_PANEL2);
		idUserText.setBorder(new EmptyBorder(10, 0, 10, 70));

		idUser = new JTextField(15);
		idUser.setFont(Constants.FONT_NUNITO_TEXT);
		idUser.setBackground(Color.white);

		panel.add(idUserText);
		panel.add(idUser);
		return panel;
	}

	public JPanel addPassword() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLWindow passText = new JLWindow("Contraseña", Constants.FONT_NUNITO, Color.BLACK, Constants.COLOR_BLUE_PANEL2);
		passText.setBorder(new EmptyBorder(0, 0, 20, 25));

		password = new JPasswordField(15);
		password.setFont(Constants.FONT_NUNITO_TEXT);
		password.setBackground(Color.white);

		panel.add(passText);
		panel.add(password);
		return panel;
	}

	public JPanel addButton(ActionListener listener) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		JButtonInformation addBook = new JButtonInformation(10, 10, Constants.BUTTON_LOG_USER, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		addBook.setActionCommand(Constants.BUTTON_LOG_USER);
		addBook.addActionListener(listener);

		JButtonInformation butLog = new JButtonInformation(10, 10, Constants.BUTTON_REGISTER_USER, Constants.COLOR_RED,
				Color.BLACK, Constants.FONT_NUNITO);
		butLog.setActionCommand(Constants.BUTTON_REGISTER_USER);
		butLog.addActionListener(listener);

		panel.add(addBook);
		panel.add(butLog);
		return panel;
	}

	public String getIdUser() {
		return idUser.getText();
	}

	public String getPassword() {
		return password.getText();
	}
}
