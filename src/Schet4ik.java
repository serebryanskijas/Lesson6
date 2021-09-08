import java.util.Random;

public class Schet4ik {
    public static void main(String[] args) {
        //Поднимаемся по ступенькам с 1-й по 9-ю
//        for (int i = 1; i<10; i++)
//        System.out.print((i) + "i, ");
    /*    //Избавимся от последней запятой
        int i; for (i=1; i<9; i++)
            System.out.print((i) + ", ");
        System.out.print(i);
        for (;true;) //зацикливание
            System.out.println("Hello");*/


        //Человек нажимает кнопку счетчика и прыгает через ступень
    /*    for (int i = 0; i < 10; i++) {
            System.out.println((i) + " ");
            i++;
        }*/

        //счетчик 0 1 3 6 10 15
     /*   int a = 0;
        for (int i = 0; i < 16; i++ ) {
            System.out.println((i) + " ");
            i += a;
            a++;
        }*/
 /*       //Шагает по случайным ступенькам с 1 по 9
        Random random = new Random();
        for (int i = 0; i<9; i++){
//            int number = random.nextInt(9);
            int number = random.nextInt(9)+1;
            System.out.println(number);
        }
        for (int i= 0; i<10; i+=2) // через 2 ступени
            System.out.println(i);

        for (int i= 0; i<10; i+=3) // через 3 ступени
            System.out.println(i);*/


   /*     //Поднимаясь по ступенькам, в какой-то момент перешагнуть через одну
        for  (int i = 0; i<9; i++){
            if (i == 5) continue;
            System.out.println(i);
        }

        //Поднимаясь по ступенькам, в какой-то момент stop
        for  (int i = 0; i<9; i++){
            if (i == 5) break;
            System.out.println(i);
        }*/

        //Счетчик имеется только у одного человека. При этом первый поднимается вверх, а второй спускается вниз
     /*   for (int i=0; i<9; i++) {
            System.out.println(i);
            int s = 8-i;
            System.out.println(s);
        }*/

        //Два человека поднимаются по лестнице. Один ступает на каждую ступеньку, второй - через одну
        //Подъем прекращается, когда один из них поднимется
        for (int i = 0, j=0; i<9 && j<9; i++, j+=2 ) {
            System.out.print((i) + "i " );
            System.out.print((j) + "j ");
        }




    }
}
