import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        System.out.println("Количествово строк: ");
        int strings = scan.nextInt();
        System.out.println("Количествово столбцов: ");
        int columns = scan.nextInt();
        int[][] array = new int[strings][columns];
        System.out.println("Введите число X:");
        int numberX = scan.nextInt();
        System.out.println("Заполнить массив вручную или случайными числами?\n" +
                "1 - Вручную\n2 - Случанйми числами (от 1 до 10)");
        int choice = scan.nextInt();
        if (choice == 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println("Строка " + (i + 1) + " Столбец " + (j + 1));
                    array[i][j] = scan.nextInt();
                }
            }
        } else if (choice == 2) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Ваш массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        Pairs pairs = new Pairs();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        int multiplication = array[i][j] * array[k][l];
                        if ((i == k) && (j == l)) {
                            continue;
                        }
                        if (numberX == multiplication) {
                            count += 1;
                            pairs.num1 = array[i][j];
                            pairs.num2 = array[k][l];
                            pairs.pair();
                        }
                    }
                }
            }
        }
        if (count > 0) {
            System.out.println("Пары элементов массива произведение которых равно числу "
                    + numberX + ":\n" + pairs.pair);
        } else {
            System.out.println("Пары элементов массива произведение которых равно числу "
                    + numberX + " - отсутствуют");
        }
    }
}
