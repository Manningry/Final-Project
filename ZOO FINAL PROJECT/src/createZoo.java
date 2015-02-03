import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
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

public static void addAnimals(final ArrayList<Animal> animal)
	{
	

	 
	 String[] initialAnimals = new String[] {"Animal", "Owl", "Lion"}; 
		String[] rows = new String[zooRows]; 
		String[] columns = new String[zooColumns];
		
		for(int i = 0; i < zooRows; i++)
			{
			rows[i] = ""+i+""; 
			}
		
		for(int i = 0; i < 5; i++)
			{
			columns[i] = ""+i+"";
			}
	 
		final JFrame frame = new JFrame("Select Your Animals");
		frame.setSize(320, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		JButton AddAnimal = new JButton("Enter");
		JButton DoneAddingAnimals = new JButton("Finished!"); 
		final JComboBox<String> AnimalDropdown = new JComboBox<String>(initialAnimals);
		final JComboBox<String> RowDropdown = new JComboBox<String>(rows);
		final JComboBox<String> ColumnDropdown = new JComboBox<String>(columns);
		final JLabel words = new JLabel("ANIMAL:");
		final JLabel ROW = new JLabel("ROW:");
		final JLabel COLUMN = new JLabel("COLUMN:");
		final JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		panel.add(words);
		panel.add(AnimalDropdown);
		panel.add(ROW);
		panel.add(RowDropdown);
		panel.add(COLUMN);
		panel.add(ColumnDropdown);
		panel.add(AddAnimal);
		panel.add(DoneAddingAnimals);
		
//		COLUMN.addActionListener(new ActionListener()
//			{
//			public void actionPerformed(ActionEvent arg0)
//				{
//				
//				}
//			
//			});
		
		AddAnimal.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0) 
				{
				myZooGrid[0][0] = animal.get(0).getName();
				myZooGrid[0][1] = animal.get(1).getName();
				myZooGrid[3][0] = animal.get(2).getName();
				myZooGrid[2][0] = animal.get(3).getName();
				myZooGrid[2][1] = animal.get(4).getName();
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
			});
		
		frame.setVisible(true);
	
	
	
	myZooGrid[0][0] = animal.get(0).toString();
	myZooGrid[0][1] = animal.get(1).toString();
	myZooGrid[3][0] = animal.get(2).toString();
	myZooGrid[2][0] = animal.get(3).toString();
	myZooGrid[2][1] = animal.get(4).toString();
	
	
	
	
	
	
	
	
	
//	System.out.println("\n\n\n\nHere is your updated zoo!\n");
//	counter2 = 0;
//	for(int i = 0; i < zooColumns; i++)
//		{
//			System.out.print("\t" + i + " \t\t ");
//		}
//		
//		System.out.println("\n  ______________________________________________________________________________________________________________");
//		
//		for(int i = 0; i < zooRows; i++)
//			{
//			for(int z = 0; z < zooColumns; z++)
//				{
//				if(z==0)
//					{
//					System.out.print(counter2 + "|  ");
//					}
//				System.out.print(myZooGrid[i][z] + "\t|\t");
//				counter++;
//				}
//			counter2++;
//			System.out.println("\n |______________|_______________________|_______________________|_______________________|_______________________|");
//			
//			}
//	
	}


}
