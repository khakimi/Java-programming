import java.util.*;

public class Main {
    public static InputData enterUserData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        System.out.println("Количествово строк: ");
        int rows = scan.nextInt();
        System.out.println("Количествово столбцов: ");
        int columns = scan.nextInt();
        System.out.println("Введите число X:");
        int numberX = scan.nextInt();
        System.out.println("Заполнить массив вручную или случайными числами?\n" +
                "1 - Вручную\n2 - Случаными числами (от 1 до 10)");
        int choice = scan.nextInt();
        return new InputData(rows, columns, numberX, choice);
    }

    public static void fillMatrix(int[][] array, int methodOfFilling) {
        Scanner scan = new Scanner(System.in);
        if (methodOfFilling == 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println("Строка " + (i + 1) + " Столбец " + (j + 1));
                    array[i][j] = scan.nextInt();
                }
            }
        } else if (methodOfFilling == 2) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        System.out.println("Ваш массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InputData inputData = enterUserData();
        int[][] array = new int[inputData.rows][inputData.columns];
        fillMatrix(array, inputData.methodOfFilling);
        printArray(array);
        int count = 0;
        //Pair[] pairArray = new Pair[(int) Math.pow(inputData.rows * inputData.columns, 2)];
        //List<Pair>pairArray=new ArrayList<>();
        Set<Pair>pairArray=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        int multiplication = array[i][j] * array[k][l];
                        if ((i == k) && (j == l)) {
                            continue;
                        }
                        if (inputData.number == multiplication) {
                            pairArray.add(new Pair(array[i][j], array[k][l]));
    //                      pairArray[count]=new Pair(array[i][j], array[k][l]);
                            count++;
                        }
                    }
                }
            }
        }
        if (count > 0) {
            System.out.println("Пары элементов массива произведение которых равно числу "
                    + inputData.number + ":\n" + pairArray);
        } else {
            System.out.println("Пары элементов массива произведение которых равно числу "
                    + inputData.number + " - отсутствуют");
        }
    }
}