//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание. Объявление трёх массивов");//Объявление трёх массивов
        int[] arrInt = new int[]{1, 2, 3};//Целочисленный массив с элементами 1,2,3 объявленный через new
        double[] arrDouble = {1.57d, 7.654d, 9.986d};//Массив для дробных чисел
        char[] arrChar = new char[]{'\u4f60', '\u597d', '\u5417'};//Массив с символами (китайские иероглифы)

        System.out.println("2 задание. Распечатать элементы каждого массива в строку по порядку через запятую ");
        //Вывод элементов целочисленного массива
        for (int i = 0; i < arrInt.length; i++) {
            if (i > 0) {
                System.out.print(", ");//Запятая нужна лишь между элементами массива. В конце она нам не нужна
            }
            System.out.print(arrInt[i]);
        }
        System.out.println();
        //Вывод элементов массива с дробными числами
        for (int i = 0; i < arrDouble.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrDouble[i]);
        }
        System.out.println();
        //Вывод элементов массива с символами
        for (int i = 0; i < arrChar.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrChar[i]);
        }
        System.out.println("\n3 задание. Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.");
        //Вывод элементов целочисленного массива
        for (int i = arrInt.length - 1; i >= 0; i--) {
            if (i < arrInt.length - 1) {
                System.out.print(", ");
            }
            System.out.print(arrInt[i]);
        }
        System.out.println();
        //Вывод элементов массива с дробными числами
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i < arrDouble.length - 1) {
                System.out.print(", ");
            }
            System.out.print(arrDouble[i]);
        }
        System.out.println();
        //Вывод элементов массива с символами
        for (int i = arrChar.length - 1; i >= 0; i--) {
            if (i < arrChar.length - 1) {
                System.out.print(", ");
            }
            System.out.print(arrChar[i]);
        }
        System.out.println("\n4 Задание. Сделать все нечетные числа целочисленного массива четными, прибавив к их значению единицу через цикл");
        for (int i = 0; i < arrInt.length; i++) {
            if ((arrInt[i] % 2) != 0) {
                arrInt[i]++;
            }
            System.out.print(arrInt[i]);
        }
    }
}