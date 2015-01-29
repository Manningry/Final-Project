import javax.swing.*;

import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.*;

public class IntroToZoo{
	
	private static final String picture = "imgres.jpg";
	
	public static void main(String[] args){
	try{
		
		BufferedImage img = ImageIO.read(new File(picture));
		ImageIcon icon = new ImageIcon(img);
		JLabel label = new JLabel(icon);
		JOptionPane.showMessageDialog(null,label);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
	
	
}




