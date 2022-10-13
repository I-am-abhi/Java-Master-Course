package LambdaExpressionExample;

interface Shape{
    public void show();
        }

class Circle implements Shape{
    @Override
    public void show() {
        System.out.println("Circle class: draw() method");
    }
}

class Rectangle implements Shape{
    @Override
    public void show() {
        System.out.println("Rectangle class: draw() method");
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("hello");
        rectangle.show();
    }
}
