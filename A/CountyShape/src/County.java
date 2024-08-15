public class County {
    private String name;
    private Shape shape;

    public County(String name, Shape shape) {
        this.name = name;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        if (shape != null)
            return shape.getArea();
        else
            return 0.0;
    }
}