package raitkart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sul4
 */

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.EventQueue;

public class TestURLImage {

    public static void main(String[] args) {
        new TestURLImage();
    }

    public TestURLImage() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                try {
                   // String path = "https://i.ytimg.com/vi/yaqe1qesQ8c/maxresdefault.jpg";
                   // System.out.println("Get Image from " + path);
                    //URL url = new URL(path);
                    //BufferedImage image = ImageIO.read(url);
                    //System.out.println("Load image into frame...");
                    JLabel label = new JLabel(new ImageIcon());
                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.getContentPane().add(label);
                    f.pack();
                    f.setLocation(200, 200);
                    f.setVisible(true);
                } catch (Exception exp) {
                    exp.printStackTrace();
                }

            }
        });
    }
}