import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int numIterator = sc.nextInt();
        int[] arr = new int[numIterator];
        for (int i=0; i<arr.length; i++){
            System.out.println("Input integer number");
            int numArray = sc.nextInt();
            arr[i] = numArray;
        }
            System.out.println(arr.length);
        }
    }

