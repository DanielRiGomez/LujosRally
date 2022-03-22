package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class JRounderPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private int arcW;
	private int arcH;

	public JRounderPanel(Color color, int acrW, int arcH) {
		this.arcH = arcH;
		this.arcW = acrW;
		setBackground(color);
		setOpaque(false);
		this.setBorder(null);
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(getBackground());
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
		super.paintComponent(g2);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(Constants.COLOR_BLUE_PANEL);
		g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
	}
}