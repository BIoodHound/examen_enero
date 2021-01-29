import Interface.Shape;
import model.Circle;
import model.Rectangle;
import model.Square;
import model.Triangle;
import org.junit.Test;


public class Shape_ {

    @Test
    public void should_calculate_square_area(){
        Double expected_area = 9.0;
        Double side = 3.0;
        Shape square = new Square(side);
        Double area = square.getArea();
        assert (area.equals(expected_area));
    }

    @Test
    public void should_calculate_circle_area(){
        Double expected_area = 12.56;
        Double radius = 4.0;
        Shape circle = new Circle(radius);
        Double area = circle.getArea();
        assert (area.equals(expected_area));
    }

    @Test
    public void should_calculate_rectangle_area(){
        Double expected_area = 6.0;
        Double width = 2.0;
        Double length = 3.0;
        Shape rectangle = new Rectangle(width, length);
        Double area = rectangle.getArea();
        assert (area.equals(expected_area));
    }

    @Test
    public void should_calculate_triangle_area(){
        Double expected_area = 9.0;
        Double base = 3.0;
        Double height = 3.0;
        Shape triangle = new Triangle(base, height);
        Double area = triangle.getArea();
        assert (area.equals(expected_area));
    }
}
