package unit6_inheritance.exercise.circle_cylinder;

public class Circle {
    private String color= "red";
    private double radius= 1.0;
    public Circle(){}
    public Circle( double radius, String color){ this.radius= radius;this.color=color; }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}'+ " the area of circle is "+ getArea();
    }
}
