package gui;

import gui.PanelExpendedor;

import javax.swing.*;
import java.awt.*;


class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private PanelDepositoMonedas xd;
    ImageIcon Moneda;

    public PanelPrincipal(){
        setLayout(new GridLayout(1, 2)); // 2 filas, 1 columna
       exp = new PanelExpendedor();
        add(exp);

        com = new PanelComprador();
        com.setLayout(null);
        add(com);
        com.setVisible(true);

        setVisible(true);
    }
}