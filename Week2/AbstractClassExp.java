abstract class Android {
    void goodfeatures(){
        System.out.println("android os provide");
    }
    abstract void makeYourui();//without body abstract fucntion always define in abstract class 


    }
class Anysmartphone extends Android {
    void makeYourui(){
        System.out.println( "smartphone company has own ui");

    }


}
public class AbstractClassExp {
    public static void main(String[] args) {
Android a1 = new Android() {
}();
 a1.goodfeatures();
a1.makeYourui();
        
    }
    
}
