package unit6_inheritance.practice;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle.toString());
        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle(3.5,"red",true);
        System.out.println(circle);
    }
}
