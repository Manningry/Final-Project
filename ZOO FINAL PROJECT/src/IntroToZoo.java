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
		    return number; 
	    }
	
	}
	
	