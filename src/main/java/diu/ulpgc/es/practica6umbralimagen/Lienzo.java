/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.ulpgc.es.practica6umbralimagen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Jorge Santana
 */
public class Lienzo extends JPanel{
    private BufferedImage imagen = null;

    public Lienzo() {
        this.setPreferredSize(new Dimension(1024, 768));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
    }
    
    public void setImage(BufferedImage imagen){
        this.imagen = imagen;
        repaint();
    }
}
