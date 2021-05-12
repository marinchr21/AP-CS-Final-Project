import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Aquarium {

Scanner scan = new Scanner(System.in);
private String tankName;
private int tankSize;
private String waterType;
private int numSpecies;
private Boolean plantLife;
private Boolean liters;
private Boolean gallons;

public Aquarium() {
  tankName = " ";
  tankSize = 0;
  waterType = " ";
  numSpecies = 0;
  plantLife = false;
  liters = false;
  gallons = false;
}

public Aquarium(String tankName, int tankSize, String waterType, int numSpecies, Boolean plantLife, Boolean liters, Boolean Gallons) {

this.tankName = tankName;
this.tankSize = tankSize;
this.waterType = waterType;
this.numSpecies = numSpecies;
this.plantLife = plantLife;
this.liters = liters;
this.gallons = gallons;

}

public void setTankName(String tankName) {
  this.tankName = tankName;
}

public void setTankSize(int tankSize) {
  this.tankSize = tankSize;
}

public void setWaterType(String waterType) {
  this.waterType = waterType;
}

public void setNumSpecies(int numSpecies) {
  this.numSpecies = numSpecies;
}

public void setPlantLife(Boolean plantLife) {
  this.plantLife = plantLife;
}

public void setLiters(Boolean liters) {
	  this.liters = liters;
	}

public void setGallons(Boolean gallons) {
	  this.gallons = gallons;
	}

public String getTankName() {
  return tankName;
}
public int getTankSize() {
  return tankSize;
}
public String getWaterType() {
  return waterType;
}
public int getNumSpecies(){
  return numSpecies;
}
public Boolean getPlantLife() {
  return plantLife;
}

public Boolean getliters() {
	  return liters;
	}

public Boolean getgallons() {
	  return gallons;
	}

public void createAquarium() {

  JFrame f6 = new JFrame("Fish Profile");

      //set size of page 6
    f6.setSize(400, 500);
    f6.setLayout(null);
    // make the frame visible
    f6.setVisible(true);
    
	 
    //Menu
	JMenu menu;  
	JMenuItem i1;  
		JMenuBar mb=new JMenuBar();  
		menu=new JMenu("Menu");    
		i1=new JMenuItem("Home");  
		menu.add(i1);
		mb.add(menu);  
		f6.setJMenuBar(mb);  
		
	//Menu home button
	i1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			  f6.setVisible(false);  
			  Home home = new Home();
			        }  
			      });
	
	
	 //creates Label on page
	 JLabel l1 = new JLabel("Enter Fish Info");
	 l1.setBounds(150,10,200,30);  
	 f6.add(l1); 
	  
	 
		//input labels
	 	JLabel label = new JLabel();            
	 	label.setBounds(20,150, 200,50);  
	 
	 	JLabel l2 = new JLabel("Name:");    
	    l2.setBounds(20,50, 80,30);  
	    
	    JLabel l3 = new JLabel("Size:");    
	    l3.setBounds(20,90, 80,30);  
	    
	    JLabel l4 = new JLabel("Water Type:");
	    l4.setBounds(20,130, 100,30);  
	    
	    JLabel l5 = new JLabel("Plant Life:");
	    l5.setBounds(20, 250, 80,30);   
	    
	    //enter button
	    JButton b1 = new JButton("Enter");  
	    b1.setBounds(100, 290, 80,30);   
	 
	    //text fields
	    JTextField t1 = new JTextField();  
	    t1.setBounds(100,50, 100,30);  
	    
	    JTextField t2 = new JTextField();  
	    t2.setBounds(100, 90, 100,30);  
	    
	    //buttons fro water type
	    JRadioButton r1 = new JRadioButton("A) Freshwater");    
	    JRadioButton r2 = new JRadioButton("B) Saltwater"); 
	    JRadioButton r3 = new JRadioButton("C) Brackish");
	    r1.setBounds(100, 130, 150, 30);    
	    r2.setBounds(100, 170, 150, 30); 
	    r3.setBounds(100, 210, 150, 30);
	    ButtonGroup bg = new ButtonGroup();    
	    bg.add(r1);bg.add(r2); bg.add(r3); 
	    //adds buttons to JFrame
	    f6.add(r1); f6.add(r2); f6.add(r3);
	    
	    //buttons for plant life
	    JRadioButton r4 = new JRadioButton("A) Yes");    
	    JRadioButton r5 = new JRadioButton("B) No"); 
	    r4.setBounds(100, 250, 100, 30);
	    r5.setBounds(200, 250, 100, 30);
	    ButtonGroup bg2 = new ButtonGroup();    
	    bg2.add(r4);bg2.add(r5);  
	    
	    //adds buttons to JFrame
	    f6.add(r4); f6.add(r5);
	    
	    
	    //buttons for liters and gallons
	    JRadioButton r6 = new JRadioButton("A) Liters");    
	    JRadioButton r7 = new JRadioButton("B) Gallons"); 
	    r6.setBounds(310, 90, 100, 30);
	    r7.setBounds(210, 90, 100, 30);
	    ButtonGroup bg3 = new ButtonGroup();    
	    bg3.add(r6);bg3.add(r7);  
	    //adds buttons to JFrame
	    f6.add(r6); f6.add(r7);
	    
	    f6.add(l2); f6.add(l3); f6.add(l4); f6.add(label); f6.add(b1); f6.add(t1); f6.add(t2); f6.add(l5);

	   
	    b1.addActionListener(new ActionListener() {  
	    public void actionPerformed(ActionEvent e) {       
	    	
	    	tankName = t1.getText();
	    	String size = t2.getText();
	    	//sets size to integer
	    	tankSize = Integer.parseInt(size);
	    	
	    	//water type buttons
	    	if (r1.isSelected()) {
	    		waterType = "Freshwater";
	    	}
	    	else if(r2.isSelected()) {
	    		waterType = "Saltwater";
	    	}
	    	else if(r3.isSelected()) {
	    		waterType = "Brackish";
	    	}
	    	
	    	//plant life buttons
	    	if (r4.isSelected()) {
	    		plantLife = true;
	    	}
	    	else if (r5.isSelected()) {
	    		plantLife = false;
	    	}
	    	
	    	//gallons and liters buttons
	    	if(r6.isSelected()) {
	    		liters = true;
	    		gallons = false;
	    	}
	    	
	    	else if(r7.isSelected()) {
	    		liters = false;
	    		gallons = true;
	    	}
	        	  
	        }  
	     });   
	    
	    JButton b2 = new JButton("Show info");  
	    b2.setBounds(100, 330, 100, 30); 
	    f6.add(b2);
	    
	    b2.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        	
	        	System.out.println("Name: " + tankName);
	        	System.out.println("Size: " + tankSize);
	        	System.out.println("Water Type: " + waterType);
	        	System.out.println("Plant Life: " + plantLife);
	        	System.out.println("Liters: " + liters);
	        	System.out.println("Gallons: " + gallons);

	            }  
	         });   
	    
	   
	 //set size of page 3
	 f6.setSize(400, 500);
	 f6.setLayout(null);
	 f6.setVisible(true);


}

}
