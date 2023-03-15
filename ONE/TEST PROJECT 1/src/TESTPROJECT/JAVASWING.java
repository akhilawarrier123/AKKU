package TESTPROJECT;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JAVASWING {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//frame.setVisible(true);
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
		   // System.out.println(t1);
	        t2=new JTextField("Enter the Time");  
			t2.setBounds(180,60, 200,30); 
			t3=new JTextField("Type the Contact number");  
			t3.setBounds(180,110, 200,30); 
	        frame.add(t1); frame.add(t2);frame.add(t3);  
			frame.setSize(400,400);  
		    frame.setLayout(null);
		    frame.setVisible(true); 
				   
				 				   
			
			
			
			
			
			//JLabel passwordLabel = new JLabel("Password");
			//passwordLabel.setBounds(120, 100, 100, 20);

			//Button button = new Button("Total Price");
			//button.setBounds(400, 135, 100, 20);
			
			
			
			
		//	JLabel loginLabel = new JLabel("Value will change");
			//loginLabel.setBounds(200, 200, 180, 20);
			//button.addActionListener(new ActionListener() {

				//public void actionPerformed(ActionEvent e) {
				//System.out.println(admin.getText());	
					//if(admin.getText()!=null)
					//{
						System.out.println("Welcome Logic");
						
						//loginLabel.setText("Login Successful");
						
						
					//}

					//if(admin.getText()=="admin" && password.getText()==("admin"))
				//	{
						//System.out.println("Welcome Logic");
						
						//loginLabel.setText("Login Successful");
						
						
					//}

				//}
			//});

			//https://stackoverflow.com/questions/22506331/simple-dropdown-menu-in-java
			//frame.add(cb);
			//frame.add(admin);
		//	frame.add(ContactNumber);
		//	frame.add(VehicleLabel);
		//	frame.add(VehicleTime);
			//frame.add(button);
	      //  frame.add(loginLabel);
	      //  frame.add(VehicleType);
	        
			
	        
	        
	        //frame.setSize(1000, 1000);
			
	        
	        frame.setLayout(null);
			
	        
	        frame.setVisible(true);

		}


	}


