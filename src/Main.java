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
    public static void task1(){
        byte age = 18;
        if (age >= 18){
            System.out.println("congratulation");
        } else {
            System.out.println("sorry");
        }
    }
    public static void task2(){
        byte age = 18;
        if (age >= 7 && age < 18){
            System.out.println("ребенок ходит в школу, если его возраст равен или больше 7 годам");
        } else if (age >= 18 && age < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;");
        } else if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.");
        }
    }
    public static void task3(){
        byte train = 102;
        byte seatPlace = 60;
        int stayPlace = train - seatPlace;
        byte people = 100;
        if (train > people){
            if (seatPlace > people) {
                seatPlace -= people;
                System.out.println(seatPlace + " сидячих мест и " + stayPlace + "стоячих мест");
            } else if (seatPlace < people) {
                people -= seatPlace;
                stayPlace -= people;
                System.out.println("0 сидячих мест и " + stayPlace + " стоячих мест");
            }
        } else {
            System.out.println("Нет свободных мест");
        }
    }
    public static void task4(){
        byte age = 18;
        if (age >= 18) {
            System.out.println("congratulation");
        } else {
            System.out.println("sorry");
        }
    }
    public static void task5(){
        byte age = 6;
        if (age >= 2 && age <= 6){
            System.out.println("Детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("В школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("в университет");
        } else if (age > 24) {
            System.out.println("работай");
        }
    }
    public static void task6(){
        byte age = 5;
        if (age < 5){
            System.out.println("нельзя");
        } else if (age >= 5 && age < 14) {
            System.out.println("катайся с родителями");
        } else {
            System.out.println("Катайся");
        }
    }
    public static void task7(){
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}