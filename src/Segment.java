public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment() {
        startPoint = new Point();
        endPoint = new Point();
    }

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getModule() {
        int c1, c2;
        c1 = endPoint.getX() - startPoint.getX();
        c2 = endPoint.getY() - startPoint.getY();
        double module = Math.sqrt(c1^2+c2^2);
        return module;
    }

    @Override
    public String toString() {
        return "(" + startPoint.getX() + ", " + startPoint.getY() + ") - (" +
                endPoint.getX() + ", " + endPoint.getY() + ")";
    }
}
