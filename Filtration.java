
import javax.swing.*;
import java.awt.event.*;
import java.util.*;



public class Filtration {

	private String filterType;
	private String filterBrand; 
	private String filterSpecific;
		
		
	public Filtration() {
		
		filterType = " ";
		filterBrand = " ";	
		filterSpecific = " ";

	} //close public Aquarium Builder

		public Filtration(String filterType, String filterBrand, String filterSpecific) {

		this.filterType = filterType;
		this.filterBrand = filterBrand;
		this.filterSpecific = filterSpecific;
		}

		
		public void setfilterType(String filterType) {
		  this.filterType = filterType;
		}
		public void setfilterBrand(String filterBrand) {
		  this.filterBrand = filterBrand;
		}
		public void setfilterSpecific(String filterSpecific) {
			this.filterSpecific = filterSpecific;
		}

		
		public String getfilterType() {
		  return filterType;
		}
		public String getfilterBrand() {
		  return filterBrand;
		}
		public String getfilterSpecific() {
			return filterSpecific;
		}
		

		
		public void FilterType() {

			//creates new frame and Titles Headers
			JFrame f7 = new JFrame("Filtration");

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
			JLabel l1 = new JLabel("Select a Filter Type");
			l1.setBounds(25,10,200,30);  
			f7.add(l1); 
			
			//string array for combo box drop down
			String type[]={"Hang on Back Filter", "Canister Filter", "Sump Filter", "Undergravel Filter"
					,"Sponge Flter", "In-Tank Filter", "UV Filter Only", "Airstone Only"};    
			
			String brand[] = {"DIY", "Fluval", "AquaClear", "Marineland", "Aqueon", "Tetra", "API", "AquaticLife"
					,"Penn-Plax", "Aqua-Tech", "SunSun", "Nicrew","Trigger Systems", "EShopps", "Fiji", "BubbleFin",
					"CoraLife" };
			
			//creates combo box
		    JComboBox cb = new JComboBox(type);  
		    JComboBox cb2 = new JComboBox(brand);
		    cb.setBounds(25,50,250,30); 
		    cb2.setBounds(25, 130, 250, 30);
		    f7.add(cb);
		    f7.add(cb2);
		    
		    
		    
			//create Labels on each page
			JLabel l2 = new JLabel("Select a Filter Brand");
			l2.setBounds(25,90,200,30);  
			f7.add(l2); 
		    
		    
			//create Labels on each page
			JLabel l3 = new JLabel("Enter a Specific Model");
			l3.setBounds(25,190,200,30);  
			f7.add(l3); 
		  
			JLabel l4 = new JLabel("Model Name:");    
		    l4.setBounds(25, 230, 100,30); 	    
		    
		    //text field
		    JTextField t1 = new JTextField();  
		    t1.setBounds(110, 230, 100, 30);  
		    
		    //adds to Jframe
		    f7.add(l4);
		    f7.add(t1);
		    
		  //enter button
		    JButton b2 = new JButton("Enter");  
		    b2.setBounds(25, 280, 150, 30);  
		    f7.add(b2);
		    
		    //enter button action listener
		    b2.addActionListener(new ActionListener() {  
			    public void actionPerformed(ActionEvent e) {       
			    	
			    	
			    	//sets filterType to selected item from drop down
				    filterType = (String) cb.getItemAt(cb.getSelectedIndex());  

				    //sets filterBrand to selected item from drop down
				    filterBrand = (String) cb2.getItemAt(cb2.getSelectedIndex());
				    
				    //sets filterSpecific to text from text box
				    filterSpecific = t1.getText();
				    
				    System.out.println("Filter Type: " + filterType);
				    System.out.println("Filter Brand: " + filterBrand);
				    System.out.println("Filter Model: " + filterSpecific);   
				    
				    
		        }  
		     }); //close b2 action listener
		    
		    
			//set size of first page
			f7.setSize(400, 500);
			f7.setLayout(null);
			// make the frame visible
			f7.setVisible(true);
		  
		}// close public void FilterType
	
	
}
