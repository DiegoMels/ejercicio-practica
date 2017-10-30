/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoejercicio;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class Visual extends JFrame {
    
    private JLabel lblNumero1 = new JLabel("Numero Uno");
    private JLabel lblNumero2 = new JLabel("Numero Dos");
    private JLabel lblResultado = new JLabel("Resultado");
    private JTextField txtNumero1 = new JTextField ("");
    private JTextField txtNumero2 = new JTextField ("");
    private JTextField txtResultado = new JTextField ("");
    private JButton calcular = new JButton ("Calcular");
    private GridLayout contenedor = new GridLayout (4, 2);
    private ControladorCalcular controladorCalcular = new ControladorCalcular (txtNumero1, txtNumero2, txtResultado);
   
    
public Visual (){
    
    this.setSize(400, 400);
    this.setLayout(contenedor);
    this.setVisible(true);
    this.setTitle("Calcular");
    this.setLocation(200, 200);
    this.calcular.addMouseListener(controladorCalcular);
    this.add(lblNumero1);
    this.add(txtNumero1);
    this.add(lblNumero2);
    this.add(txtNumero2);
    this.add(lblResultado);
    this.add(txtResultado);
    this.add(calcular);
    

    
}

    
}
