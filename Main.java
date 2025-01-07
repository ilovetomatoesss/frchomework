class Main {
  
  public static void main (String[] args) {
    //created first object
    Person michelle = new Person();
    System.out.println(michelle);
    michelle.setAge(15);
    michelle.setName("michelle");
    michelle.setHeight(6);
    michelle.setHairColor("black");
    System.out.println(michelle);

    // created second object
    Person steve = new Person();
    System.out.println(steve);
    steve.setAge(20000);
    steve.setName("steve");
    steve.setHeight(6.2);
    steve.setHairColor("dark brown");
  }

  }
