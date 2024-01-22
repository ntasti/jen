import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Begin = """
                Заполнить точки вектора с клавитуры или по умолчанию?");
                1.C клавиатуры
                2.По умолчанию
                """;
        System.out.println(Begin);
        FunctionNew vector = new FunctionNew(scanner.nextInt());

        char input;
//        Цикл do-while ,который гоняет участок кода
//        //и повторяет его до тех пор,пока я жму 0
        do {
            System.out.println("Ввведите номер функции,которую вы хотите выполнить:");
            String task = """
                    1.Перезапись точки А на В
                    2.Перезапись точки B на A
                    3.Длина вектора AB 
                    4.Площадь треугольника
                    5.Периметр треугольника
                    6.Вид треугольник
                    7.Все,кроме перезапись
                    """;
            System.out.println(task);
            //Вызов функции,в которой реализованы все методы
            vector.Choice(scanner.nextInt());

            System.out.println("Нажмите 0 для повторения ");
            System.out.println("Нажмите любую кнопку,чтоб завершить программу ");
            //Cчитывание символа с клавиатуры3

            input = scanner.next().charAt(0);
        } while (input == '0');
//    }
    }
}