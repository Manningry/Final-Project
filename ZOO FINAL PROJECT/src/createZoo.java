import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.Scanner;



public class createZoo
{

static JFrame createZooFrame = new JFrame();

static String[][]myZooGrid = new String[0][0];
static int zooRows;
static int zooColumns;
static int counter = 1; 
static int counter2 = 0; 


	
public static void createZooLayoutDimensions(int initialExhibits)
{
	
//Print out initial Zoo Layout for User

	JOptionPane.showMessageDialog(createZooFrame, "Click 'OK' to see your zoo layout on the console!");
	zooRows = initialExhibits/5;
	zooColumns = 5; 
	counter = 1; 
	counter2 = 0; 
	
	myZooGrid = new String[zooRows][zooColumns]; 
	System.out.println("\n");
	
	for(int i = 0; i < zooColumns; i++)
	{
		System.out.print("\t" + i + " \t\t ");
	}
	
	System.out.println("\n  ______________________________________________________________________________________________________________");
	
	for(int i = 0; i < zooRows; i++)
		{
		for(int z = 0; z < zooColumns; z++)
			{
			if(z==0)
				{
				System.out.print(counter2 + "|  ");
				}
			myZooGrid[i][z] = "Exhibit " + counter;
			System.out.print(myZooGrid[i][z] + "\t|\t");
			counter++;
			}
		counter2++;
		System.out.println("\n |______________|_______________________|_______________________|_______________________|_______________________|");
		
		}
}

public static void addAnimals()
	{
	
	 final JFrame frame = new JFrame("Select Your Animals");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		
		String[] iii = new String[] {"Ant", "Elephant", "Lion", "Hippopatamus"}; 
		JButton button = new JButton("Enter");
		final JComboBox<String> dropdown = new JComboBox<String>(iii);
		final TextField txtfield = new TextField(20);
		final JLabel words = new JLabel("ANIMALS:");
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		panel.add(words);
		panel.add(dropdown);
		panel.add(txtfield);
		panel.add(button);
		button.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0) 
				{
				System.out.println(dropdown.getSelectedItem());
				System.out.println(dropdown.getSelectedIndex());
				System.out.println(txtfield.getText());
				}
			});
		
		frame.setVisible(true);
	
	
	
	myZooGrid[0][0] = Animal.zooAnimals.get(0).getName();
	
	
	System.out.println("\n\n\n\nHere is your updated zoo!\n");
	counter2 = 0;
	for(int i = 0; i < zooColumns; i++)
		{
			System.out.print("\t" + i + " \t\t ");
		}
		
		System.out.println("\n  ______________________________________________________________________________________________________________");
		
		for(int i = 0; i < zooRows; i++)
			{
			for(int z = 0; z < zooColumns; z++)
				{
				if(z==0)
					{
					System.out.print(counter2 + "|  ");
					}
				System.out.print(myZooGrid[i][z] + "\t|\t");
				counter++;
				}
			counter2++;
			System.out.println("\n |______________|_______________________|_______________________|_______________________|_______________________|");
			
			}
	
	}


}
