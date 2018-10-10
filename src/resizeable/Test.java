package resizeable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"red",true);
        System.out.println(circle.toString());
        circle.resize(50);

        Rectangle rectangle = new Rectangle(20,10,"blue",false);
        System.out.println(rectangle.toString());
        rectangle.resize(100);
    }
}
