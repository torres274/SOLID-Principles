package liskov.substitution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Rectangle {
    private Integer length;
    private Integer width;

    public Integer getArea() {
        return length * width;
    }
}
