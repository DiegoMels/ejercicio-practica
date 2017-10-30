/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoejercicio;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class ControladorCalcular implements MouseListener {
    private JTextField numero1, numero2, resultado;

    ControladorCalcular(JTextField txtNumero1, JTextField txtNumero2, JTextField txtResultado) {
        this.numero1 = txtNumero1;
        this.numero2 = txtNumero2;
        this.resultado = txtResultado;
    }
 
    @Override
    public void mouseClicked(MouseEvent me) {
        //Tengo que transformar numero1 y numero2 a un valor entero para poder realizar la suma
        resultado.setText(numero1.getText() + numero2.getText());
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
