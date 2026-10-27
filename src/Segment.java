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
        double module = Math.sqrt(c1 * c1 + c2 * c2);
        return module;
    }

    @Override
    public String toString() {
        return "(" + startPoint.getX() + ", " + startPoint.getY() + ") - (" +
                endPoint.getX() + ", " + endPoint.getY() + ")";
    }

    public void setOffset(int offsetX, int offsetY) {
        startPoint.setX(startPoint.getX() + offsetX);
        startPoint.setY(startPoint.getY() + offsetY);
        endPoint.setX(endPoint.getX() + offsetX);
        endPoint.setY(endPoint.getY() + offsetY);
        // esto se puede hacer mas facil con start.Point.setOffset(offsetX, offsetY) y endPoint.
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}
