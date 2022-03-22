package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class JMenuType extends JMenuItem {
	private static final long serialVersionUID = 1L;

	public JMenuType(Color color, String text, Font font, Color fore) {
		super(text);
		setBackground(color);
		setForeground(fore);
		setFont(font);
		setBackground(Constants.COLOR_BLUE_PANEL);
	}

	public void scalable(String icon, int hei, int wei) {
		Image image = new ImageIcon(getClass().getResource(icon)).getImage();
		Image scalablec = image.getScaledInstance(hei, wei, 100);
		ImageIcon imageIcon = new ImageIcon(scalablec);
		this.setIcon(imageIcon);
	}
}
