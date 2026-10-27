public class Polygon {
    private Point[] points;

    //array para los puntos del poligono
    public Polygon(Point[] points) {
        this.points = points;
    }

    public Polygon() {
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

    public double getLength() {
        double length = 0; // <- acumulador
        for (int x = 0; x < points.length - 1; x++) {
            Segment side = new Segment(points[x], points[x + 1]);
            length += side.getModule();
        }
        Segment side = new Segment(points[points.length - 1], points[0]);
        length += side.getModule();
        return length;
    }

    public void setOffset(int offsetX, int offsetY) {
        for (int w = 0; w < points.length; w++) {
            points[w].setOffset(offsetX, offsetY);
        }
    }
}