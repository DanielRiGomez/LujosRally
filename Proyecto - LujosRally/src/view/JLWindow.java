package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class JLWindow extends JLabel {

	private static final long serialVersionUID = 1L;
	private int arcW;
	private int arcH;

	public JLWindow(String text, Font font, Color foreground, Color back) {
		super(text);
		setForeground(foreground);
		setBackground(back);
		setOpaque(false);
		setFont(font);
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(getBackground());
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(getBackground());
		g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
	}
}