import javax.swing.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // creating instance of JFrame
    JFrame f = new JFrame("Animal Project");

    JLabel l1;  
    l1=new JLabel("Welcome to Animal Planner!"); 
    l1.setBounds(100,10,200,30);  
    f.add(l1);

    // creating instance of JButton
    JButton b1 = new JButton("Create Animal Profile");
    JButton b2 = new JButton("Animal to Human Years Calculator");
    // x axis, y axis, width, height
    b1.setBounds(40, 60, 200, 40);
    b2.setBounds(40, 100, 275, 40);

    // add button to JFrame
    f.add(b1);
    f.add(b2);


    String data[][]={ {"101","Amit","670000"},    
                      {"102","Jai","780000"},    
                      {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt = new JTable(data,column);    
    jt.setBounds(40,150,200,50);          
    JScrollPane sp = new JScrollPane(jt);    
    f.add(sp);
    f.add(jt);          
 
    f.setSize(400, 500);
    f.setLayout(null);
    // make the frame visible
    f.setVisible(true);
  }
}
