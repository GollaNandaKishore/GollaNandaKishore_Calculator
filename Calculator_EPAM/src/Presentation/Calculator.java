package Presentation;
import java.awt.*;
import javax.swing.*;
import BussinessLayer.*;
import Link.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
	Arthematic obj=new Arthematic();
	DataLink obj1=new DataLink();
	public double z,q;
	public double result;
	public int ch;
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
	JTextField t1,t2;
	Calculator()
	{
	f=new JFrame("CALCULATOR");
	f.setLayout(new BorderLayout());
	JPanel x=new JPanel();
	x.setVisible(true);
	x.setLayout(new GridLayout(6,3,20,20));
	f.setVisible(true);
	f.setSize(400,400);

	b1=new JButton("1");
	b2=new JButton("2");
	b3=new JButton("3");
	b4=new JButton("4");
	b5=new JButton("5");
	b6=new JButton("6");
	b7=new JButton("7");
	b8=new JButton("8");
	b9=new JButton("9");
	b10=new JButton("0");
	b11=new JButton("+");
	b12=new JButton("-");
	b13=new JButton("*");
	b14=new JButton("/");
	b15=new JButton("RESET");
	b16=new JButton("Cancel");
	b17=new JButton("=");
	b18=new JButton("%");
	t1=new JTextField(500);
	t2=new JTextField("                            CALCULATOR");
	b1.setFont(new Font("cooper",Font.BOLD,25));
	b2.setFont(new Font("cooper",Font.BOLD,25));
	b3.setFont(new Font("cooper",Font.BOLD,25));
	b4.setFont(new Font("cooper",Font.BOLD,25));
	b5.setFont(new Font("cooper",Font.BOLD,25));
	b6.setFont(new Font("cooper",Font.BOLD,25));
	b7.setFont(new Font("cooper",Font.BOLD,25));
	b8.setFont(new Font("cooper",Font.BOLD,25));
	b9.setFont(new Font("cooper",Font.BOLD,25));
	b10.setFont(new Font("cooper",Font.BOLD,25));
	b11.setFont(new Font("cooper",Font.BOLD,25));
	b12.setFont(new Font("cooper",Font.BOLD,25));
	b13.setFont(new Font("cooper",Font.BOLD,25));
	b14.setFont(new Font("cooper",Font.BOLD,25));
	b15.setFont(new Font("cooper",Font.BOLD,25));
	b16.setFont(new Font("cooper",Font.BOLD,25));
	b17.setFont(new Font("cooper",Font.BOLD,25));
	b18.setFont(new Font("cooper",Font.BOLD,25));
	t2.setFont(new Font("casteller",Font.BOLD,60));
	x.add(b1);
	x.add(b2);
	x.add(b3);
	x.add(b4);
	x.add(b5);
	x.add(b6);
	x.add(b7);
	x.add(b8);
	x.add(b9);
	x.add(b11);
	x.add(b10);
	x.add(b12);
	x.add(b13);
	x.add(b18);
	x.add(b14);
	x.add(b15);
	x.add(b17);
	x.add(b16);
	f.add(t2,BorderLayout.NORTH);
	f.add(x,BorderLayout.SOUTH);
	f.add(t1,BorderLayout.WEST);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
	b17.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource().equals(b1))
	{
	t1.setText(t1.getText().concat("1"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b2))
	{
	t1.setText(t1.getText().concat("2"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b3))
	{
	t1.setText(t1.getText().concat("3"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b4))
	{
	t1.setText(t1.getText().concat("4"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b5))
	{
	t1.setText(t1.getText().concat("5"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b6))
	{
	t1.setText(t1.getText().concat("6"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b7))
	{
	t1.setText(t1.getText().concat("7"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b8))
	{
	t1.setText(t1.getText().concat("8"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b9))
	{
	t1.setText(t1.getText().concat("9"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b10))
	{
	t1.setText(t1.getText().concat("0"));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	if(ae.getSource().equals(b15))
	{
	t1.setText("");
	}
	if(ae.getSource().equals(b11))
	{
	z=(double)Integer.parseInt(t1.getText());
	t1.setText("");
	ch=1;
	}
	if(ae.getSource().equals(b12))
	{
	z=(double)Integer.parseInt(t1.getText());
	ch=2;
	t1.setText("");

	}
	if(ae.getSource().equals(b13))
	{
	z=(double)Integer.parseInt(t1.getText());
	t1.setText("");
	ch=3;
	}
	if(ae.getSource().equals(b14))
	{
	z=(double)Integer.parseInt(t1.getText());
	t1.setText("");
	ch=4;
	}
	if(ae.getSource().equals(b18))
	{
	z=(double)Integer.parseInt(t1.getText());
	t1.setText("");
	ch=5;
	}
	if(ae.getSource().equals(b17))
	{
	q=(double)Integer.parseInt(t1.getText());
	if(ch==1)
	{
		result=obj.add(z,q);
		obj1.connected(z,q,"+",result);
	}
	else if(ch==2)
	{
		result=obj.sub(z,q);
		obj1.connected(z,q,"-",result);
	}
	else if(ch==3)
	{
		result=obj.mul(z,q);
		obj1.connected(z,q,"*",result);
	}
	else if(ch==4)
	{
		result=obj.div(z,q);
		obj1.connected(z,q,"/",result);
	}
	t1.setText(String.valueOf(result));
	t1.setFont(new Font("cooper",Font.BOLD,25));
	}
	else if(ae.getSource().equals(b16))
	{
	f.setVisible(false);
	}
	}
	public static void main(String aa[])
	{
		new Calculator();
	}
}
