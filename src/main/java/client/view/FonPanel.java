package client.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Слава on 29.01.2016.
 */
class FonPanel extends JPanel {
    /**
     * method for set fon to panel
     * @param g
     */
    public void paintComponent(Graphics g){
        Image im = null;
        try {
            im = ImageIO.read(new File("fon.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);
    }
}
