import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

/**
 * Class for a the panel on which you draw.
 * 
 * Uses a BufferedImage to draw on and refreshes the image every millisecond.
 * 
 * @author Alex
 */
public class ImagePanel extends JPanel
{

	private static final long	serialVersionUID	= 1L;
	private Image				i;

	public ImagePanel(final boolean doubleBuffer)
	{
		super(doubleBuffer);
	}

	/**
	 * Creates the the image object and returns the Graphics2D object to draw with.
	 * 
	 * @return Graphics2D Object to draw with
	 */
	public Graphics2D createImage()
	{
		i = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB_PRE);
		final Graphics g = i.getGraphics();
		g.setColor(new Color(255, 255, 255, 0));
		g.fillRect(0, 0, getWidth(), getHeight());
		return (Graphics2D) i.getGraphics();
	}

	@Override
	public void paint(final Graphics g)
	{
		// repaint the image every millisecond onto the panel
		g.drawImage(i, 0, 0, null);
		try
		{
			Thread.sleep(2);
		}
		catch (final InterruptedException e)
		{
			System.err.println("irgendwas kaputt");
		}
		repaint();
	}

}
