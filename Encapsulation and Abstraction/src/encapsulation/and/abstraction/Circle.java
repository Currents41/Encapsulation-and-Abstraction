package encapsulation.and.abstraction;

class Circle extends Shape {
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Lingkaran - " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Hitam", 5.0f);

        System.out.println(circle);
    }
}
