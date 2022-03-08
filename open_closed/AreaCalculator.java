package open.closed;

// this principle states that classes should be open for extension but closed for modification.
public class AreaCalculator {

    public Double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
    
}
