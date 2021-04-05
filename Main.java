import java.util.*;

class Main {
  public static void main(String[] args) {

Scanner scan = new Scanner(System.in);


  Aquarium fishtank = new Aquarium();
  Dog dog = new Dog();
  Cat cat = new Cat();


  int petChoice = 0;
  System.out.println("Please select a pet");
  System.out.println("Dog = 1");
  System.out.println("Fish = 2");
  System.out.println("Cat = 3");

petChoice = scan.nextInt();

while (petChoice > 3) {
  System.out.print("Enter a Valid Choice: ");
  petChoice = scan.nextInt();
  }

if (petChoice == 1) {
  dog.createDog();
  dog.dogYears();
}
else if(petChoice == 2) {
  fishtank.createAquarium();
  
}
else if (petChoice == 3) {
  cat.createCat();
  cat.catYears();
}

  

 
  
  }
}
