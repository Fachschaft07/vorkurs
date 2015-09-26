import java.awt.Color;

/**
 * @author Fabio
 */
public class Bar {
    private float x;
    private float y;
    private int width;
    private int height;
    private float speedY;
    private float speed;
	private Color color;

    public Bar(float x, float y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = 7.5f;
		this.color = color;
    }

    public int getX() {
        return (int) x;
    }

    public int getY() {
        return (int) y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
	
	public Color getColor() {
		return color;
	}

    public void moveUp() {
        speedY = -speed;
    }

    public void moveDown() {
        speedY = speed;
    }

    public void stop() {
        speedY = 0.0f;
    }

    public void move() {
        y += speedY;
    }

    public void increaseSpeed(float add) {
        speed += add;
    }
}
