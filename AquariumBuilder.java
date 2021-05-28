import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class AquariumBuilder {
	
	
	
private String tankSize;
private String tankType; 
	
	
public AquariumBuilder() {
	
	tankSize = " ";
	tankType = "xx";	

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
		    	tankSize = (String)cb.getItemAt(cb.getSelectedIndex());  
		    	
		    	tankType = (String)cb2.getItemAt(cb2.getSelectedIndex());
		    		    	
		    	//prints tankSize and tankType
		    	System.out.println("Tank Size: " + tankSize);
		        System.out.println("Tank Type: " + tankType);
		        
		        
		        f7.setVisible(false); //hides frame
		        inhabitants(); //calls inhabitants
		        
		        }  
		     }); //close b1 action listener
	    	    
		//set size of page
		f7.setSize(400, 500);
		f7.setLayout(null);
		// make the frame visible
		f7.setVisible(true);
	  
	}// close public void BuilderSelect
	
	
	
	public void inhabitants() {
		
		//creates new frame and Titles Headers
				JFrame f8 = new JFrame("Aquarium Builder");

				//Menu
				JMenu menu;  
					JMenuItem i1;  
					JMenuBar mb=new JMenuBar();  
					menu = new JMenu("Menu");    
					i1 = new JMenuItem("Home");  
					menu.add(i1);
					mb.add(menu);  
					f8.setJMenuBar(mb);  
						
					//menu home button
					i1.addActionListener(new ActionListener(){  
						public void actionPerformed(ActionEvent e){  
							f8.setVisible(false);
							Home home = new Home();
						  }  
						});
					
					
			//enter button
			JButton b1 = new JButton("Enter");  
			b1.setBounds(25, 230, 150, 30);  
			f8.add(b1);
		

		
    	if (tankType == "Freshwater") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("African Cichlids");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("South American Cichlids");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Monster Fish");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Tetras");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Gouramis");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
            
            //enter button action listener
		    b1.addActionListener(new ActionListener() {  
			    public void actionPerformed(ActionEvent e) {       
			    	
			    	f8.setVisible(false);
			    	compatibility();
			    
			        }  
			     }); //close b1 action listener	
		    
    	}
    	
    	else if (tankType == "Low Tech Planted (Freshwater)") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Tetras");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("South American Cichlids");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Plecos");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Guppies");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Embers");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
    	
    	else if (tankType == "High Tech Planted (Freshwater)") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Tetras");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("South American Cichlids");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Plecos");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Guppies");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Embers");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
    	
    	else if (tankType == "Saltwater (Fish Only)") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Trigger Fish");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("Tangs");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Blennies");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Dart Fish");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Clownfish");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
	    
    	
    	else if (tankType == "Brackish") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Mollies");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("Archerfish");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Pufferfish");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Beloniformes");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Gobies");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
    	
    	else if (tankType == "Mixed Reef") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Dwarf Angelfish");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("Tangs");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Blennies");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Dart Fish");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Clownfish");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
    	
    	else if (tankType == "Soft Coral") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Dwarf Angelfish");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("Tangs");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Blennies");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Dart Fish");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Clownfish");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
    	
    	else if (tankType == "LPS Coral") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Dwarf Angelfish");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("Tangs");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Blennies");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Dart Fish");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Clownfish");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
    	
    	
    	else if (tankType == "SPS Coral") {
    		
    		//create Labels on each page
    		JLabel l2 = new JLabel("Select Applicable Fish/ Inverts");
    		l2.setBounds(25,30,200,30);  
    		f8.add(l2);
    		
            JCheckBox c1 = new JCheckBox("Dwarf Angelfish");  
            c1.setBounds(25, 60, 200, 50);  
            JCheckBox c2 = new JCheckBox("Tangs");  
            c2.setBounds(25, 90, 200, 50); 
            JCheckBox c3 = new JCheckBox("Blennies");  
            c3.setBounds(25, 120, 200, 50);
            JCheckBox c4 = new JCheckBox("Dart Fish");  
            c4.setBounds(25, 150, 200, 50);
            JCheckBox c5 = new JCheckBox("Clownfish");  
            c5.setBounds(25, 180, 200, 50);  
            f8.add(c1); f8.add(c2); f8.add(c3); f8.add(c4); f8.add(c5);
    	}
	    
	    
	
    	System.out.println(tankType);
    	
    	
		//set size of page
		f8.setSize(400, 500);
		f8.setLayout(null);
		// make the frame visible
		f8.setVisible(true);
	  
	
} //close void Inhabitants
	
	public void compatibility() {
		
		//creates new frame and Titles Headers
		JFrame f9 = new JFrame("Aquarium Builder");

		//Menu
		JMenu menu;  
			JMenuItem i1;  
			JMenuBar mb=new JMenuBar();  
			menu = new JMenu("Menu");    
			i1 = new JMenuItem("Home");  
			menu.add(i1);
			mb.add(menu);  
			f9.setJMenuBar(mb);  
				
			//menu home button
			i1.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					f9.setVisible(false);
					Home home = new Home();
				  }  
				});
			
			
			//create Labels on each page
			JLabel l1 = new JLabel("Select Two Fish to See Compatibility");
			l1.setBounds(25,10,300,30);  
			f9.add(l1); 
			
		//creates 2 arrays for fresh water fish compatibility
		String fresh [] = {"Malawian Cichlids", "Tanganyikan Cichlids", "Misc. African Cichlids",
									"New World Cichlids", "Angelfish", "Barbs", "Bettas", "Cory Cats",
									"Danios/ Minnows", "Discus", "Fancy Goldfish", "Gouramis", "Guppies",
									"Hatchets", "Killifish", "Large Catfish", "Loaches", "Mollies", "Platies",
									"Plecos", "Rainbowfish", "Rasboras", "Sharks", "Suckermouth Catfish", "Swordtails",
									"Tetras", "Mics. Fish", "Invertebrates", "Cherry Shrimp", "Crystal Shrimp", "Pond Fish",
									"Freshwater Plants"};	
		
		
		//option 1 drop down
		JComboBox cb3 = new JComboBox(fresh);
		cb3.setBounds(25, 70, 250, 30);	
		f9.add(cb3);
		
		
		String freshcomp [] = {"Malawian Cichlids", "Tanganyikan Cichlids", "Misc. African Cichlids",
				"New World Cichlids", "Angelfish", "Barbs", "Bettas", "Cory Cats",
				"Danios/ Minnows", "Discus", "Fancy Goldfish", "Gouramis", "Guppies",
				"Hatchets", "Killifish", "Large Catfish", "Loaches", "Mollies", "Platies",
				"Plecos", "Rainbowfish", "Rasboras", "Sharks", "Suckermouth Catfish", "Swordtails",
				"Tetras", "Mics. Fish", "Invertebrates", "Cherry Shrimp", "Crystal Shrimp", "Pond Fish",
				"Freshwater Plants"};	
		
		
		//option 2 drop down
		JComboBox cb4 = new JComboBox(freshcomp);
		cb4.setBounds(25, 130, 250, 30);	
		f9.add(cb4);
			
					
		//enter button
		JButton b3 = new JButton("Enter");  
		b3.setBounds(25, 230, 150, 30);  
		f9.add(b3);
	
    		//enter button action listener
		    b3.addActionListener(new ActionListener() {  
			    public void actionPerformed(ActionEvent e) {   
			    
			    //sets selected fish to variables fish1 and fish2
			    String fish1 = (String)cb3.getItemAt(cb3.getSelectedIndex());
			    String fish2 = (String)cb4.getItemAt(cb4.getSelectedIndex());
			    
			    
			    //compares two fish to see if compatible
			    //fish 1 represents the vertical chart and fish 2 is horizontal chart
			    //compatible group for column 1
			    if( (fish1 == fresh[0] || fish1 == fresh[19]) && fish2 == freshcomp[0] ) {
			    	System.out.print(fish1 + " and " + fish2 + " are Compatible!");
			    }
			    //caution group for columns 1 and 2
			    else if( (fish1 == fresh[1] || fish1 == fresh[2] || fish1 == fresh[3] || fish1 == fresh[5]
			    		|| fish1 == fresh[7] || fish1 == fresh[15] || fish1 == fresh[16] || fish1 == fresh[22]
			    		|| fish1 == fresh[23] || fish1 == fresh[26] || fish1 == fresh[27] || fish1 == fresh[30] )
			    		&& ( fish2 == freshcomp[0] || fish2 == freshcomp[1] ) ) {
			    	System.out.print(fish1 + " and " + fish2 + " are compatible with caution");
			    }

			    //caution group for column 3
			    else if( (fish1 == fresh[3] || fish1 == fresh[5] || fish1 == fresh[7] || fish1 == fresh[15]
			    		|| fish1 == fresh[16] || fish1 == fresh[22] || fish1 == fresh[23] || fish1 == fresh[26] ||
			    		fish1 == fresh[27] || fish1 == fresh[30]) && ( fish2 == freshcomp[2] ) ){
			    	System.out.print(fish1 + " and " + fish2 + " are compatible with caution");
			    }
			    
			    //caution group for column 4
			    else if( (fish1 == fresh[3] || fish1 == fresh[4] || fish1 == fresh[5] || fish1 == fresh[7]
			    		|| fish1 == fresh[8] || fish1 == fresh[9] || fish1 == fresh[11] || fish1 == fresh[13] ||
			    		fish1 == fresh[14] || fish1 == fresh[15] || fish1 == fresh[16] || fish1 == fresh[17] 
			    		|| fish1 == fresh[18] || fish1 == fresh[20] || fish1 == fresh[21] || fish1 == fresh[22] 
			    		|| fish1 == fresh[23] || fish1 == fresh[24] || fish1 == fresh[25] || fish1 == fresh[26] 
			    		|| fish1 == fresh[27] || fish1 == fresh[28] || fish1 == fresh[30]) && ( fish2 == freshcomp[3] ) ){
			    	System.out.print(fish1 + " and " + fish2 + " are compatible with caution");
			    }
			    
			    //if fish do not apply to above, then they are not compatible and this loop executes
			    else {
			    	System.out.println(fish1 + " and " + fish2 + " are not compatible");
			    }


		   }  
	   }); //close b3 action listener	
		
	
	//set size of page
	f9.setSize(400, 500);
	f9.setLayout(null);
	// make the frame visible
	f9.setVisible(true);
		
	} //close compatibility void
	
} //close public class AquariumBuilder

	
