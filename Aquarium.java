import java.util.*;

public class Aquarium {

Scanner scan = new Scanner(System.in);
private String tankName;
private int tankSize;
private String waterType;
private int numSpecies;
private Boolean plantLife;

public Aquarium() {
  tankName = " ";
  tankSize = 0;
  waterType = " ";
  numSpecies = 0;
  plantLife = false;
}

public Aquarium(String tankName, int tankSize, String waterType, int numSpecies, Boolean plantLife) {

this.tankName = tankName;
this.tankSize = tankSize;
this.waterType = waterType;
this.numSpecies = numSpecies;
this.plantLife = plantLife;

}

public void setTankName(String tankName) {
  this.tankName = tankName;
}

public void setTankSize(int tankSize) {
  this.tankSize = tankSize;
}

public void setWaterType(String waterType) {
  this.waterType = waterType;
}

public void setNumSpecies(int numSpecies) {
  this.numSpecies = numSpecies;
}

public void setPlantLife(Boolean plantLife) {
  this.plantLife = plantLife;
}

public String getTankName() {
  return tankName;
}
public int getTankSize() {
  return tankSize;
}
public String getWaterType() {
  return waterType;
}
public int getNumSpecies(){
  return numSpecies;
}
public Boolean getPlantLife() {
  return plantLife;
}

public void createAquarium() {

  System.out.println("Let's Create an Aquarium");
  System.out.print("Enter Tank Name: ");
  tankName = scan.nextLine();

  System.out.print("Enter Tank Size: ");
  tankSize = scan.nextInt();

  System.out.print("Enter Water Type: ");
  waterType = scan.next();
  
  System.out.print("Enter Number of Species: ");
  numSpecies = scan.nextInt();

  System.out.print("True/False: Are there plants or coral: ");
  plantLife = scan.nextBoolean();


  
}


}
