package pranavlab;
import java.awt.*;
import java.awt.event.*;	
public class MouseHandling extends Frame implements MouseListener,MouseMotionListener
{
		public MouseHandling()
		{
			addMouseListener(this);
			addMouseMotionListener(this);
			setSize(500,500);
			setVisible(true);
			addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent event)
					{
						System.exit(0);
					}
				});
		}
		public void mousePressed(MouseEvent e)
		{
			setBackground(Color.red);
			System.out.println("MOUSE IS PRESSED");
		}
		public void mouseReleased(MouseEvent e)
		{
			setBackground(Color.blue);
			System.out.println("MOUSE IS RELEASED");
		}
		public void mouseClicked(MouseEvent e)
		{
			setBackground(Color.green);
			System.out.println("MOUSE IS CLICKED");
		}
		public void mouseEntered(MouseEvent e)
		{
			setBackground(Color.cyan);
			System.out.println("MOUSE HAS ENTERED");
		}
		public void mouseExited(MouseEvent e)
		{
			setBackground(Color.magenta);
			System.out.println("MOUSE HAS EXITED");
			setTitle("MOUSE EXITED");
		}
		public void mouseMoved(MouseEvent e)
		{
			System.out.println("MOUSE MOVED");
			setTitle("MOUSE MOVED");
		}
		public void mouseDragged(MouseEvent e)
		{
			setBackground(Color.red);
			System.out.println("MOUSE DRAGGED");
			Graphics g=getGraphics();
			g.fillOval(e.getX(),e.getY(),20,20);
		}
		public static void main(String[] args)
		{
			new  MouseHandling();
		}
}