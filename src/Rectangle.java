public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point point, int newWidth, int newHeight) {
        super(point.getX(), point.getY());
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(Point p1, Point p2) {
        super(p1.getX(), p1.getY());
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }

    public Rectangle(Segment segment) {
        super();
        int x , y;
        Point startPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();
        if (segment.getStartPoint().getX() < segment.getEndPoint().getX()) {
            x = segment.getStartPoint().getX();
            width = startPoint.getX() - endPoint.getX();
        } else {
            x = segment.getEndPoint().getX();
            width = startPoint.getX() - endPoint.getX();
        }

        if (segment.getStartPoint().getY() < segment.getEndPoint().getY()) {
            y = segment.getStartPoint().getY();
            height = startPoint.getY() - endPoint.getY();
        } else {
            y = segment.getEndPoint().getY();
            height = startPoint.getY() - endPoint.getY();
        }

        setX(x);
        setY(y);

    }

    @Override
    public String toString() {
        String s = " ";
        return super.toString() + " width: " + width + " height: " + height;
    }

    public int getArea() {
        return width * height;
    }

    public Point getPoint() {
        return new Point(getX(), getY());
    }

    public Point getTopLeftPoint() {
        return new Point(getX(), getY() + height);
    }

    public Point getTopRightPoint() {
        return new Point(getX()+ width, getY() + height);
    }

    public Point getBottomLeftPoint() {
        return getPoint();
    }

    public Point getBottomRightPoint() {
        return new Point(getX() + width, getY());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}