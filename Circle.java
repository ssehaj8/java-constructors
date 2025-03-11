class Circle {
    double radius;


    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.display();


        Circle circle2 = new Circle(5.0);
        circle2.display();
    }
}
