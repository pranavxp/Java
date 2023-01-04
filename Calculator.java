package pranavlab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener 
{
	JFrame f;
	JTextField txt;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,div,mul,sub,add,eq,del,clr;
	static double a=0,b=0,result=0;
	static int operator=0;
	Calculator(){
		f=new JFrame("Calculator");
		
		txt=new JTextField();
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		div=new JButton("/");
		mul=new JButton("*");
		sub=new JButton("-");
		add=new JButton("+");
		eq=new JButton("=");
		clr=new JButton("C");
		txt.setBounds(30,40,250,40);
		b1.setBounds(40,100,50,40);
		b2.setBounds(100,100,50,40);
		b3.setBounds(160,100,50,40);
		div.setBounds(220,250,50,40);
		b4.setBounds(40,150,50,40);
		b5.setBounds(100,150,50,40);
		b6.setBounds(160,150,50,40);
		mul.setBounds(220,200,50,40);
		b7.setBounds(40,200,50,40);
		b8.setBounds(100,200,50,40);
		b9.setBounds(160,200,50,40);
		sub.setBounds(220,150,50,40);
		b0.setBounds(100,250,50,40);
		eq.setBounds(160,250,50,40);
		add.setBounds(220,100,50,40);
		clr.setBounds(40,250,50,40);
		f.add(txt);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(div);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(mul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(sub);
		f.add(b0);
		f.add(eq);
		f.add(add);
		f.add(clr);
		f.setLayout(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(320,350);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		add.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		sub.addActionListener(this);
		eq.addActionListener(this);
		clr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1)
		txt.setText(txt.getText().concat("1"));
		if(e.getSource()==b2)
		txt.setText(txt.getText().concat("2"));
		if(e.getSource()==b3)
		txt.setText(txt.getText().concat("3"));
		if(e.getSource()==b4)
		txt.setText(txt.getText().concat("4"));
		if(e.getSource()==b5)
		txt.setText(txt.getText().concat("5"));
		if(e.getSource()==b6)
		txt.setText(txt.getText().concat("6"));
		if(e.getSource()==b7)
		txt.setText(txt.getText().concat("7"));
		if(e.getSource()==b8)
		txt.setText(txt.getText().concat("8"));
		if(e.getSource()==b9)
		txt.setText(txt.getText().concat("9"));
		if(e.getSource()==b0)
		txt.setText(txt.getText().concat("0"));
		if(e.getSource()==add)
		{
			a=Double.parseDouble(txt.getText());
			operator=1;
			txt.setText("");
		}
		if(e.getSource()==sub)
		{
			a=Double.parseDouble(txt.getText());
			operator=2;
			txt.setText("");
		}
		if(e.getSource()==mul)
		{
			a=Double.parseDouble(txt.getText());
			operator=3;
			txt.setText("");
		}
		if(e.getSource()==div)
		{
			a=Double.parseDouble(txt.getText());
			operator=4;
			txt.setText("");
		}
		if(e.getSource()==eq)
		{
			b=Double.parseDouble(txt.getText());
			switch(operator)
			{
				case 1: result=a+b;
						break;
				case 2: result=a-b;
						break;
				case 3: result=a*b;
						break;
				case 4: result=a/b;
						break;
				default: result=0;
			}
			txt.setText(""+result);
		}
		if(e.getSource()==clr)
			txt.setText("");
		if(e.getSource()==del)
		{
			String s=txt.getText();
			txt.setText("");
			for(int i=0;i<s.length()-1;i++)
			txt.setText(txt.getText()+s.charAt(i));
		}
	}
public static void main(String[] args)
{
			new Calculator();
		}
}