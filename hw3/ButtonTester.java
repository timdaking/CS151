package q3;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class ButtonTester 

{
    public static void main (String[] args) 
    {  
    	JFrame frame = new JFrame();
    	
    	JButton red = new JButton("Red");
    	JButton green = new JButton("Green");
    	JButton blue = new JButton("Blue");
    	
    	frame.setLayout(new FlowLayout());
    	
    	frame.add(red);
    	frame.add(green);
    	frame.add(blue);
    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.pack();
    	frame.setVisible(true);
    	
    }
    
} 