class Parent {
    int i = 10;
}
class child extends Parent {
    int i = 20;
    void show() 
     {
        System.out.println(i);
        System.out.println(super.i);
    }
}
//public class superkeywords { 
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
    
}
class super1 {
    super1() {
        System.out.println("parent class constructor");
}
    }
    class child2 extends super1 {
        
        child2() {
            super();
            System.out.println("child class constructor");
        }
    }
    class superkeywords {
        public static void main(String[] args) {

            child2 obj = new child2();
            obj.();
        }
    }