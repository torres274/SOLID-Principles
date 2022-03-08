package open.closed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Rectangle implements Shape {
    private Double length;
    private Double width;

    @Override
    public Double calculateArea() {
        return length * width;
    }
}
