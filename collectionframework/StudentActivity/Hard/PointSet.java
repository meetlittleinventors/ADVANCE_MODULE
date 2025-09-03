import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class PointSet {
    public static void main(String[] args) {
        Set<Point> points = new HashSet<>();
        
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 2); // This is a "duplicate" of p1

        points.add(p1);
        points.add(p2);
        System.out.println("Points after adding p1 and p2: " + points);
        
        System.out.println("Attempting to add duplicate point p3 (1, 2)...");
        points.add(p3); // This will not be added because it's considered equal to p1

        System.out.println("Final points set: " + points);
    }
}
