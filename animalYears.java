import java.util.*;

public class animalYears {

Scanner scan = new Scanner(System.in);
private int age;

public animalYears() {
  age = 0;
}

public animalYears(int animalYears) {

  this.age = age;
}

public void setAge(int age) {
  this.age = age;
}

public int getAge() {
  return age;
}

public void createanimalYears1() {

  System.out.print("Enter Dog Age: ");
  age = scan.nextInt();

  if (age == 1) {
    age = age + 15;
    System.out.print("Your Dog would be about 15 Years old in Human Years");
  }
 
}

public void createanimalYears2() {

  System.out.print("Enter Cat Age: ");
  age = scan.nextInt();
 
}

}
