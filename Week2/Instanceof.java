// class Animal {

// }
// class Dog extends Animal {
// }
// public class Instanceof { 


// public static void main(String[] args) {
//  Dog d = new Dog();
// System.out.println(d instanceof Dog);
//  System.out.println(d instanceof Animal);

//  }

// }
class Animal {

}

class Dog extends Animal {

}

public class Instanceof {

    public static void main(String[] args) {

        Animal a = new Dog();

        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
    }
}