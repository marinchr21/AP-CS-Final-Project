import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Home {

  public Home(){

//creates new frame and Titles Headers
JFrame f1 = new JFrame("Animal Project");

//Menu
JMenu menu;  
JMenuItem i1;  
	JMenuBar mb=new JMenuBar();  
	menu=new JMenu("Menu");    
	i1=new JMenuItem("Home");  
	menu.add(i1);
	mb.add(menu);  
	f1.setJMenuBar(mb);  
	
//menu home button
i1.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
		  f1.setVisible(true);    
		        }  
		      });

  //create Labels on each page
  JLabel l1 = new JLabel("Welcome to Animal Planner!");
  l1.setBounds(110,10,200,30);  
  f1.add(l1); 

   // create buttons
    JButton b1 = new JButton("Create Animal Profile");
    // x axis, y axis, width, height (set button size and place)
    b1.setBounds(95, 60, 200, 40);
   
    b1.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
      f1.setVisible(false);
      AnimalChoice animalchoice = new AnimalChoice();
      
        }  
      });

    //create buttons
    JButton b2 = new JButton("Build An Aquarium");
    // x axis, y axis, width, height (set button size and place)
    b2.setBounds(95, 110, 200, 40);
    f1.add(b2);

    b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
    	f1.setVisible(false);
    	AquariumBuilder builder = new AquariumBuilder();
    	builder.BuilderSelect();
    	}  
    });


    // add button to JFrame
    f1.add(b1);
    //set size of first page
    f1.setSize(400, 500);
    f1.setLayout(null);
    
     // make the frame visible
    f1.setVisible(true);
  }

}
