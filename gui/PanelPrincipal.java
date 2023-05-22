package gui;

import gui.PanelExpendedor;
import tarea.Inicializar;

import javax.swing.*;
import java.awt.*;


class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private PanelDepositoMonedas mon;
    private Inicializar inicio;
    ImageIcon Moneda;

    public PanelPrincipal(){
        inicio = new Inicializar();
        setLayout(new GridLayout(1, 2)); // 2 filas, 1 columna
       exp = new PanelExpendedor(inicio);
        add(exp);
        com = new PanelComprador(inicio);
        com.setLayout(null);
        add(com);
        com.setVisible(true);

        setVisible(true);
    }
}