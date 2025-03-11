package encapsulation.and.abstraction;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract float getArea();

    @Override
    public String toString() {
        return "Warna: " + color + ", Luas: " + getArea();
    }
}

