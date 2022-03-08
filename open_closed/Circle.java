package open.closed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Circle implements Shape {
    private Double radius;

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}
