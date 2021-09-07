public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius is " + c1.getRadius() + ", Color is " + c1.getColor() + ", area is " + c1.getArea());
        
        Circle c2 = new Circle(2.0, "Purple");
        System.out.println("Radius is " + c2.getRadius()+ ", Color is " + c2.getColor() + ", area is " + c2.getArea());
}
}
