package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import view.JFrameMain;

public class ClientAdmin implements ActionListener {
	private JFrameMain frameMain;

	public ClientAdmin() throws UnknownHostException, IOException {
		frameMain = new JFrameMain(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case Constants.BUTTON_LOG_USER:
			frameMain.addPanelStart(this);
			;
			break;
		case Constants.BUTTON_REGISTER_USER:
			frameMain.addPanelRegister(this);
			;
			break;
		case Constants.BUTTON_REGISTER_USER2:
			frameMain.addPanelAdmin(this);
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
//			frameMain.addPanelAdmin(this);
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
			frameMain.addPanelStart(this);
			;
			break;
		case Constants.BUTTON_RETURN_SELL:
			frameMain.addPanelStart(this);
			;
			break;
		}
	}
}
