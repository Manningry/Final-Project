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
	myZooGrid[0][1]= "Ant";
	
	System.out.println("Here is your updated zoo!");
	
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
