package gui;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal dp;//un panel para objetos gráficos
    //private PanelBotones bp;//un panel para objetos gráficos

    public Ventana(){
        super();
        dp = new PanelPrincipal();
        this.add(dp, BorderLayout.CENTER);
        setSize(1920,1080);
        setTitle("Ventana");
        setBackground(Color.green);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}

