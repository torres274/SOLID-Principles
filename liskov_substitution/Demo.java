package liskov.substitution;

// this principle states that if class A is a subtype of class B we should be able to replace B with A without disrupting the behavior of our program.
public class Demo {

    static void calculateArea(Rectangle rectangle) {
        Integer width = rectangle.getWidth();
        System.out.println("Expected area of " + width + ", got " + rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        calculateArea(rectangle1);

        Rectangle rectangle2 = new Square(5);
        calculateArea(rectangle2);
    }
}
