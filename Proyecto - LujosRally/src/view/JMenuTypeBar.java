package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

public class JMenuTypeBar extends JMenu {
	private static final long serialVersionUID = 1L;

	public JMenuTypeBar(String text, Font font, Color fore, String icon, int hei, int wei) {
		super(text);
		setBackground(Constants.COLOR_BLUE_PANEL);
		scalable(icon, hei, wei);
		setFont(font);
		setForeground(fore);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setHorizontalTextPosition(SwingConstants.LEFT);
	}

	public void scalable(String icon, int hei, int wei) {
		Image image = new ImageIcon(getClass().getResource(icon)).getImage();
		Image scalablec = image.getScaledInstance(hei, wei, 100);
		ImageIcon imageIcon = new ImageIcon(scalablec);
		this.setIcon(imageIcon);
	}

}
