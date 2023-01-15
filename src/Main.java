import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter anything: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            listA.add(s);
        }
        System.out.println("listA: " + listA);
        System.out.println("______________________________");
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter anything: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            listB.add(s);
        }
        System.out.println("listB: " + listB);
        System.out.println("______________________________");
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
        }
        int a = 1;
        int m = 4;
        for (int i = 0; i < listB.size(); i++) {
            listC.add(a + i, listB.get(m));
            a++;
            m--;
        }
        System.out.println("List C " + listC);
        listC.sort(Comparator.comparingInt(String::length));
        System.out.println("List C сортировка по длине " + listC);
    }
}