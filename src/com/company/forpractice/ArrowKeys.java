package com.company.forpractice;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {
    public ArrowKeys() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();

        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        up.setText("Up: 0");
        down.setText("Down: 0");
        left.setText("Left: 0");
        right.setText("Right: 0");


        frame.addKeyListener(new KeyListener() {
            int upCount = 0;
            int downCount = 0;
            int leftCount = 0;
            int rightCount = 0;

            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                int keyCode = keyEvent.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        up.setText("Up: " + upCount++);
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: " + downCount++);
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: " + leftCount++);
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: " + rightCount++);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });

        frame.add(panel);
    }

    public static void main(String[] args) {
        new ArrowKeys();
    }
}
