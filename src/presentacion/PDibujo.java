
package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import logica.Bloque;
import logica.Galleta;
import logica.Juego;

public class PDibujo extends JPanel implements Observer {
    private Object objObservable;
    
    public void paint(Graphics g) {
        Juego juego = (Juego)this.objObservable;
        g.setColor(new Color(20, 20, 20));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (Bloque bloque : juego.getBloques()) {
            g.drawImage(bloque.getImagen(), bloque.getX()*20, bloque.getY()*20, this);
        }
        for (Galleta galleta : juego.getGalletas()) {
            g.drawImage(galleta.getImagen(), galleta.getX()*20, galleta.getY()*20, this);
        }
        g.drawImage(juego.getComeGalletas().getImagen(), juego.getComeGalletas().getX()*20, juego.getComeGalletas().getY()*20, this);
    }
    
    @Override
    public void update(Observable arg0, Object arg1) {
        this.objObservable = arg1;
        this.repaint();
    }
    
}
