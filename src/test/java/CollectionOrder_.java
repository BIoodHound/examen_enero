import Interface.Shape;
import model.Circle;
import model.Rectangle;
import model.Square;
import model.Triangle;
import org.junit.Test;
import sorter.SortByArea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOrder_ {

    @Test
    public void should_be_ordered_by_ascending_order_of_area_1() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(2.0));
        shapes.add(new Circle(3.0));
        shapes.add(new Rectangle(2.0, 4.0));
        shapes.add(new Triangle(4.0,5.0));
        Collections.sort(shapes, new SortByArea());
        boolean isOrdered = false;

        if(shapes.get(0).getClass().getSimpleName().equals("Square")
                && shapes.get(1).getClass().getSimpleName().equals("Rectangle")
                && shapes.get(2).getClass().getSimpleName().equals("Triangle")
                && shapes.get(3).getClass().getSimpleName().equals("Circle")){
            isOrdered = true;
        }

        assert (isOrdered);

    }
}
