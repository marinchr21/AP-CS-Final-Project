import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.TextField.*;

public class Cat {

Scanner scan = new Scanner(System.in);
private String catName;
private int catAge;
private String catBreed;
private int catWeight;


public Cat() {
  catName = " ";
  catAge = 0;
  catBreed = " ";
  catWeight = 0;
  
}

public Cat(String catName, int catAge, String catBreed, int catWeight) {

this.catName = catName;
this.catAge = catAge;
this.catBreed = catBreed;
this.catWeight = catWeight;


}
public void setcatName(String catName) {
  this.catName = catName;
}

public void setcatAge(int catAge) {
  this.catAge = catAge;
}

public void setcatBreed(String catBreed) {
  this.catBreed = catBreed;
}

public void setcatWeight(int catWeight) {
  this.catWeight = catWeight;
}



public String getcatName() {
  return catName;
}
public int getcatAge() {
  return catAge;
}
public String getcatBreed() {
  return catBreed;
}
public int getcatWeight(){
  return catWeight;
}

public void createCat() {

  JFrame f4 = new JFrame("Cat Profile");


  //Menu
	JMenu menu;  
	JMenuItem i1;  
		JMenuBar mb=new JMenuBar();  
		menu=new JMenu("Menu");    
		i1=new JMenuItem("Home");  
		menu.add(i1);
		mb.add(menu);  
		f4.setJMenuBar(mb);  
		
	//Menu home button
	i1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			  f4.setVisible(false);  
			  Home home = new Home();
			        }  
			      });
    
    //creates Label on page
    JLabel l1 = new JLabel("Enter Cat Info");
    l1.setBounds(150,10,200,30);  
    f4.add(l1); 
     
    
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
       
       f4.add(l2); f4.add(l3); f4.add(l4); f4.add(label); f4.add(b1); f4.add(t1); f4.add(t2); f4.add(t3); f4.add(l5);
       f4.add(t4);
      
       b1.addActionListener(new ActionListener() {  
       public void actionPerformed(ActionEvent e) {       
       	
       	catName = t1.getText();
       	String age = t2.getText();
       	catBreed = t3.getText();
       	String weight = t4.getText();
       	
       	catAge = Integer.parseInt(age);
       	catWeight = Integer.parseInt(weight);
           	  
           }  
        });   
       
       JButton b2 = new JButton("Show info");  
       b2.setBounds(100,250, 100, 30); 
       f4.add(b2);
       
       b2.addActionListener(new ActionListener() {  
           public void actionPerformed(ActionEvent e) {       
           	
           	System.out.println("name: " + catName);
           	System.out.println("age: " + catAge);
           	System.out.println("breed: " + catBreed);
           	System.out.println("weigth: " + catWeight);

               }  
            });   
       
      
     JButton b3 = new JButton("Animal to Human Years Calculator");
  	 b3.setBounds(100, 290, 250, 30);
  	 f4.add(b3);
  	 
  	 b3.addActionListener(new ActionListener() {  
  	        public void actionPerformed(ActionEvent e) {   
  	        	
  	          if (catAge == 1) {
  	            System.out.print("Your cat would be about 15 Years old in Human Years");
  	          }
  	          else if(catAge == 2) {
  	        	int age = catAge;
  	            age = 24;
  	            System.out.println("Your cat is " + age + " years old in Human Years");
  	          }
  	          else if (catAge >= 3){
  	        	int age = catAge;
  	            int extra = (age - 2);
  	            age = 24 + (extra * 4);
  	             System.out.println("Your cat is " + age + " years old in Human Years");
  	          }
  	          else {
  	            System.out.println("Choose Valid Age");
  	          }
  	        	
  	        }
  	 	});
     //set size of page 3
       f4.setSize(400, 500);
       f4.setLayout(null);
       f4.setVisible(true);
}

 public void catYears() {

  if (catAge == 1) {
    System.out.print("Your cat would be about 15 Years old in Human Years");
  }
  else if(catAge == 2) {
    catAge = 24;
    System.out.println("Your cat is " + catAge + " years old in Human Years");
  }
  else if (catAge >= 3){
    int extra = (catAge - 2);
    catAge = 24 + (extra * 4);
     System.out.println("Your cat is " + catAge + " years old in Human Years");
  }
  else {
    System.out.println("Choose Valid Age");
  }

  }


}
