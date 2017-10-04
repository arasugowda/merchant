/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportingpackage;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Screen {
    
     public void makeFrameFullSize(JFrame aFrame)
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        aFrame.setSize(screenSize.width, screenSize.height);
    }
}
