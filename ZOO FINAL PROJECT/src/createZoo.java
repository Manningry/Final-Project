import javax.swing.ImageIcon;
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
public static int myRowValue;
public static int myColumnValue;
public static int myAnimalValue;
static JFrame introFrame = new JFrame();
private static String picture;


	
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
	

	 
	 String[] initialAnimals = new String[] {"Bald Eagle","Parrot", "Owl", "Sloth", "Penguin", "Zebra", "Lion"}; 
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
		frame.setSize(350, 200);
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
		panel.setBackground(Color.BLACK);
		frame.add(panel);
		panel.add(words);
		panel.add(AnimalDropdown);
		panel.add(ROW);
		panel.add(RowDropdown);
		panel.add(COLUMN);
		panel.add(ColumnDropdown);
		panel.add(AddAnimal);
		panel.add(DoneAddingAnimals);
		
		//takes row dropdown selection and creates int variable
		
		RowDropdown.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0)
				{
				int myRow = RowDropdown.getSelectedIndex();
				myRowValue = myRow;
				}
			});
		
		//takes animal dropdown selection and creates int variable
		
		AnimalDropdown.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0)
			{
			int myAnimal = AnimalDropdown.getSelectedIndex();
			myAnimalValue = myAnimal;
			}
		});
		
		//takes animal dropdown selection and creates int variable
		
		ColumnDropdown.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0)
			{
			int myColumn = ColumnDropdown.getSelectedIndex();
			myColumnValue = myColumn;
			}
		});
		
		//finish button exits program
		
		DoneAddingAnimals.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0) 
			{
			System.exit(0);
			}
		});
		
		//Enter button takes row variable, column variable, animal variable and uses index
		//of ArrayList to select animal and assigns it to myZooGrid [][] location
		
		AddAnimal.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0) 
				{
				
				myZooGrid[myRowValue][myColumnValue] = animal.get(myAnimalValue).getAnimalName();
				
				switch(myAnimalValue)
				{
				case 0: picture = "bald eagle.jpg";
				break;
				case 1: picture = "parrot.jpg";
				break;
				case 2:picture = "Eagle_Owl_face.jpg";
				break;
				case 3: picture = "sloth baby.jpg";
				break;
				case 4: picture = "penguin baby.jpg";
				break;
				case 5: picture = "zebra.jpg";
				break;
				case 6: picture = "imgres.jpg";
				break;
				}
				
				
				try
				{
				JOptionPane.showMessageDialog(introFrame, "Click 'OK' to see your new animal!");
				BufferedImage img = ImageIO.read(new File(picture));
				ImageIcon icon = new ImageIcon(img);
				JLabel label = new JLabel(icon);
				JOptionPane.showMessageDialog(null,label);
				}
			
			catch(IOException e)
				{
				e.printStackTrace();
				}

				
				
				System.out.println("\n\n\n\nHere is your updated zoo!\n\n\n");
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
	

	}


}
