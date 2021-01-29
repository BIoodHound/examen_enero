package sorter;

import Interface.Shape;

import java.util.Comparator;

public class SortByArea implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        Double o1Area = o1.getArea();
        Double o2Area = o2.getArea();
        return  (int) (o1Area - o2Area);
    }
}
