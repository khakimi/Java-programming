import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Параметры первого круга:");//Первый круг
        Circle circle1 = new Circle();
        System.out.println("Введите X: ");
        circle1.X = Scan.nextInt();
        System.out.println("Введите Y: ");
        circle1.Y = Scan.nextInt();
        System.out.println("Введите R: ");
        circle1.R= Scan.nextInt();
        double S = circle1.square(circle1.R);
        double L = circle1.length(circle1.R);
        System.out.println("Параметры второго круга:");//Второй круг
        Circle circle2 = new Circle();
        System.out.println("Введите X: ");
        circle2.X = Scan.nextInt();
        System.out.println("Введите Y: ");
        circle2.Y = Scan.nextInt();
        System.out.println("Введите R: ");
        circle2.R = Scan.nextInt();
        double S2 = circle2.square(circle2.R);
        double L2 = circle2.length(circle2.R);
        System.out.println("Первый круг:");//Вывод инфы по первому кругу
        circle1.info(circle1.X, circle1.Y, circle1.R, S, L);
        System.out.println("Второй круг:");//Вывод инфы по второму кругу
        circle2.info(circle2.X, circle2.Y, circle2.R, S2, L2);
        Circle cross = new Circle();// Объект для определения наличия пересечения окружностей
        cross.crossing(circle1.X, circle1.Y, circle1.R, circle2.X, circle2.Y, circle2.R);
    }
}
