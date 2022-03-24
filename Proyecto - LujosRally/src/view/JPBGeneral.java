package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JPBGeneral extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel1;

	public JPBGeneral(int hP, int wP, int xP, int yP, ActionListener listener, JPanel panelNew, int h, int w, int x, int y){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(new JMenuOption(listener));
		add(labelPanel(hP, wP, xP, yP, listener, panelNew, h, w, x, y));
		setVisible(true);
		setOpaque(false);
	}

	private JPanel labelPanel(int hP, int wP, int xP, int yP, ActionListener listener, JPanel panelNew, int h, int w, int x, int y) {
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JRounderPanel rounderPanel = new JRounderPanel(Constants.COLOR_BLUE_PANEL, 30, 30);
		rounderPanel.setBorder(new EmptyBorder(w, h, x, y));
				
		rounderPanel.add(panelNew);
		
		panel.setBorder(new EmptyBorder(hP, wP, xP, yP));
		
		panel1 = panelNew;
		panel.add(rounderPanel);
		
		add(panel);
		return panel;
	}

	public JPanel getPanel1() {
		return panel1;
	}
}
