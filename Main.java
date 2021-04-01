import java.util.*;

class Main {
  public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int petChoice = 0;

  Aquarium fishtank = new Aquarium();
  Dog dog = new Dog();
  Cat cat = new Cat();
  animalYears animalyears = new animalYears();



  System.out.println("Please select a pet");
  System.out.println("Dog = 1");
  System.out.println("Fish = 2");
  System.out.println("Cat = 3");

petChoice = scan.nextInt();

if (petChoice == 1) {
  dog.createDog();
  animalyears.createanimalYears1();
}
else if (petChoice == 2) {
  fishtank.createAquarium();
  animalyears.createanimalYears2();
}
else if (petChoice == 3) {
  cat.createCat();
}
else{
  System.out.print("Enter a Valid Choice");
  petChoice = scan.nextInt();
}
 
  
  }
}
