import java.util.Scanner;

public class FunctionNew {

    private int[] pointA = {1, 5};
    private int[] pointB = {2, 7};
    private int corner = 30;
    private int data;

    //конструктор твой ебаный
    public FunctionNew(int data) {
        this.data = data;
        Initialization(data);
    }

    //ебаная хуйня другим словом ИНИЦИАЛИЗАЦИЯ
    private void Initialization(int data) {
        Scanner scanner = new Scanner(System.in);
        switch (data) {
            case 1:
                System.out.println("Введите данные х1 для А");
                pointA[0] = scanner.nextInt();
                System.out.println("Введите данные у1 для А");
                pointA[1] = scanner.nextInt();
                System.out.println("Введите данные х2 для В");
                pointA[0] = scanner.nextInt();
                System.out.println("Введите данные у2 для В");
                pointB[1] = scanner.nextInt();
                System.out.println("Введите угол α ");
                corner = scanner.nextInt();
                if (corner > 180) {
                    System.out.println("Введено значение больше 180 градусов.Повторите ввод");
                    corner = scanner.nextInt();
                }
                System.out.println("\nданные х1 и у1 для точки А");
                Output(pointA);
                System.out.println("\nданные х2 и у2 для точки В");
                Output(pointB);
                System.out.println("\nУгол  α\n" + corner);
                break;
            case 2:
                System.out.println("\nданные х1 и у1 для точки А");
                Output(pointA);
                System.out.println("\nданные х2 и у2 для точки В");
                Output(pointB);
                System.out.println("\nУгол  α\n" + corner);
                break;
        }

    }

    //Выбор функции
    public void Choice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Перезапись точку А на В");
                pointA = Assignment(pointB);
                System.out.println("\nданные х1 и у1 для точки А");
                Output(pointA);
                System.out.println("\nданные х2 и у2 для точки В");
                Output(pointB);
                break;
            case 2:
                System.out.println("Перезапись точку В на А");
                pointB = Assignment(pointA);
                System.out.println("\nданные х1 и у1 для точки А");
                Output(pointA);
                System.out.println("\nданные х2 и у2 для точки В");
                Output(pointB);
                break;
            case 3:
                System.out.println("\nДлинна вектора\n" + Length(pointA, pointB));
                break;
            case 4:
                System.out.println("\nПлощадь треугольника\n" + Square(pointA, pointB, corner));
                break;
            case 5:
                System.out.println("\nПериметр треугольники\n" + Perimetr(pointA, pointB, corner));
                break;
            case 6:
                View(corner);
                break;
            case 7:
                System.out.println("\n1.Длинна вектора\n" + Length(pointA, pointB));
                System.out.println("\n2.Площадь треугольника\n" + Square(pointA, pointB, corner));
                System.out.println("\n3.Периметр треугольники\n" + Perimetr(pointA, pointB, corner));
                System.out.println("\n4.Вид Треугольника");
                View(corner);
                break;
        }
    }

    //Вывод массива
    private void Output(int[] point) {
        for (int i = 0; i < point.length; i++)
            System.out.print(point[i] + " ");
    }

    //Функция присваивания
    private int[] Assignment(int newPoint[]) {
        int point[] = newPoint;
        return point;
    }

    //высчет длины вектора
    private double Length(int pointA[], int pointB[]) {
        return (double) Math.sqrt((int) Math.pow((pointA[0] - pointB[0]), 2) + (int) Math.pow((pointA[1] - pointB[1]), 2));
    }

    //Площадь
    private double Square(int[] pointA, int[] pointB, int corner) {
        return 0.5 * Math.pow(Length(pointA, pointB), 2) * Math.sin(corner * Math.PI / 180);
    }

    //Периметр
    private double Perimetr(int[] pointA, int[] pointB, int corner) {
        return 2 * Length(pointA, pointB) * (1 + Math.sin(corner / 2 * Math.PI / 180));
    }

    //Вид треугольника
    private void View(int corner) {
        if (corner < 90 & corner < 180)
            System.out.println("Тупоугольный");
        else if (corner > 90 & corner < 180)
            System.out.println("Остроугольный");
        else if (corner == 90)
            System.out.println("Прямоугольный");
    }
}
