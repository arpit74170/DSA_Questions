class Solution {
    public long maxPoints(int[] t1, int[] t2, int k) {
    long sum = 0;
        int a1[][] = new int[t1.length][2];
        for (int i = 0; i < t1.length; i++) {
            a1[i][0] = i;
            a1[i][1] = t1[i] - t2[i];
        }
        Arrays.sort(a1, (a, b) -> Integer.compare(b[1], a[1]));

        // for (int i = 0; i < a1.length; i++) {
        //     System.out.print(a1[i][0]);
        //     System.out.println(a1[i][1]);
        // }
        for (int i = 0; i < k; i++) {
            sum += t1[a1[i][0]];
        }
        for (int i = k; i < t1.length; i++) {
            if (t1[a1[i][0]] > t2[a1[i][0]]) {
                sum += t1[a1[i][0]];
            } else {
                sum += t2[a1[i][0]];
            }
        }
        return sum;


    }
}


// import java.util.Arrays;

// public class maximize_points_after_choosing_k_tasks {

//     public static void main(String[] args) {
//         int t1[] = {5, 10, 2};
//         int t2[] = {10, 8, 3};
//         int k = 2;
        
//         System.out.println(sum);

//     }
// }
