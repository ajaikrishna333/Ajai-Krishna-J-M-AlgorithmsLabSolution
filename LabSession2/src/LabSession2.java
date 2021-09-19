import java.util.Scanner;

public class LabSession2 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int size, count, key, tran;

        System.out.println("Enter the no of transactions in the array: "); // getting the size of the array
        size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the transaction values : "); // getting the array values
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number of transaction that needs to be done : "); // getting the transaction limit
        tran = sc.nextInt();
        System.out.println("");

        while (tran != 0) {

            System.out.println("Enter the target value to be acheived : "); // getting the target value to be acheived
            key = sc.nextInt();

            Service s = new Service(); // checking if the transaction can be acheived with the values in the array
            count = s.process(a, key);

            if (count == -1) {
                System.out.println("The Transaction is not possible");
            } else {
                System.out.println("The target is acheived in " + count + " transactions");
            }
            tran--;
            System.out.println("");
        }

        sc.close();

    }
}
