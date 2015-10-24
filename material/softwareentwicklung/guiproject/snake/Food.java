import java.awt.*;

/**
 * @author Fabio
 */
public class Food {
    private int x;
    private int y;
    private int size;
    private Color color;

    public Food(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }
}
