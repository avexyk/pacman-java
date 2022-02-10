
package logica;

import java.awt.Image;
import java.awt.Toolkit;

public class Elemento {
    
    protected int x;
    protected int y;
    protected Image image;
    
    public Elemento (int x, int y, String imagen) {
        this.x = x;
        this.y = y;
        this.image = Toolkit.getDefaultToolkit().getImage(imagen);
    }
    
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public Image getImagen() {
        return this.image;
    }
    
}
