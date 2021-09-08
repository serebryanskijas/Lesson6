import java.util.Random;
import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        //Кузнечик прыгает на 1 см, затем на 2, на 3 и т.д. Через сколько прыжков он взберется на травинку высотой 50 см?
   /*     int jump = 1; //пройденный путь
        int  distance = 0;
        int count = 0;
        while (distance<50){
            distance+=jump;
        System.out.println(distance);
            jump++;
            count++;

        }
        System.out.println(jump);*/

    //Вводить натуральные числа с клавиатуры. Признаком окончания ввода будет число -1
        /*Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i!=-1){
            System.out.println("Enter the number");
            i = scanner.nextInt();
           System.out.println(i);
        }*/

        //Кот перемещается короткими бросками (по 5-7 шагов) по лесной тропинке.
        //За сколько перебежек он преодолеет расстояние в 50 шагов?
        int l = 50;
        int dist = 0;
        int count = 0;
        Random random = new Random();
        /*while (dist<l) {
            int forward = random.nextInt(3)+5;
            dist+=forward;
            count++;
            System.out.println(dist);
        }
        System.out.println("count " + count);*/
        //Время от времени, почувствовав опасность, он отскакивает на 2-3 шага назад.
        //За сколько перебежек он преодолеет расстояние в 50 шагов?
        while (dist<l) {
            int forward = random.nextInt(3)+5;
            int backward = random.nextInt(2)+2;
            dist+=forward;
            count++;
            System.out.println(dist);
            int prob = random.nextInt(3)+2;
            if (prob==3) {
                dist-=backward;
                System.out.println(dist);
            }
        }



    }

}
