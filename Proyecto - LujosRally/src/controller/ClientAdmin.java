package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;

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
				if(services.validateUser((((JPLogIn) frameMain.getActualPanel()).getIdUser()), 
						(((JPLogIn) frameMain.getActualPanel()).getPassword()))) {
					frameMain.addPanelStart(this);
				}else {
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
				if((((JPRegisterUser) frameMain.getActualPanel()).getPassword()).equals(((JPRegisterUser) frameMain.getActualPanel()).getConfPassword())){
					if(services.validateUser((((JPRegisterUser) frameMain.getActualPanel()).getUserName()), 
							(((JPRegisterUser) frameMain.getActualPanel()).getPassword()))) {
						frameMain.addExcepetionRegisterUser();
					}else {
						services.registerUser((((JPRegisterUser) frameMain.getActualPanel()).getUserName()), 
								(((JPRegisterUser) frameMain.getActualPanel()).getPassword()));
						frameMain.addPanelAdmin(this);
					}
				}else {
					frameMain.addExcepetionRepetPassword();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
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
			;
			break;
		case Constants.BUTTON_REGISTER_PRODUC:
			
			try {
				if(!services.validateStock((((JPRegisterProduct) frameMain.getActualPanel()).getProductName()), (((JPRegisterProduct) frameMain.getActualPanel()).getCar()),
						(((JPRegisterProduct) frameMain.getActualPanel()).getMarca()),  (((JPRegisterProduct) frameMain.getActualPanel()).getReferencia()),  
						(((JPRegisterProduct) frameMain.getActualPanel()).getFeature()),  (((JPRegisterProduct) frameMain.getActualPanel()).getDescripcion()))) {
					frameMain.addExcepetionRegisterStock();
				}else {
					services.registerObject((((JPRegisterProduct) frameMain.getActualPanel()).getProductName()), "carro_2"/*(((JPRegisterProduct) frameMain.getActualPanel()).getCar())*/,
							""/*(((JPRegisterProduct) frameMain.getActualPanel()).getMarca())*/,  (((JPRegisterProduct) frameMain.getActualPanel()).getReferencia()),  
							(((JPRegisterProduct) frameMain.getActualPanel()).getFeature()),  (((JPRegisterProduct) frameMain.getActualPanel()).getDescripcion()),
							((JPRegisterProduct) frameMain.getActualPanel()).getUnit(), ((JPRegisterProduct) frameMain.getActualPanel()).getValue());
					frameMain.addPanelStart(this);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			;
			break;
		case Constants.BUTTON_SEL_PRODUCT:
			frameMain.addPanelSells(this);
			;
			break;
		case Constants.BUTTON_SHO_INVENTA:
//			frameMain.addPanelAdmin(this);
			;
			break;
		case Constants.BUTTON_SHO_SELLS:
//			frameMain.addPanelAdmin(this);
			;
			break;
		case Constants.BUTTON_REGISTER_SELL:
			try {
				services.registerSale((((JPRegisterSell) frameMain.getActualPanel()).getProductName()), (((JPRegisterSell) frameMain.getActualPanel()).getSellUnit()),
						(((JPRegisterSell) frameMain.getActualPanel()).getSellTotal()), "7"/*(((JPRegisterSell) frameMain.getActualPanel()).get())*/);
				frameMain.addPanelStart(this);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			;
			break;
		case Constants.BUTTON_RETURN_SELL:
			frameMain.addPanelStart(this);
			;
			break;
		}
	}
}
