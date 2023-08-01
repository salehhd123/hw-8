public class Circle extends Shape{
    private double radius =1.0;


    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color,boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius,2) *3.1415927;
    }

    public double getPerimeter(){
        return 2*radius;
    }

    @Override
    public String toSting() {
        return "A Circle with radius="+radius+", which is a subclass of Shape"+super.toSting();
    }
}
