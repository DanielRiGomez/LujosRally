package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameMain extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1500;
	private static final int HEIGHT = 1000;
	private JPanel panel2;
	private JPanel actuaPanel;
	private PanelTableProducts products;
	private PanelTableSells sells;
	private JPChangeInfor changeInfor;

	public JFrameMain(ActionListener listener) {
		panel2 = new JPPrincipal();
		actuaPanel = new JPanel();
		products = new PanelTableProducts();
		sells = new PanelTableSells();
		changeInfor = new JPChangeInfor();

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
		add(panel2);
	}

	public void addPanelAdmin(ActionListener actionListener) {
		panel2.removeAll();
		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		JPLogIn panelButton = new JPLogIn(actionListener);

		actuaPanel = panelButton;

		rounderPanel.add(panelButton);
		panel2.setBorder(new EmptyBorder(150, 250, 190, 200));
		panel2.add(rounderPanel);
	}

	public void addPanelRegister(ActionListener actionListener) {
		panel2.removeAll();
		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		JPRegisterUser panelButton = new JPRegisterUser(actionListener);

		actuaPanel = panelButton;

		rounderPanel.add(panelButton);
		panel2.setBorder(new EmptyBorder(80, 250, 200, 200));
		panel2.add(rounderPanel);
	}

	public void addPanelStart(ActionListener actionListener) {
		panel2.removeAll();

		JPLujosRally panelButton = new JPLujosRally(actionListener);

		panel2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel2.add(panelButton);
	}

	public void addPanelRegisterProduct(ActionListener actionListener) {
		panel2.removeAll();
		JPRegisterProduct registerProduct = new JPRegisterProduct(actionListener);

		actuaPanel = registerProduct;

		panel2.setBorder(new EmptyBorder(0, 0, 0, 1));
		panel2.add(registerProduct);
	}

	public void addPanelRegisterSell(ActionListener actionListener) {
		panel2.removeAll();

		JPRallySell panelButton = new JPRallySell();

		panel2.setBorder(new EmptyBorder(0, 0, 0, 30));

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton.addPanelRegistrerSell(actionListener));
	}

	public void addPanelSellTotal(ActionListener actionListener) {
		panel2.removeAll();

		JPRallySell panelButton = new JPRallySell();
		panel2.setBorder(new EmptyBorder(0, 0, 0, 30));
		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton.addPanelSellTotal(actionListener));
	}


	public void addTableProducts(ActionListener actionListener, Object[][] data) {
		panel2.removeAll();

		JPRallyTableProducts panelButton = new JPRallyTableProducts(actionListener, data);

		panel2.setBorder(new EmptyBorder(0, 0, 0, 30));

		actuaPanel = panelButton.getPanel1();
		panel2.add(panelButton);
		panel2.updateUI();
	}

	public void addTableSellProducts(ActionListener actionListener, Object[][] data) {
		panel2.removeAll();

		JPRallyTableSellProducts panelButton = new JPRallyTableSellProducts(actionListener, data);

		panel2.setBorder(new EmptyBorder(0, 0, 0, 30));

		actuaPanel = panelButton.getPanel1();
		panel2.add(panelButton);
		panel2.updateUI();
	}

	public void addPanelEditName(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addNamePro(), changeInfor.addButtonName(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	public void addPanelEditUnits(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addUnitPro(), changeInfor.addButtonUnit(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	public void addPanelEditType(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addTypePro(), changeInfor.addButtonType(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}
	
	public void addPanelEditPrice(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addPricePro(), changeInfor.addButtonPrice(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	public void addPanelEditMarc(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addMarPro(), changeInfor.addButtonMarc(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	public void addPanelEditRefe(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addRefePro(), changeInfor.addButtonRefe(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	public void addPanelEditDesc(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addDdescPro(), changeInfor.addButtonDesc(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	public void addPanelEditChar(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addCaracPro(), changeInfor.addButtonChar(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	
	public void addPanelDelete(ActionListener actionListener) {
		panel2.removeAll();

		JPanel changeName = new JPanel();
		changeName = changeInfor.labelGeneral(changeInfor.addDeletePro(), changeInfor.addButtonDelete(actionListener));
		JPBGeneral panelButton = new JPBGeneral(150, 0, 0, 0, actionListener, changeName, 100, 50, 100, 100);

		actuaPanel = panelButton.getPanel1();

		panel2.add(panelButton);
	}

	public void addElementToTableProducts(Object[] vector) {
		products.addElementToTable(vector);
	}



	public void addElementToTableSells(Object[] vector) {
		sells.addElementToTable(vector);
	}

	public void addData(Object[][] data) {
		products.addData(data);
	}

	public void addExcepetionLogIn() {
		JOptionPane.showMessageDialog(null, "El usuario o la contrase�a estan incorrectos", "Inciar sesi�n",
				JOptionPane.ERROR_MESSAGE);
	}

	public void addExcepetionUnits() {
		JOptionPane.showMessageDialog(null, "Las unidades vendiadas superan la cantidad en stock", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void addExcepetionCasillaObligatoria() {
		JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos obligatorios", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void addExcepetionRegisterUser() {
		JOptionPane.showMessageDialog(null, "El usuario ya existe", "Registrar datos", JOptionPane.ERROR_MESSAGE);
	}

	public void addExcepetionRegisterStock() {
		JOptionPane.showMessageDialog(null, "El producto ya existe en el inventario", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}

	public void addExcepetionRepetPassword() {
		JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Registrar datos", JOptionPane.ERROR_MESSAGE);
	}
	
	public void addExcepetionId() {
		JOptionPane.showMessageDialog(null, "El codigo no corresponde a ningun producto", "Registrar datos", JOptionPane.ERROR_MESSAGE);
	}

	public void addExcepetionValId() {
		JOptionPane.showMessageDialog(null, "El codigo debe ser valores num�ricos", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void addExcepetionValInt() {
		JOptionPane.showMessageDialog(null, "Las unidades y el precio deben ser valores numericos", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}

	public void addExcepetionValNeg() {
		JOptionPane.showMessageDialog(null, "Ingrese solamente valores mayores o iguales a cero", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}

	public void addExcepetionVal() {
		JOptionPane.showMessageDialog(null, "Ingrese solamente valores numericos", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void addExcepetionValObli() {
		JOptionPane.showMessageDialog(null, "Ingrese todos los datos en los campos obligatorios", "Registrar datos",
				JOptionPane.ERROR_MESSAGE);
	}

	public JPanel getActualPanel() {
		return actuaPanel;
	}

	public JPChangeInfor getChangeInfor() {
		return changeInfor;
	}
	
}