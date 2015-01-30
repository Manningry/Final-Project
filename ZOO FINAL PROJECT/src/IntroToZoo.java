import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.Scanner;

public class IntroToZoo extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static JFrame introFrame = new JFrame();
	static Scanner UserInput = new Scanner(System.in);
	
	private static final String picture = "zoo-02.jpg";
	
	
	//Intro with name, zoo name, and exhibits 
	
	

	public static int createInitialZoo()
	    {
		String name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(introFrame, "Hi, " + name + " , Welcome to Zoo Creator 3!");
		
		String zooName = JOptionPane.showInputDialog("What would you like to name your zoo?");
		 JOptionPane.showMessageDialog(introFrame, zooName + " is a perfect name for this zoo!!");
		
		 try
			{
			JOptionPane.showMessageDialog(introFrame, "Click 'OK' to see your new zoo!");
			BufferedImage img = ImageIO.read(new File(picture));
			ImageIcon icon = new ImageIcon(img);
			JLabel label = new JLabel(icon);
			JOptionPane.showMessageDialog(null,label);
			}
		
		catch(IOException e)
			{
			e.printStackTrace();
			}
		
	    String zooSize = JOptionPane.showInputDialog("How many exhibits would you like to start off with? \n (Please enter a number divisible by 5)");
	    int number = Integer.parseInt(zooSize);
//	    int ans = Integer.parseInt( (String) JOptionPane.showInputDialog(introFrame, zooSize,
//	            "Text",
//	            JOptionPane.INFORMATION_MESSAGE,
//	            null,
//	            null,
//	            "[sample text to help input]"));
	    return number; 
	    }
	
	}
	
	
	
	
	    
	    
	    
	    
	    
	    
	    
//		 final JFrame frame = new JFrame("Zoo Size");
//			frame.setSize(400, 200);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.setResizable(false);
//			frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
//			
//			String[]  = new String[] {"First Option", "Second Option", "Third Option"}; 
//			JButton button = new JButton("Enter");
//			final JComboBox<String> dropdown = new JComboBox<String>(preMadeArray);
//			final TextField txtfield = new TextField(20);
//			final JLabel words = new JLabel("Text");
//			
//			final JPanel panel = new JPanel();
//			panel.setBackground(Color.red);
//			frame.add(panel);
//			panel.add(words);
//			panel.add(dropdown);
//			panel.add(txtfield);
//			panel.add(button);
//			button.addActionListener(new ActionListener()
//				{
//				public void actionPerformed(ActionEvent arg0) 
//					{
//					System.out.println(dropdown.getSelectedItem());
//					System.out.println(dropdown.getSelectedIndex());
//					System.out.println(txtfield.getText());
//					}
//				});
//			
//			frame.setVisible(true);


		      
	    
	




