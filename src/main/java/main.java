import Dragons.Dragons;
import Dragons.typeD;
import java.util.Arrays;
import java.util.Scanner;
//import Dragons.Mal;


public class main {

    public static void main(String[] arg) {

        Scanner me = new Scanner(System.in);
        System.out.println("Давай створимо Дракона");
        System.out.println("Для початку потрібно обрати вид Дракона");
        System.out.println(Arrays.toString(typeD.values()));
        typeD TD = typeD.valueOf(me.nextLine());
        System.out.println("Як назвем твого Дракона?");
        String name = me.nextLine();
        System.out.println("Чи старенький твій Дракончик?");
        int age = me.nextInt();
        System.out.println("Скільки важить твій Дракон?");
        int weigth = me.nextInt();
//        Scanner cs = new Scanner(System.in);
        System.out.println("а що вміє твій Дракон? flame or fly?");
        String sp = me.next();

        Dragons newDragons = new Dragons(name, age, weigth, TD);
//        Dragons newDragons = new Dragons("Osiris", 154, 578, typeD.Amphithere);
         System.out.print(newDragons);


        boolean o ;
        o = sp.equals("flame");

        if (o == true) {
            String emoji = "\uD83D\uDC09\uD83D\uDD25";
            System.out.println(emoji);
        }
            else {
                String emoji1 = "\uD83D\uDC32";
                System.out.println(emoji1);
            }
        }
    }














