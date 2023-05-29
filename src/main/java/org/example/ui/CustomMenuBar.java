package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class CustomMenuBar extends JMenuBar {
    private Color backgroundColor;

    public CustomMenuBar() {
        super();
        backgroundColor = Color.BLACK; // Cambia este color según tus preferencias
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(backgroundColor);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
