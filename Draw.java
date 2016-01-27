package Draw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Draw extends JPanel{
	
	private static int x = 300;
	
	 public Draw(){

        JFrame frame = new JFrame("New frame");
        frame.setLocation(300,100);
        frame.setMinimumSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.getContentPane().add(this);

        frame.pack();
        frame.setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
		g.fillRect(11, 31, 99, 19);

		g.setColor(Color.BLUE);
		g.fillRect(201, 201, 59, 59);

		g.setColor(Color.GREEN);
		g.fillOval(x, 109, 59, 59);
    }

    public static void main(String[] args) throws Exception{
        Draw htd = new Draw();

        Thread.sleep(5000);
        System.out.println("Wake up");

        x = 600;
        htd.repaint();
    }

}
