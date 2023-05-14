import javax.swing.*;
import java.awt.*;

class PanelComprador extends JPanel {
    JButton boton2;

    public PanelComprador(){
        setBackground(Color.white);
        boton2 = new JButton("Boton");
        add(boton2);
    }
}