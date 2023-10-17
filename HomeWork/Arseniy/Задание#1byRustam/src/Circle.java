public class Circle {

    public int x;
    public int y;
    public int r;

    Circle() {
        x = y = r = 0;
    }

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double square() {
        return Math.PI * r * r;
    }

    public double length() {
        return Math.PI * 2 * r;
    }

    public String info() {
        return "Координата X: " + x + ';' + "Координата Y: "
                + y + ';' + "Радиус: " + r + ';' + "Площадь круга: " + square()
                + ';' + "Длина круга: " + length();
    }

    public boolean isCrossed(Circle circle) {
        double range = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));//Нахожу расстояние между центрами двух окружностей
        boolean cross = this.r + circle.r > range && this.r + range > circle.r
                && circle.r + range > this.r; /*Окружности пересекаются в случае если являются длинами сторон некоторого треугольника,
        и удовлетворяют всем неравенствам треугольника*/
        return cross;
    }
}