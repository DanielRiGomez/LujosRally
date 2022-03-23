package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.file.WatchService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import microservices.ConexionPostgreSQL;
import view.JFrameMain;
import view.JPLogIn;
import view.JPRegisterProduct;
import view.JPRegisterSell;
import view.JPRegisterUser;

public class ClientAdmin implements ActionListener {

	private JFrameMain frameMain;
	private ConexionPostgreSQL services;

	public ClientAdmin() throws UnknownHostException, IOException {
		frameMain = new JFrameMain(this);
		services = new ConexionPostgreSQL(Constants.PostgreSQL_CONNECTION);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case Constants.BUTTON_LOG_USER:
			try {
				if (services.validateUser((((JPLogIn) frameMain.getActualPanel()).getIdUser()),
						(((JPLogIn) frameMain.getActualPanel()).getPassword()))) {
					frameMain.addPanelStart(this);
				} else {
					frameMain.addExcepetionLogIn();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			;
			break;
		case Constants.BUTTON_REGISTER_USER:
			frameMain.addPanelRegister(this);
			;
			break;
		case Constants.BUTTON_REGISTER_USER2:
			try {
				if ((((JPRegisterUser) frameMain.getActualPanel()).getPassword())
						.equals(((JPRegisterUser) frameMain.getActualPanel()).getConfPassword())) {
					if (services.validateUser((((JPRegisterUser) frameMain.getActualPanel()).getUserName()),
							(((JPRegisterUser) frameMain.getActualPanel()).getPassword()))) {
						frameMain.addExcepetionRegisterUser();
					} else {
						services.registerUser((((JPRegisterUser) frameMain.getActualPanel()).getUserName()),
								(((JPRegisterUser) frameMain.getActualPanel()).getPassword()));
						frameMain.addPanelAdmin(this);
					}
				} else {
					frameMain.addExcepetionRepetPassword();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			;
			break;
		case Constants.BUTTON_RETURN:
			frameMain.addPanelAdmin(this);
			;
			break;
		case Constants.BUTTON_START:
			frameMain.addPanelAdmin(this);
			;
			break;
		case Constants.BUTTON_REG_PRODUCT:
			frameMain.addPanelRegisterProduct(this);
			frameMain.revalidate();
			;
			break;
		case Constants.BUTTON_REGISTER_PRODUC:

			try {
				String[] a = {(((JPRegisterProduct) frameMain.getActualPanel()).getProductName()),
						(((JPRegisterProduct) frameMain.getActualPanel()).getCar()),
						(((JPRegisterProduct) frameMain.getActualPanel()).getMarca()),
						(((JPRegisterProduct) frameMain.getActualPanel()).getReferencia()),
						(((JPRegisterProduct) frameMain.getActualPanel()).getFeature()),
						(((JPRegisterProduct) frameMain.getActualPanel()).getDescripcion())};
				if (services.validateStock(a[0], a[1], a[2], a[3], a[4], a[5])) {
					frameMain.addExcepetionRegisterStock();
				} else {
					services.registerObject((((JPRegisterProduct) frameMain.getActualPanel()).getProductName()),
							(((JPRegisterProduct) frameMain.getActualPanel()).getCar()),
							(((JPRegisterProduct) frameMain.getActualPanel()).getMarca()),
							(((JPRegisterProduct) frameMain.getActualPanel()).getReferencia()),
							(((JPRegisterProduct) frameMain.getActualPanel()).getFeature()),
							(((JPRegisterProduct) frameMain.getActualPanel()).getDescripcion()),
							((JPRegisterProduct) frameMain.getActualPanel()).getUnit(),
							((JPRegisterProduct) frameMain.getActualPanel()).getValue());
					frameMain.addPanelStart(this);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			frameMain.revalidate();
			
			;
			break;
		case Constants.BUTTON_SEL_PRODUCT:
			frameMain.addPanelSells(this);
			frameMain.revalidate();
			;
			break;
		case Constants.BUTTON_SHO_INVENTA:
			manageShowProductsEvent();
			frameMain.revalidate();
			break;
		case Constants.BUTTON_SHO_SELLS:
			manageShowSellProductsEvent();
			frameMain.revalidate();
			;
			break;
		case Constants.BUTTON_REGISTER_SELL:
			frameMain.revalidate();
			try {
				
				if((Integer.parseInt(services.getStockUnits((((JPRegisterSell) frameMain.getActualPanel()).getIdProduct()))) - Integer.parseInt(((JPRegisterSell) frameMain.getActualPanel()).getSellUnit())) >= 0) {
					
					services.registerSale((((JPRegisterSell) frameMain.getActualPanel()).getProductName()),
							(((JPRegisterSell) frameMain.getActualPanel()).getSellUnit()),
							(((JPRegisterSell) frameMain.getActualPanel()).getSellTotal()),
							(((JPRegisterSell) frameMain.getActualPanel()).getIdProduct()));
					
					services.updateStockUnits((((JPRegisterSell) frameMain.getActualPanel()).getIdProduct()), 
							Integer.toString(Integer.parseInt(services.getStockUnits((((JPRegisterSell) frameMain.getActualPanel()).getIdProduct()))) - Integer.parseInt(((JPRegisterSell) frameMain.getActualPanel()).getSellUnit())));
					frameMain.addPanelStart(this);
				}else {
					frameMain.addExcepetionUnits();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			frameMain.revalidate();
			;
			break;
		case Constants.BUTTON_RETURN_SELL:
			frameMain.revalidate();
			frameMain.addPanelStart(this);
			;
			break;
		}
	}

	private void manageShowSellProductsEvent() {
		try {
			frameMain.addTableSellProducts(this, this.addDataSells());
			frameMain.revalidate();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

	}

	private void manageShowProductsEvent() {
		try {
			frameMain.addTableProducts(this, this.addData());
			frameMain.revalidate();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	public Object[][] addData() throws SQLException {
		Object[][] data = new Object[services.getStock().size()][9];
		for (int i = 0; i < services.getStock().size(); i++) {
			data[i][0] = services.getStock().get(i)[0];
			data[i][1] = services.getStock().get(i)[1];
			data[i][2] = services.getStock().get(i)[2];
			data[i][3] = services.getStock().get(i)[3];
			data[i][4] = services.getStock().get(i)[4];
			data[i][5] = services.getStock().get(i)[5];
			data[i][6] = services.getStock().get(i)[6];
			data[i][7] = services.getStock().get(i)[7];
			data[i][8] = services.getStock().get(i)[8];
		}
		return data;
	}

	public Object[][] addDataSells() throws SQLException {
		Object[][] data = new Object[services.getSales().size()][6];
		for (int i = 0; i < services.getSales().size(); i++) {
			data[i][0] = services.getSales().get(i)[0];
			data[i][1] = services.getSales().get(i)[1];
			data[i][2] = services.getSales().get(i)[2];
			data[i][3] = services.getSales().get(i)[3];
			data[i][4] = services.getSales().get(i)[4];
		}
		return data;
	}
}
