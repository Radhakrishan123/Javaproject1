interface driving{
    String name = "any car";
    void startengine();//no body define only method name should be 
    void applybreak();

}
class Car implements driving{
    String name = "bmw";

   public void startengine(){// should be always public
    System.out.println("Engine start");
    }
    public void applybreak(){
        System.out.println("Break Appied");//method can  be more or extra in this class
    }
}






public class InterfaceExp {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startengine();
        System.out.println(c1.name);
        ;

        
    }
}
