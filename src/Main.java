public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int apple = 1000;
        System.out.println("Значение переменной apple с типом int равно "+apple);
        byte bear = 1;
        System.out.println("Значение переменной bear с типом byte равно " +bear);
        short cat = 100;
        System.out.println("Значение переменной сat с типом short равно " +cat);
        long dog = 10000L;
        System.out.println("Значение переменной dog с типом long равно " +dog);
        float elephant = 10.1f;
        System.out.println("Значение переменной elephant с типом float равно " +elephant);
        double fox = 100.10011;
        System.out.println("Значение переменной fox с типом double равно " +fox);

        //Задача 2
        System.out.println("Задача 2");
        byte b = 67;
        short s = -159;
        int i = 27897;
        long l = 987678965549L;
        float f = 27.12f;
        double d = 2.786;
        char c = 569;
        boolean o = false;

        //Задача 3
        System.out.println("Задача 3");

        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int totalPaper = 480;
        int studentsSum = studentsEA+studentsAS+studentsLP;
        int paperPerStudent = totalPaper/studentsSum;
        System.out.println("На каждого ученика рассчитано "+paperPerStudent+" листов бумаги.");

        //Задача 4
        System.out.println("Задача 4");

        int production = 16;
        int timeForProduction = 2;
        int production1Min = production/timeForProduction;
        int time1 = 20;
        int production1 =  production1Min*time1;
        System.out.println("За "+time1+" минут, машина произвела бутылок: "+production1+" штук.");

        int time2Days = 1;
        int minPerHour = 60;
        int hoursPerDay =24;
        int time2 = time2Days*minPerHour*hoursPerDay;
        int production2 = production1Min*time2;
        System.out.println("За "+time2Days+" сутки машина произвела бутылок: "+production2+" штук.");

        int time3Days = 3;
        int time3 = time3Days*minPerHour*hoursPerDay;
        int production3 = production1Min*time3;
        System.out.println("За "+time3Days+" суток машина произвела бутылок: "+production3+" штук.");

        int time4Days = 30;
        int time4 = time4Days*minPerHour*hoursPerDay;
        int production4 = production1Min*time4;
        System.out.println("За 1 месяц длинной "+time4Days+" суток машина произвела бутылок: "+production4+" штук.");

        int time5Days = 31;
        int time5 = time5Days*minPerHour*hoursPerDay;
        int production5 = production1Min*time5;
        System.out.println("За 1 месяц длинной  "+time5Days+" сутки машина произвела бутылок: "+production5+" штук.");

        //Задача 5
        System.out.println("Задача 5");

        int totalCan = 120;
        int whiteCanPerClass = 2;
        int brownCanPerClass = 4;
        int numberOfClasses = totalCan/(whiteCanPerClass+brownCanPerClass);
        int totalWhiteCans = whiteCanPerClass*numberOfClasses;
        int totalBrownCans = brownCanPerClass*numberOfClasses;
        System.out.println("В школе, где "+ numberOfClasses+" классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски.");

        //Задача 6
        System.out.println("Задача 6");

        int bananas = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int egg = 4*70;
        int totalWeightGram = bananas+milk+iceCream+egg;
        float totalWeightKg = totalWeightGram/1000f;
        System.out.println("Вес такого спорт-завтрака "+totalWeightKg+" кг.");

        //Задача 7
        System.out.println("Задача 7");

        int excessWeightKG = 7;
        int excessWeightGram = excessWeightKG*1000;
        int lostWeightPerDay1 = 250;
        int lostWeightPerDay2 = 500;
        int days1 = excessWeightGram/lostWeightPerDay1;
        int days2 = excessWeightGram/lostWeightPerDay2;
        int lostWeightPerDayMedium = (lostWeightPerDay1+lostWeightPerDay2)/2;
        int daysM = excessWeightGram/lostWeightPerDayMedium;
        int m = excessWeightGram%lostWeightPerDayMedium;
        if (m>0)  daysM +=1;
        System.out.println("Если спортсмен будет терять каждый день по "+lostWeightPerDay1+" грамм, ему потребуется "+days1+" дней.");
        System.out.println("Если спортсмен будет терять каждый день по "+lostWeightPerDay2+" грамм, ему потребуется "+days2+" дней.");
        System.out.println("Если спортсмен будет терять каждый день по "+lostWeightPerDayMedium+" грамм, ему потребуется "+daysM+" дней.");

        //Задача 8
        System.out.println("Задача 8");

        int oldSalaryMasha = 67760;
        int oldSalaryDenis = 83690;
        int oldSalaryKristina = 76230;
        float raise = 0.1f;
        float newSalaryMasha = oldSalaryMasha+oldSalaryMasha*raise;
        float newSalaryDenis = oldSalaryDenis+oldSalaryDenis*raise;
        float newSalaryKristina = oldSalaryKristina+oldSalaryKristina*raise;
        float differenceAnnualSalaryMasha = (newSalaryMasha-oldSalaryMasha)/2*12;
        float differenceAnnualSalaryDenis = (newSalaryDenis-oldSalaryDenis)/2*12;
        float differenceAnnualSalaryKristina = (newSalaryKristina-oldSalaryKristina)/2*12;
        System.out.println("Маша теперь получает "+newSalaryMasha+" рублей. Годовой доход вырос на "+differenceAnnualSalaryMasha+" рублей.");
        System.out.println("Денис теперь получает "+newSalaryDenis+" рублей. Годовой доход вырос на "+differenceAnnualSalaryDenis+" рублей.");
        System.out.println("Кристина теперь получает "+newSalaryKristina+" рублей. Годовой доход вырос на "+differenceAnnualSalaryKristina+" рублей.");
    }
}

