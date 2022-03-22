package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JButtonInformation extends JButton {
	private static final long serialVersionUID = 1L;
	private int arcW;
	private int arcH;

	public JButtonInformation(int acrW, int arcH, String text, Color back, Color colFont, Font font) {
		super(text);
		this.arcH = arcH;
		this.arcW = acrW;
		this.setBackground(back);
		this.setForeground(colFont);
		this.setFont(font);
		this.setContentAreaFilled(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setHorizontalTextPosition(SwingConstants.CENTER);
		this.setVerticalTextPosition(SwingConstants.BOTTOM);
		this.setOpaque(false);
	}

	public JButtonInformation(int acrW, int arcH, String icon, int hei, int wei, Color back, int h, int w, int x,
			int y) {
		this.arcH = arcH;
		this.arcW = acrW;
		this.scalable(icon, hei, wei);
		this.setBackground(back);
		this.setBorder(new EmptyBorder(h, w, x, y));
		this.setContentAreaFilled(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setHorizontalTextPosition(SwingConstants.CENTER);
		this.setVerticalTextPosition(SwingConstants.EAST);
		this.setOpaque(false);
	}

	public JButtonInformation(int acrW, int arcH, String text, String icon, int hei, int wei, Color back, Color colFont,
			Font font) {
		super(text);
		this.arcH = arcH;
		this.arcW = acrW;
		this.scalable(icon, hei, wei);
		this.setBackground(back);
		this.setForeground(colFont);
		this.setFont(font);
		this.setContentAreaFilled(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setHorizontalTextPosition(SwingConstants.CENTER);
		this.setHorizontalTextPosition(SwingConstants.LEFT);
		this.setOpaque(false);
	}

	public void scalable(String icon, int hei, int wei) {
		Image image = new ImageIcon(getClass().getResource(icon)).getImage();
		Image scalablec = image.getScaledInstance(hei, wei, 100);
		ImageIcon imageIcon = new ImageIcon(scalablec);
		this.setIcon(imageIcon);
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(getBackground());
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
		super.paintComponent(g2);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(getBackground());
		g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
	}
}