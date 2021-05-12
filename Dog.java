import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.TextField.*;

public class Dog {

Scanner scan = new Scanner(System.in);
private String dogName;
private int dogAge;
private String dogBreed;
private int dogWeight;


public Dog() {
  dogName = " ";
  dogAge = 0;
  dogBreed = " ";
  dogWeight = 0;
    
}





public Dog(String dogName, int dogAge, String dogBreed, int dogWeight) {

this.dogName = dogName;
this.dogAge = dogAge;
this.dogBreed = dogBreed;
this.dogWeight = dogWeight;

}

public void setdogName(String dogName) {
  this.dogName = dogName;
}

public void setdogAge(int dogAge) {
  this.dogAge = dogAge;
}

public void setdogBreed(String dogBreed) {
  this.dogBreed = dogBreed;
}

public void setdogWeight(int dogWeight) {
  this.dogWeight = dogWeight;
}



public String getdogName() {
  return dogName;
}
public int getdogAge() {
  return dogAge;
}
public String getdogBreed() {
  return dogBreed;
}
public int getdogWeight(){
  return dogWeight;
}

public void createDog() {
	
	  
	 JFrame f3 = new JFrame("Dog Profile");
	 
	 //creates Label on page
	 JLabel l1 = new JLabel("Enter Dog Info");
	 l1.setBounds(150,10,200,30);  
	 f3.add(l1); 
	  
	    //Menu
		JMenu menu;  
		JMenuItem i1;  
			JMenuBar mb=new JMenuBar();  
			menu=new JMenu("Menu");    
			i1=new JMenuItem("Home");  
			menu.add(i1);
			mb.add(menu);  
			f3.setJMenuBar(mb);  
			
		//Menu home button
		i1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				  f3.setVisible(false);  
				  Home home = new Home();
				        }  
				      });
	 
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
	    
	    f3.add(l2); f3.add(l3); f3.add(l4); f3.add(label); f3.add(b1); f3.add(t1); f3.add(t2); f3.add(t3); f3.add(l5);
	    f3.add(t4);
	   
	    b1.addActionListener(new ActionListener() {  
	    public void actionPerformed(ActionEvent e) {       
	    	
	    	dogName = t1.getText();
	    	String age = t2.getText();
	    	dogBreed = t3.getText();
	    	String weight = t4.getText();
	    	
	    	dogAge = Integer.parseInt(age);
	    	dogWeight = Integer.parseInt(weight);
	        	  
	        }  
	     });   
	    
	    JButton b2 = new JButton("Show info");  
	    b2.setBounds(100,250, 100, 30); 
	    f3.add(b2);
	    
	    b2.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        	
	        	System.out.println("name: " + dogName);
	        	System.out.println("age: " + dogAge);
	        	System.out.println("breed: " + dogBreed);
	        	System.out.println("weigth: " + dogWeight);

	            }  
	         });   
	    
	 JButton b3 = new JButton("Animal to Human Years Calculator");
	 b3.setBounds(100, 290, 250, 30);
	 f3.add(b3);
	 
	 b3.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {   
	        	
	        	if (dogAge == 1) {
	        		 System.out.print("Your Dog would be about 15 Years old in Human Years");
	        	}
	        	else if(dogAge == 2) {
	        			int age = dogAge;
	        		    age = 24;
	        		    System.out.println("Your dog is " + age + " years old in Human Years");
	        	}
	        	else if (dogAge >= 3){
	        			int age = dogAge;
	        		    int extra = (age - 2);
	        		    age = 24 + (extra * 4);
	        		    System.out.println("Your dog is " + age + " years old in Human Years");
	        	}
	        	else {
	        		System.out.println("Choose Valid Age");
	        	}
	        	
	        }
	 	});
	   
	 //set size of page 3
	 f3.setSize(400, 500);
	 f3.setLayout(null);
	 f3.setVisible(true);
}


 public void dogYears() {

  if (dogAge == 1) {
    System.out.print("Your Dog would be about 15 Years old in Human Years");
  }
  else if(dogAge == 2) {
    dogAge = 24;
    System.out.println("Your dog is " + dogAge + " years old in Human Years");
  }
  else if (dogAge >= 3){
    int extra = (dogAge - 2);
    dogAge = 24 + (extra * 4);
     System.out.println("Your dog is " + dogAge + " years old in Human Years");
  }
  else {
    System.out.println("Choose Valid Age");
  }
  }


}
