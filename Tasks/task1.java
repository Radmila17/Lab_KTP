package tasks;

public class task1 {
/*1. Напишите функцию, которая принимает целое число минут и преобразует его в
    секунды.*/
    public static int convert(int i){
        return(i*60);
    }
    /*2. Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х
и 3-х очков, находите окончательные очки для команды и возвращаете это
значение.*/
    public static int points(int x, int y){
        return(x*2+y*3);
    }
    /*3. Создайте функцию, которая принимает количество побед, ничьих и поражений и
вычисляет количество очков, набранных футбольной командой на данный момент.*/
    public static int footballPoints(int x, int y, int z){
        return(x*3+y);
    }
    /*4. Создайте функцию, которая возвращает true, если целое число равномерно делится
на 5, и false в противном случае.*/
    public  static boolean divisibleByFive(int i){
        return(i%5==0);
    }
    /*5. В Java есть логический оператор &&. Оператор && принимает два логических
значения и возвращает true, если оба значения истинны.*/
    public static boolean and(boolean a, boolean b){
        return(a&&b);
    }
    /*6. У меня есть ведро с большим количеством темно-синей краски, и я хотел бы
покрасить как можно больше стен. Создайте функцию, которая возвращает
количество полных стен, которые я могу покрасить, прежде чем мне нужно будет
отправиться в магазины, чтобы купить еще.
n - это количество квадратных метров, которые я могу нарисовать.
w и h-это ширина и высота одной стены в метрах.*/
    public  static int howManyWalls(int n, int w, int h){
        return(n/(w*h));
    }
    /*7. Исправьте код, чтобы решить эту задачу (только синтаксические ошибки).
Посмотрите на приведенные ниже примеры, чтобы получить представление о том,
что должна делать эта функция.*/
    public static int squared(int a) {
        return a * a;
    }
    /*8. Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает
true, если prob * prize > pay; в противном случае возвращает false.*/
    public static boolean profitableGamble(double prob, int prize, int pay){
        return prob*prize>pay;
    }
    /*9. Создайте метод, который возвращает количество кадров, показанных за заданное
количество минут для определенного FPS.*/
    public static int frames(int x, int y){
        return x*y*60;
    }
    /*10. Создайте функцию, которая будет работать как оператор модуля % без
использования оператора модуля. Оператор модуля-это способ определения
остатка операции деления. Вместо того чтобы возвращать результат деления,
операция по модулю возвращает остаток целого числа.*/
    public static int mod(int dividend, int divisor) {
        return (dividend - divisor * (dividend / divisor));
    }
    public static void main(String[] args) {
        System.out.println("convert(5) ➞ "+convert(5));
        System.out.println("points(13, 12) ➞ "+points(13, 12));
        System.out.println("footballPoints(3, 4, 2) ➞ "+footballPoints(3, 4, 2));
        System.out.println("divisibleByFive(5) ➞ "+divisibleByFive(5));
        System.out.println("and(true, false) ➞ "+and(true, false));
        System.out.println("howManyWalls(54, 1, 43) ➞ "+howManyWalls(54, 1, 43));
        System.out.println("squared(5) ➞ "+squared(5));
        System.out.println("profitableGamble(0.2, 50, 9) ➞ "+profitableGamble(0.2, 50, 9));
        System.out.println("frames(1, 1) ➞ "+frames(1, 1) );
        System.out.println("mod(5, 2) ➞ "+mod(5, 2)  );
    }
}
