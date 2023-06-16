package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareDraw;

public class Main {
    public static void main(String[] args) {
        int side = 5;

        Square square = new Square(new Point(1,1), 5);
        SquareDraw squareDraw = new SquareDraw(side);
        squareDraw();

        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        square.draw();
    }
}
