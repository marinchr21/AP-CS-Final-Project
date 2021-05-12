import javax.swing.*;
import java.awt.Window;
import java.awt.event.*;
import java.util.*;


public class AquariumBuilder {
	
	
	
private String tankSize;
private String tankType; 
	
	
public AquariumBuilder() {
	
	tankSize = " ";
	tankType = " ";	

} //close public Aquarium Builder

	public AquariumBuilder(String tankSize, String tankType) {

	this.tankSize = tankSize;
	this.tankType = tankType;
	}

	
	public void setTankSize(String tankSize) {
	  this.tankSize = tankSize;
	}
	public void setTankType(String tankType) {
	  this.tankType = tankType;
	}

	
	public String getTankSize() {
	  return tankSize;
	}
	public String getTankType() {
	  return tankType;
	}
	

	
	public void BuilderSelect() {

		//creates new frame and Titles Headers
		JFrame f7 = new JFrame("Aquarium Builder");

		//Menu
		JMenu menu;  
			JMenuItem i1;  
			JMenuBar mb=new JMenuBar();  
			menu = new JMenu("Menu");    
			i1 = new JMenuItem("Home");  
			menu.add(i1);
			mb.add(menu);  
			f7.setJMenuBar(mb);  
				
			//menu home button
			i1.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					f7.setVisible(false);
					Home home = new Home();
				  }  
				});
		
		//create Labels on each page
		JLabel l1 = new JLabel("Select a Tank Size");
		l1.setBounds(25,10,200,30);  
		f7.add(l1); 
				
		
		//string array for combo box drop down
		String size[]={"2.5 Gallon", "5 Gallon", "10 Gallon","20 Gallon Tall","20 Gallon Wide","29 Gallon",
				"40 Gallon Long","40 Gallon Breeder", "50 Gallon", 
				"55 Gallon", "65 Gallon", "75 Gallon Wide", "75 Gallon Tall",
				"90 Gallon", "125 Gallon Long", "125 Gallon Wide",
				"150 Gallon Long", "180 Gallon Long"};        
		
		//creates combo box
	    JComboBox cb = new JComboBox(size);    
	    cb.setBounds(25,50,250,30);    
	    f7.add(cb);

	    
	    
		//create Labels on each page
		JLabel l2 = new JLabel("Select a Water Type");
		l2.setBounds(25,90,200,30);  
		f7.add(l2); 
		
		String type [] = {"Freshwater", "Low Tech Planted (Freshwater)", "High Tech Planted (Freshwater)",
				"Saltwater (Fish Only)", "Brackish", "Mixed Reef", "Soft Coral", "LPS Coral", "SPS Coral"};
		
		JComboBox cb2 = new JComboBox(type);
		cb2.setBounds(25, 130, 250, 30);	
		f7.add(cb2);
	    

	    
	  //enter button
	    JButton b1 = new JButton("Enter");  
	    b1.setBounds(25, 160, 150, 30);  
	    f7.add(b1);
	    
	    //enter button action listener
	    b1.addActionListener(new ActionListener() {  
		    public void actionPerformed(ActionEvent e) {       
		    	
		    	//sets tankSize to selected item from drop down
		    	tankSize = (String) cb.getItemAt(cb.getSelectedIndex());  
		    	
		    	tankType = (String) cb2.getItemAt(cb2.getSelectedIndex());
		    		    	
		    	//prints tankSize and tankType
		    	System.out.println("Tank Size: " + tankSize);
		        System.out.println("Tank Type: " + tankType);
		        
		    	if (tankType == "Freshwater") {
		            JCheckBox c1 = new JCheckBox("African Cichlids");  
		            c1.setBounds(25, 190, 200, 50);  
		            JCheckBox c2 = new JCheckBox("South American Cichlids");  
		            c2.setBounds(25, 210, 200, 50); 
		            JCheckBox c3 = new JCheckBox("Monster Fish");  
		            c3.setBounds(25, 230, 200, 50);
		            JCheckBox c4 = new JCheckBox("Tetras");  
		            c4.setBounds(25, 250, 200, 50);
		            JCheckBox c5 = new JCheckBox("Gouramis");  
		            c5.setBounds(25, 270, 200, 50);  
		            f7.add(c1); f7.add(c2); f7.add(c3); f7.add(c4); f7.add(c5);
		    	}
			        
		        
		        }  
		     }); //close b1 action listener
	    	    
		//set size of first page
		f7.setSize(400, 500);
		f7.setLayout(null);
		// make the frame visible
		f7.setVisible(true);
	  
	}// close public void BuilderSelect
	

	
	
	
} //close public class AquariumBuilder

	
