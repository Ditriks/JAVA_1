// ��������� n-�� ������������ �����(����� ����� �� 1 �� n)

// package DZ;

// import java.util.Scanner;

// public class dz_1 {
//     public static void main(String[] args) {
//         System.out.println("Vvedite chislo n: ");
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         System.out.println(n*(n+1)/2);
//     }
// }






//��������� n! (������������ ����� �� 1 �� n)

// package DZ;

// import java.util.Scanner;

// public class dz_1 {
//     public static void main(String args[]) {
//         System.out.println("Vvedite chislo n: ");
//         Scanner in = new Scanner(System.in);
//         int num = in.nextInt();
//         int result = 1;
//         for (int i = 1; i <= num; i++) {
//             result = result * i;
//         }
//         System.out.println(result);
//     }
// }






//������� ��� ������� ����� �� 1 �� 1000 (������� ����� - ��� �����,
//������� ������� ������ �� ���� � �� ������� ��� �������. 
//����� ����� ������� �� ������� ����������� �������� % , �������� 10%3 ����� ����� �������)

// package DZ;
// public class dz_1 {
//     public static void main(String[] args)  {
//         int i, x, n;
 
//         n = 1000;
//         int a=0;           
//         for(i = 2; i < n; i++) {
//             for(x = 1; x <= i; x++) {         
//                 if (i % x == 0) {
//                     a++;                   
//                 }
//             }
//             if (a==2){                       
//                 System.out.println(i);
//                 a=0;      
//             }
//             else {
//                 a=0;                  
//             }
 
//         }
//     }
// }






//����������� ������� �����������

package DZ;

import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int x, y, z;
        char oper;
 
        System.out.print("Chto budem delat`? (+,-,*,/):");
        oper = scan.next().charAt(0);
        System.out.print("Vvedite pervoe chislo:");
        x = scan.nextInt();
        System.out.print("Vvedite vtoroe chislo:");
        y = scan.nextInt();
 
        boolean correct = true;
        switch (oper) {
            case '+':
                z = x + y;
                break;
            case '-':
                z = x - y;
                break;
            case '*':
                z = x * y;
                break;
            case '/':
                z = x / y;
                break;
            default:
                z = 0;
                correct = false;
        }
 
        System.out.println(correct ? "Resultat: " + z : "Neverno!");
    }
}
