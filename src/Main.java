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
        if (oldPerson >= 2 && oldPerson <= 6) {
            System.out.println("Если возраст человека равен " + oldPerson + "+, то ему нужно ходить в детский сад.");
        } else if (oldPerson >= 7 && oldPerson <= 18) {
            System.out.println("Если возраст человека равен " + oldPerson + ", то ему нужно ходить в школу.");
        } else if (oldPerson >= 19 && oldPerson <= 24) {
            System.out.println("Если возраст человека равен " + oldPerson + "+,  то его место в университете.");
        } else if (oldPerson >= 25) {
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
    }}