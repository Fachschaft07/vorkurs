import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

/**
 * @author Alu
 *
 */
public class ToolBox
{
    private Graphics2D			graphics;
    private final Random		r	= new Random(System.currentTimeMillis());
    private int					width;
    private int					height;

    private final ImagePanel	panel;
    private final JFrame		frame;
    private KeyListener keyListener;

    /**
     * Creates a new Toolbox with window and everything.
     */
    public ToolBox(boolean windowed)
    {
        panel = new ImagePanel(true);
        frame = new JFrame();

        if (windowed)
        {
            frame.setBounds(100, 100, 800, 600);
            // set Background to white
            frame.setBackground(new Color(255, 255, 255, 255));
        }
        else
        {
            // Maximize and remove control buttons of the window
            frame.setExtendedState(Frame.MAXIMIZED_BOTH);
            frame.setUndecorated(true);
            // set Background to white
            frame.setBackground(new Color(255, 255, 255, 255));
        }

        // close the Program when escape is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(final KeyEvent e)
            {
                if (keyListener != null) {
                    keyListener.keyTyped(e);
                }
            }

            @Override
            public void keyReleased(final KeyEvent e)
            {
                if (keyListener != null) {
                    keyListener.keyReleased(e);
                }
            }

            @Override
            public void keyPressed(final KeyEvent e)
            {
                if (keyListener != null) {
                    keyListener.keyPressed(e);
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
                {
                    System.exit(0);
                }
            }
        });
        // put the panel into the frame
        frame.add(panel);
        frame.setVisible(true);
        panel.setSize(frame.getWidth(), frame.getHeight());

        graphics = panel.createImage();
        width = panel.getWidth();
        height = panel.getHeight();
    }

    /**
     * Add a listener which will be informed when a key of
     * the keyboard was pressed.
     *
     * @param listener to inform.
     */
    public void addKeyListener(KeyListener listener) {
        keyListener = listener;
    }

    /**
     * Draws the outline of a rectangle.
     *
     * The size of the outline is set with setStroke().
     *
     * @param x X-Coordiante of the upper left point
     * @param y Y-Coordiante of the upper left point
     * @param w Width of the Rectangle
     * @param h Height of the Rectangle
     */
    public void drawRectangle(int x, int y, int w, int h)
    {
        graphics.drawRect(x, y, w, h);
    }

    /**
     * Draws a filled Rectangle.
     *
     * @param x X-Coordiante of the upper left point
     * @param y Y-Coordiante of the upper left point
     * @param w Width of the Rectangle
     * @param h Height of the Rectangle
     */
    public void fillRectangle(int x, int y, int w, int h)
    {
        graphics.fillRect(x, y, w, h);
    }

    /**
     * Sets the Color.
     *
     * The "brush" keeps the color until another color is set.
     *
     * @param c The Color to be drawn width
     */
    public void setColor(Color c)
    {
        graphics.setColor(c);
    }

    /**
     * Sets a Random Color.
     *
     * The "brush" keeps the color until another color is set.
     */
    public void setRandomColor()
    {
        graphics.setColor(new Color(r.nextInt()));
    }

    /**
     * Sets the linewidth.
     *
     * @param width Width of the line.
     */
    public void setStroke(int width)
    {
        graphics.setStroke(new BasicStroke(width));
    }

    /**
     * Draws a Line
     *
     * The Width of the Line is set by setStroke().
     *
     * @param x1 X-Coordinate of the start point
     * @param y1 Y-Coordinate of the start point
     * @param x2 X-Coordinate of the end point
     * @param y2 Y-Coordinate of the end point
     */
    public void drawLine(int x1, int y1, int x2, int y2)
    {
        graphics.drawLine(x1, y1, x2, y2);
    }

    /**
     * Draws a line in polar coordinates.
     *
     * @param x X-Coordinate of the start point
     * @param y Y-Coordinate of the start point
     * @param length length of the line
     * @param angle angle of the line
     */
    public void drawVector(int x, int y, int length, double angle)
    {
        angle = Math.toRadians(angle);
        double overflow = Math.toRadians(90);
        double deltaX = Math.sin(overflow - angle) * length;
        double deltaY = Math.sin(angle) * length;
        int finalX = (int) (x + deltaX);
        int finalY = (int) (y - deltaY);

        graphics.drawLine(x, y, finalX, finalY);
    }

    /**
     * Draws the outline of Oval to the Screen.
     *
     * The size of the outline is set with setStroke(). with width = height you can draw a circle.
     *
     * @param x X-Coordinate left upper corner
     * @param y Y-Coordinate left upper corner
     * @param w Width
     * @param h Height
     */
    public void drawOval(int x, int y, int w, int h)
    {
        graphics.drawOval(x, y, w, h);
    }

    /**
     * Draws a filled Oval to the Screen.
     *
     * with width = height you can draw a circle.
     *
     * @param x X-Coordinate of the left upper corner
     * @param y Y-Coordinate of the left upper corner
     * @param w Width
     * @param h Height
     */
    public void fillOval(int x, int y, int w, int h)
    {
        graphics.fillOval(x, y, w, h);
    }

    /**
     * Draws a String onto the Screen.
     *
     * @param x X-Coordinate for the String
     * @param y Y-Coordinate for the String
     * @param s String to be drawn
     */
    public void drawString(int x, int y, String s)
    {
        graphics.drawString(s, x, y);
    }

    /**
     * Set the font for the drawString method.
     *
     * @param name Name of the Font
     * @param size Size of the font
     */
    public void setFont(String name, int size)
    {
        graphics.setFont(new Font(name, Font.PLAIN, size));
    }

    /**
     * generates a random integer value between 0 and n.
     *
     * @param n max value for the random int
     * @return random int
     */
    public int nextRandomInt(int n)
    {
        return r.nextInt(n);
    }

    /**
     * wait the given time.
     *
     * @param milisec time to wait
     */
    public void wait(final int milisec)
    {
        try
        {
            Thread.sleep(milisec);
        }
        catch (final InterruptedException e)
        {
            System.err.println("irgendwas kaputt");
        }
    }

    /**
     * Get the width of the visible screen.
     *
     * @return the visible width of the image
     */
    public int getFrameWidth()
    {
        return width;
    }

    /**
     * Get the height of the visible screen.
     *
     * @return the visible height of the image
     */
    public int getFrameHeight()
    {
        return height;
    }

}