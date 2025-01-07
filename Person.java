public class Person {

//attributes of person class
public String name;
private String hairColor;
private int age;
private double height;

//constructor: sets default values
public Person() {
age = 16;
name = Emmer Checkers; 
height = 6.5; 
hairColor = bright purple;
}

//void means it doesn't return anything
public void setAge(int newAge){
  age = newAge;
}

//these are setter methods, supposed to modify the value of each attribute
public void setName(String newName){
  name = newName;
}

public void setHeight(double newHeight){
  height = newHeight;
}

public void setHairColor(String newHairColor){
  hairColor = newHairColor;
}




}
