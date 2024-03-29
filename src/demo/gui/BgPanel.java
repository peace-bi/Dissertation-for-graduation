package demo.gui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BgPanel extends JPanel {
	
	Image bg = new ImageIcon("/background.jpg").getImage();
	private static final Color BACKGROUND      = Color.black;
    private static final Color BACKGROUND_2    = Color.WHITE;
    String path="/background.jpg";
	
    @Override
    public void paintComponent(Graphics g) {
    	Graphics2D graphics = (Graphics2D) g.create();        
        int midY = 100;
        Paint topPaint = new GradientPaint(0, 0, BACKGROUND,0, midY, BACKGROUND_2);
        graphics.setPaint(topPaint);
        graphics.fillRect(0, 0, getWidth(), midY);        
        Paint bottomPaint = new GradientPaint(0, midY + 1, BACKGROUND_2,0, getHeight(), BACKGROUND);
        graphics.setPaint(bottomPaint);
        graphics.fillRect(0, midY, getWidth(), getHeight());
        Image img = new ImageIcon(getClass().getResource(path)).getImage();
        int imgX = img.getWidth(null);
        int imgY = img.getHeight(null);
        graphics.drawImage(img, (getWidth() - imgX) / 2, (getHeight() - imgY) / 2, imgX, imgY, null);
    }
}
