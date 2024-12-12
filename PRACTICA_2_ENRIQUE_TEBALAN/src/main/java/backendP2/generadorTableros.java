/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backendP2;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class generadorTableros extends JButton {
    
     private JPanel panelPartida;
    private JButton[][] botones;
    private int filas;
    private int columnas;

    public generadorTableros(JPanel panelPartida, int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.panelPartida = panelPartida;

        inicializarComponentes();
    }

    public void inicializarComponentes() {
        //panelTablero.setLayout(new java.awt.GridLayout(filas, columnas));
        panelPartida.setLayout(new GridLayout(filas, columnas));
        botones = new JButton[filas][columnas];

        //METODO PARA CREAR EL TABLERO  
        for (int x = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {

                botones[x][y] = new JButton();
                botones[x][y].setBackground(Color.GREEN);
                panelPartida.add(botones[x][y]);
            }
        }

        panelPartida.revalidate();
        panelPartida.repaint();
    } 
}
