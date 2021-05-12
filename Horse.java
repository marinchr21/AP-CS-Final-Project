import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.TextField.*;

public class Horse {

Scanner scan = new Scanner(System.in);
private String horseName;
private int horseAge;
private String horseBreed;
private int horseWeight;


public Horse() {
  horseName = " ";
  horseAge = 0;
  horseBreed = " ";
  horseWeight = 0;
  
}

public Horse(String horseName, int horseAge, String horseBreed, int horseWeight) {

this.horseName = horseName;
this.horseAge = horseAge;
this.horseBreed = horseBreed;
this.horseWeight = horseWeight;


}
public void sethorseName(String horseName) {
  this.horseName = horseName;
}

public void sethorseAge(int horseAge) {
  this.horseAge = horseAge;
}

public void sethorseBreed(String horseBreed) {
  this.horseBreed = horseBreed;
}

public void sethorseWeight(int horseWeight) {
  this.horseWeight = horseWeight;
}



public String gethorseName() {
  return horseName;
}
public int gethorseAge() {
  return horseAge;
}
public String gethorseBreed() {
  return horseBreed;
}
public int gethorseWeight(){
  return horseWeight;
}

public void createHorse() {

  JFrame f5 = new JFrame("Horse Profile");


  //Menu
	JMenu menu;  
	JMenuItem i1;  
		JMenuBar mb=new JMenuBar();  
		menu=new JMenu("Menu");    
		i1=new JMenuItem("Home");  
		menu.add(i1);
		mb.add(menu);  
		f5.setJMenuBar(mb);  
		
	//Menu home button
	i1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			  f5.setVisible(false);  
			  Home home = new Home();
			        }  
			      });
    
    //creates Label on page
    JLabel l1 = new JLabel("Enter Horse Info");
    l1.setBounds(150,10,200,30);  
    f5.add(l1); 
     
    
   	//input labels
    	JLabel label = new JLabel();            
    	label.setBounds(20,150, 200,50);  
    
    	JLabel l2 = new JLabel("Name:");    
       l2.setBounds(20,50, 80,30);  
       
       JLabel l3 = new JLabel("Age:");    
       l3.setBounds(20,90, 80,30);  
       
       JLabel l4 = new JLabel("Breed:");
       l4.setBounds(20,130, 80,30);  
       
       JLabel l5 = new JLabel("Weight:");
       l5.setBounds(20,170, 80,30);  
       
       //enter button
       JButton b1 = new JButton("Enter");  
       b1.setBounds(100,210, 80,30);   
    
       //text field
       JTextField t1 = new JTextField();  
       t1.setBounds(100,50, 100,30);  
       
       JTextField t2 = new JTextField();  
       t2.setBounds(100, 90, 100,30);  
       
       JTextField t3 = new JTextField();  
       t3.setBounds(100, 130, 100,30); 
       
       JTextField t4 = new JTextField();  
       t4.setBounds(100, 170, 100,30); 
       
       f5.add(l2); f5.add(l3); f5.add(l4); f5.add(label); f5.add(b1); f5.add(t1); f5.add(t2); f5.add(t3); f5.add(l5);
       f5.add(t4);
      
       b1.addActionListener(new ActionListener() {  
       public void actionPerformed(ActionEvent e) {       
       	
       	horseName = t1.getText();
       	String age = t2.getText();
       	horseBreed = t3.getText();
       	String weight = t4.getText();
       	
       	horseAge = Integer.parseInt(age);
       	horseWeight = Integer.parseInt(weight);
           	  
           }  
        });   
       
       JButton b2 = new JButton("Show info");  
       b2.setBounds(100,250, 100, 30); 
       f5.add(b2);
       
       b2.addActionListener(new ActionListener() {  
           public void actionPerformed(ActionEvent e) {       
           	
           	System.out.println("name: " + horseName);
           	System.out.println("age: " + horseAge);
           	System.out.println("breed: " + horseBreed);
           	System.out.println("weigth: " + horseWeight);

               }  
            });   
       
     //button for animal years
     JButton b3 = new JButton("Animal to Human Years Calculator");
  	 b3.setBounds(100, 290, 250, 30);
  	 f5.add(b3);
  	 
  	 //human to horse years button action listener
  	 b3.addActionListener(new ActionListener() {  
  	        public void actionPerformed(ActionEvent e) {   
  	        	
  	          if (horseAge == 1) {
  	  		    System.out.print("Your Horse would be about 6 Years old in Human Years");
  	  		  	}
  	  		  else if(horseAge == 2) {
  	  			int age = horseAge;
  	  		    age = 11;
  	  		    System.out.println("Your horse is " + age + " years old in Human Years");
  	  		  	}
  	  		  else if (horseAge == 3) {
  	  			  double age = horseAge;
  	  			  age = 15;
  	  			  System.out.println("Your horse is " + age + " years old in Human Years");
  	  		  }
  	  		  else if (horseAge == 4) {
  	  			  double age = horseAge;
  	  			  age = 18;
  	  			  System.out.println("Your horse is " + age + " years old in Human Years");
  	  		  }
  	  		  else if (horseAge >= 5){
  	  			double age = horseAge;
  	  		    double extra = (age - 4);
  	  		    age = 18 + (extra * 2.5);
  	  		     System.out.println("Your horse is " + age + " years old in Human Years");
  	  		  }
  	  		  else {
  	  		    System.out.println("Choose Valid Age");
  	  		  }
  	        	
  	        }
  	 	});
     //set size of page 3
       f5.setSize(400, 500);
       f5.setLayout(null);
       f5.setVisible(true);
	
	}

public void horseYears() {
	
	  if (horseAge == 1) {
		    System.out.print("Your Horse would be about 6 Years old in Human Years");
		  }
		  else if(horseAge == 2) {
			int age = horseAge;
		    age = 11;
		    System.out.println("Your horse is " + age + " years old in Human Years");
		  }
		  else if (horseAge == 3) {
			  double age = horseAge;
			  age = 15;
			  System.out.println("Your horse is " + age + " years old in Human Years");
		  }
		  else if (horseAge == 4) {
			  double age = horseAge;
			  age = 18;
			  System.out.println("Your horse is " + age + " years old in Human Years");
		  }
		  else if (horseAge >= 5){
			double age = horseAge;
		    double extra = (age - 4);
		    age = 18 + (extra * 2.5);
		     System.out.println("Your horse is " + age + " years old in Human Years");
		  }
		  else {
		    System.out.println("Choose Valid Age");
		  }
	}
}
