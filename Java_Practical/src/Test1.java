// Write a program in java to create Frame using Association

import javax.swing.*;
public class Test1
{
	JFrame frame;

	Test1()
	{
		frame=new JFrame("first way");
		JButton button = new JButton("Java Practical");

		button.setBounds(200, 150, 90, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Test1();
	}
}
