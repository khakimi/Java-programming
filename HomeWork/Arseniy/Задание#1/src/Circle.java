public class Circle {
    public int X;
    public int Y;
    public int R;//Радиус круга

    Circle() { //Конструктор без параметров
        X = 0;
        Y = 0;
        R = 0;
    }

    Circle(int X, int Y, int R) {
        this.X = X;
        this.Y = Y;
        this.R = R;

    }

    public static double square(int R) { //Метод для нахождения площади круга
        double S = Math.PI * R * R;
        return S;
    }

    public static double length(int R) { //Метод для нахождения длины круга через диаметр
        double L = Math.PI * 2 * R;
        return L;
    }

    public void info(int x, int y, int r, double s, double l) { //метод вывода инфы об окружностях
        System.out.println("Координата X: " + x);
        System.out.println("Координата Y: " + y);
        System.out.println("Радиус: " + r);
        System.out.println("Площадь круга: " + s);
        System.out.println("Длина круга: " + l);
        System.out.println("----------------");
    }

    public static void crossing(int x1, int y1, int r1, int x2, int y2, int r2) { //метод пересечения окружностей
        double range = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));//Нахожу расстояние между центрами двух окружностей
        boolean cross = r1 + r2 > range && r1 + range > r2 && r2 + range > r1; /*Окружности пересекаются в случае если являются длинами сторон некоторого треугольника,
        и удовлетворяют всем неравенствам треугольника*/
        System.out.println("Наличие пересечения окружностей: "+cross);
    }
}
