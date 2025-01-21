import java.util.Scanner;

class Shape {
    public void render() {
    }
}

class Triangle extends Shape {
    @Override
    public void render() {
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < i + 1;  ++j)
                System.out.print("*\t");
            System.out.print('\n');
        }
    }
}

class Rectangle extends Shape {
    @Override
    public void render() {
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5;  ++j)
                System.out.print("*\t");
            System.out.print('\n');
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        Shape shape;
        if(input == 0)
            shape = new Rectangle();
        else
            shape = new Triangle();

        shape.render();
    }
}