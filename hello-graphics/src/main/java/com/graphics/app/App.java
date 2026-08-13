package com.graphics.app;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class App extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set shape color to Red
        g.setColor(Color.RED);
        
        // Draw a square: drawRect(x, y, width, height)
        g.fillRect(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics App - Square");
        App panel = new App();

        window.add(panel);
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); // Center window on screen
        window.setVisible(true);
    }
}