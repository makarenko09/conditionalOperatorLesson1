import java.time.Month;

public class Main {
    public static void main(String[] args) {
//task 1
        byte old = 2;

        if (old >= 18) {
            System.out.println("Если возраст человека равен " + old + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + old + ", он не достиг совершеннолетия, нужно немного подождать");
        }
        //task 2
        short temp = 6;
        short label = 5;
        if (temp > label) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        //task 3
        short speed = 60;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //task 4
        byte oldPerson = 18;
        if (oldPerson >= 2 && oldPerson < 6) {
            System.out.println("Если возраст человека равен " + oldPerson + "+, то ему нужно ходить в детский сад.");
        } else if (oldPerson >= 6 && oldPerson < 18) {
            System.out.println("Если возраст человека равен " + oldPerson + ", то ему нужно ходить в школу.");
        } else if (oldPerson >= 18 && oldPerson < 24) {
            System.out.println("Если возраст человека равен " + oldPerson + ",  то его место в университете.");
        } else if (oldPerson >= 24) {
            System.out.println("Если возраст человека равен " + oldPerson + ",  то ему пора ходить на работу");
        }
        //task 5
        short yearsChild = 5;
        if (yearsChild < 5) {
            System.out.println("Если возраст ребенка  равен " + yearsChild + ", то он не может кататься на аттракционе.");
        } else if (yearsChild >= 5 && yearsChild < 14) {
            System.out.println("Если возраст ребенка равен " + yearsChild + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (yearsChild >= 14) {
            System.out.println("Если возраст ребенка равен" + yearsChild + "то он может кататься без сопровождения взрослого.");
        }
        //task 6
        short persons = 50;
        short maxValuePersonOnTrain = 102;
        short sitters = 60;
//        int stayers = maxValuePersonOnTrain - sitters;
        if (persons >= maxValuePersonOnTrain) {
            System.out.println("Вагон уже полностью забит");
        } else if (persons > sitters) {
            System.out.println("В вагоне есть стоячее место");
        } else if (persons <= sitters) {
            System.out.println("В вагоне есть сидячее место");
        }
// task 7
        int one = 1;
        int two = 2;
        int three = 3;

        int largest = one;

        if (two > largest) {
            largest = two;
        }

        if (three > largest) {
            largest = three;
        }
        System.out.print("Largest number: " + largest);
        // А можно было бы использовать пузырьковую сортировку...
        //task 1 lesson 2
        byte clientOS;
        String oc = "Android";
        switch (oc) {
            case "iOS":
                clientOS = 0;
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case "Android":
                clientOS = 1;
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        //task 2 lesson 2
        short clientDeviceYear = 2015;
        String warning = clientDeviceYear < 2015 ? "облегченную" : "обычную";
        byte clientOSf;

        String Oc = "Android";
        switch (Oc) {
            case "iOS":
                clientOSf = 0;
                System.out.println("Установите " + warning + " версию приложения для iOS по ссылке");
                break;
            case "Android":
                clientOSf = 1;
                System.out.println("Установите " + warning + " версию приложения для Android по ссылке");
                break;
        }
        //task 3 lesson 2
        short year = 1552;
        try {
            if (year < 1548) {
                throw new IllegalArgumentException("Год не является високосным");
            }
            if (year % 4 == 0 || year % 400 == 0) {
                System.out.println("Год " + year + " является високосным");
            } else {
                System.out.println("Год " + year + " не является високосным");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Год " + year + " не является високосным");
        }
        //task 4 lesson 2
        short radiusMax = 100;
        short deliveryDistance = 95;
        try {
            if (deliveryDistance < radiusMax && deliveryDistance > 0) {
                System.out.print("Потребуется дней: ");

            }
            if (deliveryDistance < 20) {
                System.out.print("одни сутки");

            } else if (deliveryDistance < 60) {
                System.out.print("двое суток");

            } else if (deliveryDistance < radiusMax) {
                System.out.print("трое суток");

            }
        } catch (IllegalArgumentException e) {
            if (deliveryDistance > radiusMax) {
                System.out.println("Свыше 100 км доставки нет");
            }
        }
        //task 5 lesson 2
        int monthNumber = 6;
        System.out.println();
        /*Прописываем условие в котором программа не будет выполняться*/
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12");
        } else {

            Month month = Month.of(monthNumber);
            switch (month) {
                case DECEMBER, JANUARY, FEBRUARY:
                    System.out.println("Зима");
                    break;
                case MARCH, APRIL, MAY:
                    System.out.println("Весна");
                    break;
                case JUNE, JULY, AUGUST:
                    System.out.println("Лето");
                    break;
                case SEPTEMBER, OCTOBER, NOVEMBER:
                    System.out.println("Осень");
                    break;
            }
        }
    }
}