import java.util.*;

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

  System.out.println("Create a Dog Profile!");
  System.out.print("Enter Dog Name: ");
  dogName = scan.nextLine();

  System.out.print("Enter Dog Age: ");
  dogAge = scan.nextInt();

  System.out.print("Enter Dog Breed: ");
  dogBreed = scan.next();
  
  System.out.print("Enter Dog Weight: ");
  dogWeight = scan.nextInt();

 


  
}


}
