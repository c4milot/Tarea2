package gui;
import javax.swing.*;

import java.awt.*;

class PanelComprador extends JPanel {
    JButton botonMoneda100;
    JButton botonMoneda500;
    JButton botonMoneda1000;
    JButton botonMoneda1500;

    ImageIcon Moneda;



    public PanelComprador(){
        {
            setLayout(null);
            setBackground(Color.white);
            botonMoneda100 = new JButton("Moneda $100");
            botonMoneda500 = new JButton("Moneda $500");
            botonMoneda1000 = new JButton("Moneda $1000");
            botonMoneda1500 = new JButton("Moneda $1500");
            botonMoneda100.setBounds(100, 100, 120, 40);
            botonMoneda500.setBounds(300, 100, 120, 40);
            botonMoneda1000.setBounds(500, 100, 120, 40);
            botonMoneda1500.setBounds(700, 100, 120, 40);
            botonMoneda100.setBackground(new Color(243, 239, 9));
            botonMoneda500.setBackground(new Color(134, 99, 5));
            botonMoneda1000.setBackground(new Color(49, 140, 5));
            botonMoneda1500.setBackground(new Color(231, 65, 65));
            add(botonMoneda100);
            add(botonMoneda500);
            add(botonMoneda1000);
            add(botonMoneda1500);

            Moneda = new ImageIcon("coca_cola.png");
            JLabel mon = new JLabel( new ImageIcon("gui.500.png"));

            mon.setBounds(10,80,500,500);

            add(mon);
        }


    }
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.cyan);
        g.fillRect(60, 90, 800, 60);


    }
}