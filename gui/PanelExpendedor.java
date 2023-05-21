package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class PanelExpendedor extends JPanel {
    private JPanel selectorPanel;
    private PanelDepositoProductos productos;
    private JButton boton1, boton2, boton3, boton4;

    public PanelExpendedor() {
        // Crear el panel de la Máquina Expendedora
        productos = new PanelDepositoProductos();
 productos.setPreferredSize(new Dimension(200, 200));
        productos.setBackground(Color.ORANGE);



        // Crear el panel del Selector
        selectorPanel = new JPanel();
        selectorPanel.setPreferredSize(new Dimension(200, 200));
        selectorPanel.setBackground(Color.darkGray);

        // Crear los botones del Selector (los nombres estan escritos asi para que se vean mejor en la interfaz)
        boton1 = new JButton("CocaCola");
        boton2 = new JButton("    Sprite   ");
        boton3 = new JButton(" Snickers");
        boton4 = new JButton("  Super8   ");

        // Agregar los botones al panel del Selector
        selectorPanel.setLayout(new BorderLayout());
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(boton1);
        verticalBox.add(Box.createVerticalStrut(10));
        verticalBox.add(boton2);
        verticalBox.add(Box.createVerticalStrut(10));
        verticalBox.add(boton3);
        verticalBox.add(Box.createVerticalStrut(10));
        verticalBox.add(boton4);
        verticalBox.add(Box.createVerticalGlue());
        selectorPanel.add(verticalBox, BorderLayout.CENTER);

        //Agregar color a los botones
        boton1.setBackground(Color.red);
        boton2.setBackground(Color.green);
        boton3.setBackground(Color.blue);
        boton4.setBackground(Color.yellow);


        // Crear el panel principal y agregar los paneles
        setLayout(new BorderLayout());
        add(productos, BorderLayout.CENTER);
        add(selectorPanel, BorderLayout.LINE_END);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.darkGray);
        g.fillRect(40, 40, 600, 900);

        g.setColor(Color.black);
        g.drawRect(40, 40, 600, 900);

        g.setColor(new Color(255, 255, 255, 255));
        g.fillRect(70, 70, 400, 600);

        g.setColor(Color.black);
        g.drawRect(70, 70, 400, 600);

        g.setColor(Color.white);
        g.fillRect(120, 710, 300, 80);
        g.setColor(Color.black);
        g.drawRect(120, 710, 300, 80);

    }
}