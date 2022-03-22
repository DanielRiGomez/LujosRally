package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JFrameMain extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1500;
	private static final int HEIGHT = 1000;
	private JPanel panel2;

	public JFrameMain(ActionListener listener) {
		panel2 = new JPPrincipal();

		setTitle(Constants.TEXT_WINDOW);
		setSize(new Dimension(WIDTH, HEIGHT));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource(Constants.ICON_LOGIN)).getImage());
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);
		getContentPane().setBackground(Color.pink);
		initComponents(listener);
		setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		getContentPane().removeAll();
		panel2.setLayout(new BorderLayout());
		addPanelAdmin(listener);
//		addPanelSells(listener);;
		add(panel2);

	}

	public void addPanelAdmin(ActionListener actionListener) {
		panel2.removeAll();
		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		JPLogIn panelButton = new JPLogIn(actionListener);

		rounderPanel.add(panelButton);
		panel2.setBorder(new EmptyBorder(150, 250, 190, 200));
		panel2.add(rounderPanel);
	}

	public void addPanelRegister(ActionListener actionListener) {
		panel2.removeAll();
		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		JPRegisterUser panelButton = new JPRegisterUser(actionListener);

		rounderPanel.add(panelButton);
		panel2.setBorder(new EmptyBorder(80, 250, 80, 200));
		panel2.add(rounderPanel);
	}

	public void addPanelSucess(ActionListener actionListener) {
		panel2.removeAll();
		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		JPRegisterSucess panelButton = new JPRegisterSucess(actionListener);

		rounderPanel.add(panelButton);
		rounderPanel.add(panelButton);
		panel2.setBorder(new EmptyBorder(200, 300, 250, 300));
		panel2.add(rounderPanel);
	}

	public void addPanelStart(ActionListener actionListener) {
		panel2.removeAll();

		JPLujosRally panelButton = new JPLujosRally(actionListener);

		panel2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel2.add(panelButton);
	}

	public void addPanelSells(ActionListener actionListener) {
		panel2.removeAll();
		
		JPRallySell panelButton = new JPRallySell(actionListener);

		panel2.setBorder(new EmptyBorder(0, 10, 0, 0));
		panel2.add(panelButton);
		
//		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
//		JPRegisterSell panelButton = new JPRegisterSell(actionListener);
//
//		rounderPanel.add(panelButton);
//		panel2.setBorder(new EmptyBorder(0, 300, 250, 300));
//		panel2.add(rounderPanel);
	}

//
//	public String getCodeBook() {
//		return addBook.getIdBook();
//	}
//		
//	public String getAddTittleBook() {
//		return addBook.getTitleBook();
//	}
//	 public String getAddAuthorBook() {
//		 return addBook.getAuthorBook();
//	 }
//	 public String getCategoryBook() {
//		 return addBook.getCategory();
//	 }
//	 public String getLanguageBook() {
//		 return addBook.getLanguage();
//	 }
//	 public String getEditorialBook() {
//		 return addBook.getEditorial();
//	 }
//	 public int getNumberPagesBook() {
//		 return addBook.getNumberPages();
//	 }
//	 
//	 public void addPanelDeleteBook(ActionListener listener) {
//			panel2.removeAll();
//			JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_PURPLE_PANEL, 30, 30);
//			panel2.add(rounderPanel, BorderLayout.CENTER);
//			deleteBook = new JPDeleteBook(listener);
//
//			add(panel2);
//			rounderPanel.add(deleteBook);
//			panel2.setBorder(new EmptyBorder(200, 320, 250, 320));
//			panel2.add(rounderPanel);
//			panel2.setOpaque(false);
//		}
//
//		public int getIdDelete() {
//			return deleteBook.getIdBook();
//		}
//
//	public void addPanelLogAdmin(ActionListener listener) {
//		panel2.removeAll();
//		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_PURPLE_PANEL, 30, 30);
//		panel2.add(rounderPanel, BorderLayout.CENTER);
//		logAdmin = new JPLogInAdmin(listener);
//
//		add(panel2);
//		rounderPanel.add(logAdmin);
//		panel2.setBorder(new EmptyBorder(200, 320, 250, 320));
//		panel2.setOpaque(false);
//		panel2.add(rounderPanel);
//	}
//
//	public int getIdAdminLogIn() {
//		return logAdmin.getId();
//	}
//
//	public int getCodeAdminLogIn() {
//		return logAdmin.getCode();
//	}
//
//	public void addTableAvailable(ActionListener listener) {
//		panel2.setBorder(new EmptyBorder(150, 300, 100, 300));
//		menuBar(listener);
//		available = new JPTableAvailable();
//		panel2.add(available, BorderLayout.CENTER);
//	}
//
//	public void addElementToTableAvailable(ArrayList<Object[]> list) {
//		available.addElementToTable(list);
//	}
//
//	public void addShowTittleBook(ActionListener listener) {
//		panel2.removeAll();
//		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_PURPLE_PANEL, 30, 30);
//		panel2.add(rounderPanel, BorderLayout.CENTER);
//		panelBook = new JPShowTittleBook(listener);
//		rounderPanel.add(panelBook);
//		add(panel2);
//		panel2.setBorder(new EmptyBorder(200, 320, 250, 320));
//		panel2.add(rounderPanel);
//		panel2.setOpaque(false);
//	}
//
//	public String getTittleBook() {
//		return panelBook.getTittleBook();
//	}
//
//	public void addTableTittleBook(ActionListener listener) {
//		panel2.setBorder(new EmptyBorder(150, 300, 100, 300));
//		menuBar(listener);
//		add(panel2);
//		book = new JPTableTittleBook();
//		panel2.add(book, BorderLayout.CENTER);
//	}
//
//	public void addElementToTableTitle(ArrayList<Object[]> list) {
//		book.addElementToTable(list);
//	}
//
//	public void addShowAuthorBook(ActionListener listener) {
//		panel2.removeAll();
//		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_PURPLE_PANEL, 30, 30);
//		panel2.add(rounderPanel, BorderLayout.CENTER);
//		panelAuthor = new JPShowAuthorBook(listener);
//		rounderPanel.add(panelAuthor);
//		add(panel2);
//		panel2.setBorder(new EmptyBorder(200, 320, 250, 320));
//		panel2.add(rounderPanel);
//		panel2.setOpaque(false);
//	}
//	
//	public String getAuthorBook() {
//		return panelAuthor.getAuthotBook();
//	}
//
//	public void addTableAuthorBook(ActionListener listener) {
//		panel2.setBorder(new EmptyBorder(150, 300, 100, 300));
//		menuBar(listener);
//		add(panel2);
//		authorBook = new JPTableAuthorBook();
//		panel2.add(authorBook, BorderLayout.CENTER);
//	}
//	
//	public void addElementToTableAuthor(ArrayList<Object[]> list) {
//		authorBook.addElementToTable(list);
//	}
//	
//	public void addExcepetionLogIn() {
//		JOptionPane.showMessageDialog(null, "El usuario o la contraseña estan incorrectos", "Inciar sesión",
//				JOptionPane.ERROR_MESSAGE);
//	} 
//	
//	public void addExcepetionDelet() {
//		JOptionPane.showMessageDialog(null, "El codigo del libro es incorrecto", "Descontinuar libro",
//				JOptionPane.ERROR_MESSAGE);
//	}
//	
//	public void addExcepetionTittle() {
//		JOptionPane.showMessageDialog(null, "El titulo del libro esta incorrecto", "Titulo libro",
//				JOptionPane.ERROR_MESSAGE);
//	}
//	
//	public void addExcepetionAuthor() {
//		JOptionPane.showMessageDialog(null, "El autor del libro esta incorrecto", "Nombre Autor libro",
//				JOptionPane.ERROR_MESSAGE);
//	}
}