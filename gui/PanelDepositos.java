package gui;

import gui.PanelDepositoMonedas;
import gui.PanelDepositoProductos;

import java.awt.*;

public class PanelDepositos {
    PanelDepositoMonedas PanelDM;
    PanelDepositoProductos PanelDP;
    public PanelDepositos(){
        PanelDM = new PanelDepositoMonedas();
        PanelDP = new PanelDepositoProductos();
    }
    public void paint(Graphics g){

    }
}
