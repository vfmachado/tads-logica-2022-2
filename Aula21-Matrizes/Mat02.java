import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mat02 extends JPanel implements MouseListener {

            
    float[][] m = new float[600][600];
        // for (int i = 0; i < m.length; i++) {
        //     for (int j = 0; j < m[i].length; j++) {
        //         m[i][j] = 1.0f;
        //     }
        // }

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Mat02");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 620);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Mat02 panel = new Mat02();
        frame.add(panel);
        panel.setSize(600, 600);
        panel.setVisible(true);

        panel.addMouseListener(panel);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                g.setColor(new Color(m[i][j], m[i][j], m[i][j]));
                g.fillRect(i, j, 1, 1);
            }
        }

    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
        System.out.println("CLICOU");
        int x = e.getX();
        int y = e.getY();
        m[x][y] = 1.0f;
        repaint();
    }

    public void mouseReleased(MouseEvent e) {}
}