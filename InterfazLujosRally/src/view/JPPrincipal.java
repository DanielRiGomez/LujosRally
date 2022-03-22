package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPPrincipal extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		Dimension size = getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource(Constants.ICON_FOND));
		g.drawImage(icon.getImage(), 0, 0, size.width, size.height, null);
		setOpaque(false);
		super.paint(g);
	}
}