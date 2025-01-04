import java.util.*;

public class Problem2 {
    
    public int[] newValue(int[] seat,int[] first,int[] last,int n){
        int arr[]=new int[n];
        for(int i=1;i<seat.length;i++){

        }
        for(int i=first.length;i<=last.length;i++){
            i=
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of flights: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of bookings: ");
        int m = scanner.nextInt();

        int[][] bookings = new int[m][3];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter booking " + (i + 1) + " (first flight, last flight, seats): ");
            bookings[i][0] = scanner.nextInt();  
            bookings[i][1] = scanner.nextInt();  
            bookings[i][2] = scanner.nextInt();  
        }
        int[] result = newValue(n, bookings);

        System.out.println("Total seats reserved for each flight:");
        for (int i = 0; i < n; i++) {
            System.out.println("Flight " + (i + 1) + ": " + result[i] + " seats");
        }

        scanner.close();
    }
}
//time complexity-O(n+m)
//space complexity-O(n)
