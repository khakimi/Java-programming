import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Параметры первого круга:");//Первый круг
        Circle circle1 = new Circle();
        System.out.println("Введите X: ");
        circle1.x = Scan.nextInt();
        System.out.println("Введите Y: ");
        circle1.y = Scan.nextInt();
        System.out.println("Введите R: ");
        circle1.r = Scan.nextInt();
        System.out.println("Параметры второго круга:");//Второй круг
        Circle circle2 = new Circle();
        System.out.println("Введите X: ");
        circle2.x = Scan.nextInt();
        System.out.println("Введите Y: ");
        circle2.y = Scan.nextInt();
        System.out.println("Введите R: ");
        circle2.r = Scan.nextInt();
        System.out.println("Первый круг:");//Вывод инфы по первому кругу
        System.out.println("Первый круг: \n" + circle1.info());
        System.out.println("Второй круг: \n" + circle2.info());
        System.out.println("Наличие пересечения первого круга и второго круга: " + circle1.isCrossed(circle2));
    }
}