import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class AnimalChoice {

  public AnimalChoice() {

    //New frame
    JFrame f2 = new JFrame("Animal Profile");
    
    //Menu
	JMenu menu;  
	JMenuItem i1;  
		JMenuBar mb=new JMenuBar();  
		menu=new JMenu("Menu");    
		i1=new JMenuItem("Home");  
		menu.add(i1);
		mb.add(menu);  
		f2.setJMenuBar(mb);  
		
	//Menu home button
	i1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			  f2.setVisible(false);  
			  Home home = new Home();
			        }  
			      });
    
    //creates Label on page
    JLabel l2 = new JLabel("Please Select an Animal");
    l2.setBounds(100,10,200,30);  
    f2.add(l2); 

    //Create bubble options to select animals
    JRadioButton r1 = new JRadioButton("A) Dog");    
    JRadioButton r2 = new JRadioButton("B) Cat"); 
    JRadioButton r3 = new JRadioButton("C) Horse");
    JRadioButton r4 = new JRadioButton("D) Fish");  
    r1.setBounds(75,50,100,30);    
    r2.setBounds(75,75,100,30);
    r3.setBounds(75,100,100,30);
    r4.setBounds(75,125,100,30);     
    ButtonGroup bg = new ButtonGroup();    
    bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);
    f2.add(r1);f2.add(r2);f2.add(r3);f2.add(r4);

    // create buttons
    JButton b3 = new JButton("Enter");
    // x axis, y axis, width, height (set button size and place)
    b3.setBounds(75, 160, 75, 40);
    // add button to JFrame
    f2.add(b3);

//"Enter" button (3) action listener to select animal
  b3.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
    if(r1.isSelected()){  
    	f2.setVisible(false);
        Dog dog = new Dog();
        dog.createDog();    
    } 
    else if(r2.isSelected()){  
    	f2.setVisible(false);
        Cat cat = new Cat();
        cat.createCat();
    } 
    else if(r3.isSelected()){  
    	f2.setVisible(false);
        Horse horse = new Horse();
        horse.createHorse();
    } 
    else if(r4.isSelected()){  
    	f2.setVisible(false);
        Aquarium fish = new Aquarium();
        fish.createAquarium();
    } 
  }  
  }); //close b3 action listener
  

 //set size of page 2
    f2.setSize(400, 500);
    f2.setLayout(null);
    f2.setVisible(true);

  }
}
