import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame();
		Gameplay gameplay = new Gameplay();
		
		obj.setBounds(10,10, 905, 700);
		obj.setBackground(Color.blue);
		obj.setVisible(true);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
		

	}

}
