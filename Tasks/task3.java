package tasks;

public class task3 {
    /*1. Учитывая массив городов и населения, верните массив, в котором все население
округлено до ближайшего миллиона.*/
    public static Object[][] millionsRounding(Object[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            double rounded = Math.round((double) (int) arr[i][1] / 1000000) * 1000000;
            Integer roundedInt = Integer.valueOf((int) rounded);
            arr[i][1] = roundedInt;
        }
        return arr;
    }
    /*2. Учитывая самую короткую сторону треугольника 30° на 60° на 90°, вы должны
найти другие 2 стороны (верните самую длинную сторону, сторону средней
длины).*/
    public static double[] otherSides(double x) {
        double x1 = x * 2;
        double x2 = Math.sqrt(Math.pow(x1, 2) - Math.pow(x, 2));
        double[] arr = {x1, x2};
        return (arr);
    }
    /*Создайте функцию, имитирующую игру "камень, ножницы, бумага". Функция
принимает входные данные обоих игроков (камень, ножницы или бумага), первый
параметр от первого игрока, второй от второго игрока. Функция возвращает
результат как таковой:
"Игрок 1 выигрывает"
"Игрок 2 выигрывает"
"НИЧЬЯ" (если оба входа одинаковы)
Правила игры камень, ножницы, бумага, если не известны:
Оба игрока должны сказать одновременно "камень"rock, "бумага" или "ножницы"scissors.
Камень бьет ножницы, бумага бьет камень, ножницы бьют бумагу.*/
    public static String rps(String plr1, String plr2) {
        if (plr1.equals(plr2))
            return "TIE";
        if (plr1.equals("rock") && plr2.equals("scissors")
                || plr1.equals("paper") && plr2.equals("rock")
                || plr1.equals("scissors") && plr2.equals("paper"))
            return "Player 1 wins";
        else
            return "Player 2 wins";
    }
    /*Создайте функцию, которая берет массив целых чисел, суммирует четные и нечетные
числа отдельно, а затем возвращает разницу между суммой четных и нечетных чисел.*/
    public static int warOfNumbers(int[] nums) {
        int even_sum = 0;
        int odd_sum = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                even_sum += num;
            else
                odd_sum += num;
        }
        return Math.abs(even_sum - odd_sum);
    }
    /*5. Учитывая строку, создайте функцию для обратного обращения. Все буквы в
нижнем регистре должны быть прописными, и наоборот.*/
    public static String reverseCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i]))
                charArray[i] = Character.toLowerCase(charArray[i]);
            else if (Character.isLowerCase(charArray[i]))
                charArray[i] = Character.toUpperCase(charArray[i]);
        }
        return new String(charArray);
    }
    /*6. Создайте функцию, которая принимает строку из одного слова и выполняет
следующие действия:
Конкатенирует inator до конца, если слово заканчивается согласным, в противном
случае вместо него конкатенирует -inator
Добавляет длину слова исходного слова в конец, снабженный '000'.*/
    public static String inatorInator(String s) {
        String ch = "aeiouy";
        int l = s.length();
        if (ch.contains(Character.toString(s.charAt(s.length() - 1))))
            return s + "-inator" + " " + l + "000";
        else
            return s + "inator" + " " + l + "000";
    }
    /*7. Напишите функцию, которая принимает три измерения кирпича: высоту(a),
ширину(b) и глубину(c) и возвращает true, если этот кирпич может поместиться в
отверстие с шириной(w) и высотой(h).Примечание:
- Вы можете повернуть кирпич любой стороной к отверстию.
- Мы предполагаем, что кирпич подходит, если его размеры равны размерам отверстия (то
есть размер кирпича должен быть меньше или равен размеру отверстия, а не строго
меньше).
- Нельзя класть кирпич под неортогональным углом.*/
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return (a * b <= w * h) || (a * c <= w * h) || (b * c <= w * h);
    }
    /*8.Напишите функцию, которая принимает топливо (литры), расход топлива
(литры/100 км), пассажиров, кондиционер (логическое значение) и возвращает
максимальное расстояние, которое может проехать автомобиль.
топливо-это количество литров топлива в топливном баке.
Расход топлива-это базовый расход топлива на 100 км (только с водителем внутри).
Каждый дополнительный пассажир увеличивает базовый расход топлива на 5%.
Если кондиционер включен, то его общий (не базовый) расход топлива увеличивается на
10%.*/
    public static double totalDistance(double fuel, double fuel_cons, int passengers, boolean fan) {
        fuel_cons *= (1 + 0.05 * passengers);
        if (fan)
            fuel_cons *= 1.1;
        return Math.round(fuel / fuel_cons * 10000.0) / 100.0;
    }
    /*9. Создайте функцию, которая принимает массив чисел и возвращает среднее
значение (average) всех этих чисел.*/
    public static double mean(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int num: nums) {
            sum += num;
            count++;
        }
        return Math.round((double)sum/count*100.0)/100.0;
    }
    /*10. Создайте функцию, которая принимает число в качестве входных данных и
возвращает true, если сумма его цифр имеет ту же четность, что и все число. В
противном случае верните false.*/
    public static boolean parityAnalysis(int num) {
        int sum = 0;
        int num_ = num;
        while(num_>0){
            sum += num_%10;
            num_ /= 10;
        }
        return sum%2 == num%2;
    }

    public static void main(String[] args) {
        Object[][] testArr = {{"Nice", 942208}, {"Abu Dhabi", 1482816}, {"Naples", 2186853}, {"Vatican City", 572}};
        Object[][] res = millionsRounding(testArr);
        for (int i = 0; i < testArr.length; i++) {
            System.out.print((String) res[i][0] + " ");
            System.out.println((int) res[i][1]);
        }
        double[] arr2 = otherSides(2);
        System.out.print("otherSides(2) ➞  ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" " + arr2[i]);
        }
        System.out.println();
        System.out.println("rps(\"rock\", \"paper\") ➞ " + rps("rock", "paper"));
        int[] arr3 = {12, 90, 75};
        System.out.println("warOfNumbers([12, 90, 75]) ➞" + warOfNumbers(arr3));
        System.out.println("reverseCase(\"Happy Birthday\") ➞" + reverseCase("Happy Birthday"));
        System.out.println("inatorInator(\"Shrink\") ➞" + inatorInator("Shrink"));
        System.out.println("doesBrickFit(1, 1, 1, 1, 1) ➞" + doesBrickFit(1, 1, 1, 1, 1));
        System.out.println("totalDistance(70.0, 7.0, 0, false) ➞" + totalDistance(70.0, 7.0, 0, false));
        int[] t9={1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
        System.out.println("mean([1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3]) ➞" + mean(t9) );
        System.out.println("parityAnalysis(3) ➞" + parityAnalysis(3)  );
    }}