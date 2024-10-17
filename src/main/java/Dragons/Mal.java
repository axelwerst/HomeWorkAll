import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Mal extends JComponent implements KeyListener, ActionListener {

    Image fly = new ImageIcon("src/dragon.png").getImage();

    Image flame = new ImageIcon("src/flame.png").getImage();

    public void paint (Graphics g){
        Graphics2D gr = (Graphics2D) g;
        gr.drawImage(flame, 0,0, 300,150,null);
        gr.drawImage(fly, 200, 200, 300,300,null);
    }


    public static void main(String[] arg) {
        Mal t = new Mal();
        JFrame f =new JFrame("GR test");
        f.setSize(500,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.add(new Mal());
        f.add(t);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}



