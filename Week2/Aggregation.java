import java.util.Scanner;



class General {

    int square(int i) {
        return i * i;
    }
}

class Aggregation1 {

    General g;//aggregation  a class use in the another class code refer to the another class 

    double d = 3.14;
    


    double area(int r) {
        g = new General();
        return g.square(r) * d;
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Aggregation1 a = new Aggregation1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
int r = sc.nextInt();
        double area = a.area(r);

        System.out.println("Area of Circle is : " + area);
    }
}