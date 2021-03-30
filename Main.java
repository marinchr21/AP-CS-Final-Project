import java.util.*;

class Main {
  public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int petChoice = 0;

  Aquarium fishtank = new Aquarium();
  Dog dog = new Dog();



  System.out.println("Please select a pet");
  System.out.println("Dog = 1");
  System.out.println("Fish = 2");

petChoice = scan.nextInt();

if (petChoice == 1) {
  dog.createDog();
}
else if (petChoice == 2) {
  fishtank.createAquarium();
}
else{
  System.out.print("Enter a Valid Choice");
  petChoice = scan.nextInt();
}
  
  }
}
