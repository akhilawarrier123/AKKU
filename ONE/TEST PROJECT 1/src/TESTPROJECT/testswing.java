package TESTPROJECT;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class testswing {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("CAR PARKING");
		frame.setSize(1000, 1000);
	    frame.setLayout(null);
	    frame.setVisible(true);

	
	

		
		String[] choices = { "CAR","TRUCK", "BUS","TRAILER","SCOOTER","HEAVY DUTY"};

	     JComboBox<String> cb = new JComboBox<String>(choices);
	     cb.setBounds(180,160, 200,30);
	     frame.add(cb);
	     

			JLabel VehicleLabel = new JLabel("Vehicle Number");
			VehicleLabel.setBounds(10, 10, 100, 20);
			JLabel VehicleTime = new JLabel("Entry time");
			VehicleTime.setBounds(10, 50, 250, 50);
			JLabel ContactNumber = new JLabel("Enter the Contact number");
			ContactNumber.setBounds(10, 100, 250, 50);
			JLabel VehicleType = new JLabel("Enter the Vehicle Type");
			VehicleType .setBounds(10, 150, 250, 50);
			frame.add(ContactNumber);
			frame.add(VehicleLabel);
			frame.add(VehicleTime);
			frame.add(VehicleType);

			  
				     
	        JTextField t1,t2,t3;  
		    t1=new JTextField("Type the corresponding number");  
		    
		    t1.setBounds(180,10,200,30);  
		   
	        t2=new JTextField("Enter the Time");  
			t2.setBounds(180,60, 200,30); 
			t3=new JTextField("Type the Contact number");  
			t3.setBounds(180,110, 200,30); 
	        frame.add(t1); frame.add(t2);frame.add(t3);  
			frame.setSize(400,400);  
		    frame.setLayout(null);
		    frame.setVisible(true); 
		    
		    
		   JButton jButton = new JButton("save");
		   jButton.setBounds(250, 250, 100, 30);
		   frame.add(jButton, "save");
		  // jButton.addActionListener(new ActionListener());
		   jButton.setVisible(true);
				 			
			
	        
	        
	        frame.setSize(1000, 1000);
			
	        
	        frame.setLayout(null);
			
	        
	        frame.setVisible(true);

		}


	}



