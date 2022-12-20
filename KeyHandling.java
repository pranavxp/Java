package pranavlab;
import java.awt.*;    
import java.awt.event.*;
public class KeyHandling extends Frame implements KeyListener
{
 Label Label;    
 TextArea Area;    
 KeyHandling()
  {    
    Label = new Label();  
    Label.setBounds (20, 50, 100, 20);    
    Area = new TextArea();    
    Area.setBounds (40, 80, 400, 400);    
    Area.addKeyListener(this);  
    add(Label);  
    add(Area);    
    setSize (500, 500);    
    setLayout (null);    
    setVisible (true);    
 addWindowListener (new WindowAdapter()
   {
   public void windowClosing(WindowEvent e)
    {
     System.exit(0);
   }
    });
  }    
   public void keyPressed (KeyEvent event)
     {    
       Label.setText ("KEY PRESSED");
       System.out.println("KEY IS PRESSSED.");
     }    
   public void keyReleased (KeyEvent e)
    {    
	   Label.setText ("KEY RELEASED");
      System.out.println("KEY IS RELEASED.");
    }
   public void keyTyped (KeyEvent e)
     {    
	   Label.setText ("KEY TYPED");  
       System.out.println("KEY IS TYPED.");
     }    
  public static void main(String[] args)
    {
    new KeyHandling();
   }
 } 
