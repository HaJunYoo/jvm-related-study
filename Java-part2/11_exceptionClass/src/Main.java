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

        throw new MyRuntimeError("TEST MESSAGE");
    }
}

class MyRuntimeError extends NullPointerException {
    MyRuntimeError(String param) {
        msg = param;
    }
    public String msg;
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        Shape shape = null;
        if(input == 0)
            shape = new Rectangle();
        else if(input == 1)
            shape = new Triangle();

        try {
            try {
                shape.render();
            }
            catch (MyRuntimeError e) {
                System.out.println(e.msg);
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error: NullPointer");
        }
    }
}