//Write a program in java to create Frame  Inheritance using Swing

import javax.swing.*;

// inheriting JFrame
public class Test2 extends JFrame
{
	JFrame frame;
	Test2()
	{
		setTitle("Inheritance using Swing");
		JButton button = new JButton("Java Practical");

		button.setBounds(165, 135, 115, 55);
		add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Test2();
	}
}
