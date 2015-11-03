import java.util.Arrays;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws TriangleException {
        double[] sides = {a, b, c};
        Arrays.sort(sides);
        this.a = sides[0];
        this.b = sides[1];
        this.c = sides[2];
        if( this.a < 0 || this.a + this.b <= this.c) {
            throw new TriangleException();
        }
    }

    public TriangleKind getKind() {
        if(a == b && b == c) {
            return TriangleKind.EQUILATERAL;
        } else if( a == b || b == c) {
            return TriangleKind.ISOSCELES;
        } else {
            return TriangleKind.SCALENE;
        }
    }
}