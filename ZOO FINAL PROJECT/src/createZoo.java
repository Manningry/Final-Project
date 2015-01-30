import javax.swing.JOptionPane;
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

	
public static void initialZooLayout(int initialExhibits)
{
	
	JOptionPane.showMessageDialog(createZooFrame, "Click 'OK' to see your zoo layout on the console!");
	int zooRows = initialExhibits/5;
	int zooColumns = 5; 
	int counter = 1; 
	
	String[][] myZooGrid = new String[zooRows][zooColumns]; 
	System.out.println("\n");
	
	for(int i = 0; i < zooColumns; i++)
	{
		System.out.print("\t" + i + " \t\t ");
	}
	
	System.out.println("\n");
	
	for(int i = 0; i < zooRows; i++)
		{
		for(int z = 0; z < zooColumns; z++)
			{
			myZooGrid[i][z] = "Exhibit " + counter;
			System.out.print(myZooGrid[i][z] + "\t|\t");
			counter++;
			}
		System.out.println("\n");
		
		}
}

}
