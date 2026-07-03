class Calculator {//method overloading

    int add(int a, int b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(50, 20));
        System.out.println(c.add(50, 20, 30));//method overloading 
    }
}

