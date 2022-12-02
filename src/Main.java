public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte b = 7;
        short s = -3728;
        int i = 50567;
        long l = 34722L;
        float f = 74.78f;
        double d = 11.123456789;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudents = 27;
        byte ekaterinaAndreevnaStudents = 30;
        int paper = 480;
        int allStudents = ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
        int paperForOneStudent = paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        int bottleOneMinutes = bottle/time;
        int timeTwentyMinutes = time * 10;
        int timeDay = 60 * 24;
        int bottleTwentyMinutes = bottleOneMinutes * timeTwentyMinutes;
        int bottleOneDay = bottleOneMinutes * timeDay;
        int bottleThreeDays = bottleOneDay * 3;
        int bottleOneMonths = bottleThreeDays * 10;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinutes + " бутылок");
        System.out.println("За сутки машина произвела " + bottleOneDay + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottleThreeDays + " бутылок");
        System.out.println("За месяц машина произвела " + bottleOneMonths + " бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte paints = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintsForOneClass = whitePaint + brownPaint;
        int totalClasses = paints/paintsForOneClass;
        int whitePaintForOneClass = totalClasses * whitePaint;
        int brownPaintForOneClass = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintForOneClass + " банок белой краски и " + brownPaintForOneClass + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weightOneBanana = 80;
        int weightBananas = bananas*weightOneBanana;
        int milk = 200;
        int milkOnePortion = 100;
        int amountPortionMilk = milk/milkOnePortion;
        byte weightOnePortionMilk = 105;
        int totalWeightMilk = amountPortionMilk*weightOnePortionMilk;
        byte iceCream = 2;
        byte weightIceCream = 100;
        int totalWeightIceCream = iceCream*weightIceCream;
        byte egg = 4;
        byte weightOneEgg = 70;
        int weightEggs = egg*weightOneEgg;
        int weightGr = weightBananas + totalWeightMilk + totalWeightIceCream + weightEggs;
        int grPerKg = 1000;
        float weightKg = (float) weightGr/grPerKg;
        System.out.println("Вес спортзавтрака " + weightGr + " грамм");
        System.out.println("Вес спортзавтрака " + weightKg + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weight = 7;
        int grPerKg = 1000;
        int weightInGr = weight * grPerKg;
        int weightLossOne = 250;
        int weightLossTwo = 500;
        int daysToLoseWeightOne = weightInGr/weightLossOne;
        int daysToLoseWeightTwo = weightInGr/weightLossTwo;
        int avg = (daysToLoseWeightOne + daysToLoseWeightTwo)/2;
        System.out.println(daysToLoseWeightOne + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(daysToLoseWeightTwo + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(avg + " день потребуется в среднем, чтобы добиться результата похудения ");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        int annualSalaryM = salaryM * 12;
        int annualSalaryD = salaryD * 12;
        int annualSalaryK = salaryK * 12;
        int salaryIncreaseM = (int) (salaryM * 1.1);
        int salaryIncreaseD = (int) (salaryD * 1.1);
        int salaryIncreaseK = (int) (salaryK * 1.1);
        int annualSalaryIncreaseM = salaryIncreaseM * 12;
        int annualSalaryIncreaseD = salaryIncreaseD * 12;
        int annualSalaryIncreaseK = salaryIncreaseK * 12;
        int differenceM = annualSalaryIncreaseM - annualSalaryM;
        int differenceD = annualSalaryIncreaseD - annualSalaryD;
        int differenceK = annualSalaryIncreaseK - annualSalaryK;
        System.out.println("Маша теперь получает " + salaryIncreaseM + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseD + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseK + " рублей. Годовой доход вырос на " + differenceK + " рублей");



    }
}