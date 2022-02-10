
package presentacion;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logica.Juego;

public class PInformacion extends JPanel implements Observer {
    private JLabel puntos;
    
    public PInformacion () {
        this.setLayout(new FlowLayout());
        this.setBorder(BorderFactory.createTitledBorder("Información"));
        this.puntos = new JLabel("Puntos: ");
        this.add(puntos);
    }
    
    @Override
    public void update(Observable arg0, Object arg1) {
        this.puntos.setText("Puntos: " + ((Juego)arg1).getPuntos());
    }
}
