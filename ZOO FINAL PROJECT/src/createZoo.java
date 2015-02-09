import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
public static int breedAnimal1;
public static int breedAnimal2;
public static int getMyAnimal=0;
public static int getMyAnimal2=0;
static JFrame introFrame = new JFrame();
private static String picture;

static String combinedName;
static String userAnimalName = "Homie";
static String userCall;
static String userFF;
static String userHabitat;

static ArrayList <CreatedAnimals> myNewAnimals= new ArrayList <CreatedAnimals> ();


	
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
	 String[] initialAnimals = new String[] {"Bald Eagle","Parrot", "Owl", "Flamingo", "Toucan", "Sloth", "Penguin", "Zebra", "Lion"}; 
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
		frame.setSize(350, 100);
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
				case 3: picture = "flamingooo.jpg";
				break;
				case 4: picture = "toucan4.jpg";
				break;
				case 5: picture = "sloth baby.jpg";
				break;
				case 6: picture = "penguin baby.jpg";
				break;
				case 7: picture = "zebra.jpg";
				break;
				case 8: picture = "imgres.jpg";
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
	

	


		//finish button exits program
	
	DoneAddingAnimals.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0) 
			{
			frame.setVisible(false);
			if(frame.isVisible()==false)
					{
					try
						{
						makeNewAnimals(animal);
						} catch (InterruptedException e)
						{
					
						e.printStackTrace();
						}
					}
			
			}
		});
	}
	
	public static void makeNewAnimals(final ArrayList<Animal> animal) throws InterruptedException
		{
		myRowValue = 0;
		myColumnValue = 0;
		
		String[] initialAnimals1 = new String[] {"Bald Eagle","Parrot", "Owl", "Flamingo", "Toucan", "Sloth", "Penguin", "Zebra", "Lion"};
		String[] initialAnimals2 = new String[] {"Bald Eagle","Parrot", "Owl", "Flamingo", "Toucan", "Sloth", "Penguin", "Zebra", "Lion"};
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
		
		final JFrame makeNewAnimalsframe = new JFrame("Select Your Animals to Breed Together:");
		makeNewAnimalsframe.setSize(500, 200);
		makeNewAnimalsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeNewAnimalsframe.setResizable(false);
		makeNewAnimalsframe.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		
		final JComboBox<String> RowDropdown = new JComboBox<String>(rows);
		final JComboBox<String> ColumnDropdown = new JComboBox<String>(columns);
		final JTextField UserAnimalName = new JTextField(30);
		final JLabel nameLabel = new JLabel("NAME YOUR ANIMAL:");
		final JTextField UserCall = new JTextField(30);
		final JLabel callLabel = new JLabel("ANIMAL SOUND:");
		final JTextField UserFunFact = new JTextField(30);
		final JLabel ffLabel = new JLabel("ANIMAL FUN FACTS:");
		final JTextField UserHabitat = new JTextField(30);
		final JLabel habitatLabel = new JLabel("HABITAT:");
		final JLabel rowLabel = new JLabel("ROW:");
		final JLabel colLabel = new JLabel("COLUMN:");
		final JLabel words = new JLabel("ANIMAL:");
		final JLabel ROW = new JLabel("ROW:");
		final JLabel COLUMN = new JLabel("COLUMN:");
		final JLabel animal1 = new JLabel("ANIMAL1:");
		final JComboBox<String> AnimalDropdown1 = new JComboBox<String>(initialAnimals1);
		final JLabel animal2 = new JLabel("ANIMAL2:");
		final JComboBox<String> AnimalDropdown2 = new JComboBox<String>(initialAnimals2);
		JButton breed = new JButton("Breed");
		JButton ExitZoo = new JButton("Finished!"); 
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		makeNewAnimalsframe.add(panel);
		panel.add(animal1);
		panel.add(AnimalDropdown1);
		panel.add(animal2);
		panel.add(AnimalDropdown2);
		panel.add(rowLabel);
		panel.add(RowDropdown);
		panel.add(colLabel);
		panel.add(ColumnDropdown);
		panel.add(nameLabel);
		panel.add(UserAnimalName);
		panel.add(callLabel);
		panel.add(UserCall);
		panel.add(ffLabel);
		panel.add(UserFunFact);
		panel.add(habitatLabel);
		panel.add(UserHabitat);
		
		panel.add(breed);
		panel.add(ExitZoo);
		
		System.out.println("\n\nHere is your current zoo and filled/empty exhibits!\n\n");
		
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
			
			
		Thread.sleep(1000);
		makeNewAnimalsframe.setVisible(true);
		
		UserAnimalName.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				userAnimalName = UserAnimalName.getText(); 
				
			}
		});
		
		UserCall.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				 userCall= UserCall.getSelectedText();
				
			}
		});
		
		UserFunFact.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				userFF = UserFunFact.getText(); 
			}
		});
		
		UserHabitat.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				userHabitat = UserHabitat.getText(); 
			}
		});
		
		//takes row dropdown selection and creates int variable
		
				RowDropdown.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent arg0)
						{
						int myRow = RowDropdown.getSelectedIndex();
						myRowValue = myRow;
						}
					});
				
				ColumnDropdown.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent arg0)
					{
					int myColumn = ColumnDropdown.getSelectedIndex();
					myColumnValue = myColumn;
					}
				});
		
		AnimalDropdown1.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0)
				{
				int mybreed1 = AnimalDropdown1.getSelectedIndex();
				breedAnimal1 = mybreed1;
				}
			});
		
		AnimalDropdown2.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0)
				{
				int mybreed2 = AnimalDropdown2.getSelectedIndex();
				breedAnimal2 = mybreed2;
				}
			});
		
		breed.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0)
				{
				int index = 0; 
				
				String breedAnimal1Name = animal.get(breedAnimal1).getAnimalName();
				String breedAnimal2Name = animal.get(breedAnimal2).getAnimalName();
				
				combinedName = breedAnimal1Name.substring(1,4) + breedAnimal2Name.substring(3, breedAnimal2Name.length());
				 
				myZooGrid[myRowValue][myColumnValue] = combinedName;
				
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
				
					int randomAge = (int) (Math.random()*100);

					
					myNewAnimals.add(new CreatedAnimals(randomAge, combinedName, userAnimalName, userHabitat, userCall, userFF));
					
					index++;
				}
			});
		
		
		
		ExitZoo.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0) 
			{
			makeNewAnimalsframe.setVisible(false);
			if(makeNewAnimalsframe.isVisible()==false)
					{
					getAnimalInfo(animal);
					}
			
			}
		});

		
		
		
	
		
		}
	
	
	
	
	
	
	
	
	
	public static void getAnimalInfo (final ArrayList<Animal> animal)
		{
	
	final JFrame frame2 = new JFrame("Get Your Animal Information");

	frame2.setVisible(true);
	String[] initialAnimals = new String[] {"Bald Eagle","Parrot", "Owl", "Flamingo", "Toucan", "Sloth", "Penguin", "Zebra", "Lion","UserAnimal"};
	String[] createdAnimals = new String[myNewAnimals.size()];
	
	for(int i = 0; i < myNewAnimals.size(); i++)
	{
		
	createdAnimals[i] = myNewAnimals.get(i).getAnimalName();	
	}
	
	frame2.setSize(500, 100);
	frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame2.setResizable(false);
	frame2.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	JButton AnimalInfo = new JButton("Get Info");
	JButton Finished = new JButton("Finished!"); 
	final JComboBox<String> AnimalDropdown2 = new JComboBox<String>(initialAnimals);
	final JComboBox<String> AnimalDropdown3 = new JComboBox<String>(createdAnimals);
	
	final JLabel words = new JLabel("ORIGINAL ANIMAL:");
	final JLabel words2 = new JLabel("CREATED ANIMAL");
	final JPanel panel = new JPanel();
	panel.setBackground(Color.LIGHT_GRAY);
	frame2.add(panel);
	panel.add(words);
	panel.add(AnimalDropdown2);
	panel.add(words2);
	panel.add(AnimalDropdown3);
	panel.add(AnimalInfo);
	panel.add(Finished);
	
	
	
	
	AnimalDropdown2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0)
			{
			int myAnimal = AnimalDropdown2.getSelectedIndex();
			getMyAnimal = myAnimal;
			}
		});
	
	AnimalDropdown3.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent arg0)
		{
		int myAnimal3 = AnimalDropdown3.getSelectedIndex();
		getMyAnimal2 = myAnimal3;
		}
	});
	
	
	AnimalInfo.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0) 
			{
			System.out.println("\n\nHere is your Animal information:");
			
			if(getMyAnimal!=0)
			{ 
			System.out.println("\n\n" + animal.get(getMyAnimal).toString());
			}
			if(getMyAnimal2!=0)
			System.out.println("\n\n" + myNewAnimals.get(getMyAnimal2).toString());
			else if(getMyAnimal==0 && getMyAnimal2==0)
				{
				int random = (int) Math.random()*100;
				if(random <50)
					{
					System.out.println("\n\n" + animal.get(getMyAnimal).toString());
					}
				else
					System.out.println("\n\n" + myNewAnimals.get(getMyAnimal2).toString());
				}
			
			}
		});
	
	
	
			}
}
		





