public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println(" Задача 1");
        int age = 50;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " , то он совершеннолетний.");
        } else {
            System.out.println(" Если возраст человека меньше " + age + " , то он несовершеннолетний.");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int temperature = 2;
        if (temperature <= 5) {
            System.out.println(" На улице градусов " + temperature + " , то нужно надеть шапку.");
        } else {
            System.out.println(" На улице градусов " + temperature + ", то можно идти без шапки.");
        }
    }


    public static void task3() {
        System.out.println(" Задача 3 ");
        int speed = 80;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " , то придеться заплатить штраф.");
        } else {
            System.out.println(" Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println(" Задача 4");
        int age = 65;
        boolean goTobed = age >= 2 && age < 6;
        if (age <= 2 && age < 6) {
            System.out.println(" Если возраст человека равен " + age + " , то ему пора спать.");
        } if (goTobed) {
            System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в десткий сад.");
        }
        boolean goToSchool = age >= 7 && age < 18;
        if (age >= 7 && age < 18) {
            System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в школу.");
            boolean goToUniversity = age >= 18 && age < 24;
        } if (age >= 18 && age < 24) {
            System.out.println(" Если возраст человека равен " + age + " , то его место в университете .");
            boolean goToWork = age >= 18 && age < 24;
        } if (age >= 24 && age < 60) {
            System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить на работу .");
            boolean goToRelax = age >= 60;
        } if (age >= 60) {
            System.out.println(" Если возраст человека равен " + age + " , то он может отдохнуть .");
        }
    }

    public static void task5() {
        System.out.println(" Задача 5");
        int age = 16;
        boolean noAttraction = age <= 5;
        if (age <= 5) {
            System.out.println(" Если возраст ребенка равен " + age + " , то он не может кататься на арттракционе.");
        } if (age >= 5 && age < 14) {
            System.out.println(" Если возраст ребенка равен " + age + " , то он может кататься только в сопровождении взрослого, если взрослого нет, то кататься нельзя. ");
            boolean kidAlone = age >= 14;
        } if (age >= 14) {
            System.out.println(" Если возраст ребенка равен " + age + " , то он может кататься без сопровождения взрослого");
        }

    }

    public static void task6() {
        System.out.println(" Задача 6");
        int capacity = 10;
        int seat = 60;
        if (capacity > 102) {
            System.out.println(" В вагоне нет мест ");
        } else if (capacity >=60) {
            int stand = 102 - seat;
            System.out.println(" В вагоне, нет сидящих мест, но есть стоячие места. ");
        } else {
            System.out.println(" В вагоне есть сидячие места ");
        }
    }

    public static void task7() {
        System.out.println(" Задача 7");
        int one = 7, two = 7, three = 5;
        if (one>=two&&one>three) {
            System.out.println(one + " самое большое число ");
        } else if (two>one&&two>three) {
            System.out.println(two + " самое большое число ");
        } else if (one==two&&two==three) {
            System.out.println(" все числа равны " + one);
        } else {
            System.out.println(three + " самое большое число ");
        }

    }
}

