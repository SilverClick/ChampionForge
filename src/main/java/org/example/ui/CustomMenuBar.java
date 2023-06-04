package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class CustomMenuBar extends JMenuBar {
    private Color backgroundColor;

    public CustomMenuBar() {
        super();
        float[] hsbValues = Color.RGBtoHSB(6, 26, 41, null); // Convertir RGB a HSB
        backgroundColor = Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]); // Establecer el color de fondo en HSB // Cambia este color según tus preferencias
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(backgroundColor);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
