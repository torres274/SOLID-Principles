package liskov.substitution;

public class Square extends Rectangle {

    public Square() {}

    public Square(Integer size) {
        super.setWidth(size);
        super.setLength(size);
    }

}
