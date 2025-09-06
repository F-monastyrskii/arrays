//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание. Бухгалтеры попросили посчитать сумму всех выплат за месяц.");

        int[] costs = {1000, 2000, 3000, 4000, 5000};//Целочисленный массив с пятью элементами
        int sum = 0;

        for (int fee : costs) {
            if (fee > 0) {
                sum += fee;
            }
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("2 задание. Бухгалтерия попросила найти минимальную и максимальную траты за неделю");
        int maxWastes = costs[0]; //Переменная с максимальным расходом
        int minWastes = costs[0]; //Переменная с минимальным расходом
        for (int i = 1; i < costs.length; i++) {
            if (costs[i] < minWastes) {
                minWastes = costs[i];
            }
            if (costs[i] > maxWastes) {
                maxWastes = costs[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWastes + " рублей. Максимальная сумма трат за неделю составила " + maxWastes + " рублей");

        System.out.println("3 задание. Бухгалтерия хочет понять, какую в среднем сумму компания тратила еженедельно");
        int averageCosts = sum / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей");

        System.out.println("4 задание. Бага с именем.  ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10 ; i < reverseFullName.length && i>-1; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}