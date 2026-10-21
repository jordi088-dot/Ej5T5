public class Polygon {
    private Point[] points;
    //array para los puntos del poligono
    public Polygon(Point[] points) {
        this.points = points;
    }

    public  Polygon() {
        points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = null;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int j = 0; j < points.length; j++) {
                s = s + points[j] + " - ";
        }

        s = s + points[0];

        return s;
    }
}