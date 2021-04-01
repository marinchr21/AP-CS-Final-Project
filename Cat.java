import java.util.*;

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

  System.out.println("Create a Cat Profile!");
  System.out.print("Enter Cat Name: ");
  catName = scan.nextLine();

  System.out.print("Enter Cat Age: ");
  catAge = scan.nextInt();

  System.out.print("Enter Cat Breed: ");
  catBreed = scan.next();
  
  System.out.print("Enter Cat Weight: ");
  catWeight = scan.nextInt();

 
 
}

}
