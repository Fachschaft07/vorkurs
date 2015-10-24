import java.awt.*;

/**
 * @author Fabio
 */
public class BodyBlock {
    private int x;
    private int y;
    private int size;
    private Color color;
    private BodyBlock next;

    public BodyBlock(int x, int y, int size, Color color) {
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

    public BodyBlock getNext() {
        return next;
    }

    public void setNext(BodyBlock next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    /**
     * Bewegt den Block in die "Laufrichtung".
     *
     * @param directionX - Faktor in X Richtung.
     * @param directionY - Faktor in Y Richtung.
     */
    public void move(int directionX, int directionY) {
        x += directionX * size;
        y += directionY * size;
    }

    /**
     * Erstellt eine exakte Kopie von diesem BodyBlock.
     *
     * @return eine exakte Kopie dieses BodyBlocks.
     */
    public BodyBlock duplicate() {
        return new BodyBlock(x, y, size, color);
    }
}
