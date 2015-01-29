import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class pizza extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static String zooName;
	static JFrame frame = new JFrame();
	
	private static final String picture = "zoo-02.jpg";

	public static void main(String[] args)
	    {
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name + " , Welcome to Zoo Creator 3!");
		
		
		zooName = JOptionPane.showInputDialog("What would you like to name your zoo?");
		 JOptionPane.showMessageDialog(frame, zooName + " is a perfect name for this zoo!!");
		try{
		JOptionPane.showMessageDialog(frame, "Here is your new zoo!");
			
		 BufferedImage img = ImageIO.read(new File(picture));
			ImageIcon icon = new ImageIcon(img);
			JLabel label = new JLabel(icon);
			JOptionPane.showMessageDialog(null,label);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
//		 final JFrame frame = new JFrame("JFrame Name");
//			frame.setSize(400, 100);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.setResizable(false);
//			frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
//			
//			String[] preMadeArray = new String[] {"First Option", "Second Option", "Third Option"}; 
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


		      }
	    }
	
