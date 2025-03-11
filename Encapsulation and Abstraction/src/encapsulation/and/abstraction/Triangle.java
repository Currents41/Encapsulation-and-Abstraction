package encapsulation.and.abstraction;

class Triangle extends Shape {
    private float base;
    private float height;

    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return 0.5f * base * height;
    }

    @Override
    public String toString() {
        return "Segitiga - " + super.toString();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("Merah", 4.0f, 3.0f);

        System.out.println(triangle);
    }
}
