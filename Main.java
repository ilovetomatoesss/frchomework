class Main {
  
  public static void main (String[] args) {
    //created first object
    Person michelle = new Person();
    //printed default attributes
    System.out.println(michelle);
    michelle.setAge(15);
    michelle.setName("michelle");
    michelle.setHeight(6);
    michelle.setHairColor("black");
    //print my new attributes
    System.out.println(michelle);
    System.out.println(michelle);

    // created second object
    Person steve = new Person();
    //print my new attributes
    steve.setAge(20000);
    steve.setName("steve");
    steve.setHeight(6.2);
    steve.setHairColor("chestnut brown");
    //print steve's attributes
    System.out.println(steve);
  }

  }
