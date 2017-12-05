import com.noynaert.csc254.shapes.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Rectangle a = new Rectangle(4, 5);
	Rectangle b = new Rectangle(5, 6);
	Square c = new Square(1);
	Rectangle d = new Square (2);
	//GeometricShape e = new GeometricShape();
	GeometricShape f = new Square(9.9);
	ArrayList<GeometricShape> list = new ArrayList<>();

	list.add(a);
	list.add(b);
	list.add(c);
	list.add(d);
	list.add(new Circle(5.));
	list.add(f);

	for(GeometricShape shape : list){
	    //System.out.println(shape.getName() + shape.getArea());
		System.out.println(shape);
		if(shape instanceof Polygon) {
			Polygon p = (Polygon) shape;
			System.out.println(p.getSides());
		}else
		System.out.println(shape);
		if(shape instanceof RegularPolygon){
			System.out.println("It is a regular polygon");
		}
    }

    }
}
