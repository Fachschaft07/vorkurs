import java.awt.Color;

/**
 * @author Fabio
 */
public class Ball {
    private float x;
    private float y;
    private float directionX;
    private float directionY;
    private float speed;
    private int size;
	private Color color;

    public Ball(float x, float y, int size, float speed, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
		this.color = color;
    }

    public void move() {
        x += directionX * speed;
        y += directionY * speed;
    }

    public void increseSpeed(float add) {
        speed += add;
    }

    public void setX(float x) {
        this.x = x;
    }

    public int getX() {
        return (int) x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getY() {
        return (int) y;
    }

    public int getSize() {
        return size;
    }

    public void setDirection(float directionX, float directionY) {
        this.directionX = directionX;
        this.directionY = directionY;
    }

    public float getDirectionX() {
        return directionX;
    }

    public float getDirectionY() {
        return directionY;
    }
	
	public Color getColor() {
		return color;
	}
}
