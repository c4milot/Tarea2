package gui;
import tarea.*;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class PanelComprador extends JPanel implements MouseListener {
    JButton botonMoneda100;
    JButton botonMoneda500;
    JButton botonMoneda1000;
    JButton botonMoneda1500;
    ImageIcon Moneda;
    private Comprador com;


    public PanelComprador(Inicializar inicio){
        {
            setLayout(null);
            setBackground(Color.white);

            //Creacion de botones
            botonMoneda100 = new JButton("Moneda $100");
            botonMoneda500 = new JButton("Moneda $500");
            botonMoneda1000 = new JButton("Moneda $1000");
            botonMoneda1500 = new JButton("Moneda $1500");

            //Posicion y tamaño botones
            botonMoneda100.setBounds(100, 100, 120, 40);
            botonMoneda500.setBounds(300, 100, 120, 40);
            botonMoneda1000.setBounds(500, 100, 120, 40);
            botonMoneda1500.setBounds(700, 100, 120, 40);

            //Cambio color botones
            botonMoneda100.setBackground(new Color(243, 239, 9));
            botonMoneda500.setBackground(new Color(134, 99, 5));
            botonMoneda1000.setBackground(new Color(49, 140, 5));
            botonMoneda1500.setBackground(new Color(231, 65, 65));

            //Se agregan al panel
            add(botonMoneda100);
            add(botonMoneda500);
            add(botonMoneda1000);
            add(botonMoneda1500);

            //Funcionalidad botones
            botonMoneda100.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Moneda100 moneda100 = new Moneda100();
                    inicio.setMoneda(moneda100);
                }
            });

            botonMoneda500.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Moneda500 moneda500 = new Moneda500();
                    inicio.setMoneda(moneda500);
                }
            });
            botonMoneda1000.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Moneda1000 moneda1000 = new Moneda1000();
                    inicio.setMoneda(moneda1000);
                }
            });
            botonMoneda1500.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Moneda1500 moneda1500 = new Moneda1500();
                    inicio.setMoneda(moneda1500);
                }
            });

            Moneda = new ImageIcon("coca_cola.png");
            JLabel mon = new JLabel( new ImageIcon("500.png"));

            mon.setBounds(10,80,500,500);

            add(mon);
        }



    }
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.cyan);
        g.fillRect(60, 90, 800, 60);


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}