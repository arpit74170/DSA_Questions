class Solution {
    public static void solve(int arr[], int t, int sum, List<List<Integer>> list, List<Integer> way,int idx) {
        if (sum > t || idx>=arr.length ) {
            return;
        }
        if (sum == t) {
            list.add(new ArrayList<>(way));
            return;
        }
        // for (int i = 0; i < arr.length; i++) {
        //     way.add(arr[i]);
        //     solve(arr, t, sum + arr[i], list, way);
        //     way.remove(way.size() - 1);
        // }


//      for(int i = 0; i < arr.length; i++) {
//     way.add(arr[i]);
//     solve(arr, t, sum + arr[i], list, way);
//     way.remove(way.size() - 1);
// }
        
        way.add(arr[idx]);
        solve(arr, t, sum + arr[idx], list, way, idx);
        way.remove(way.size() - 1);
        solve(arr, t, sum, list, way, idx + 1);

    }

    public List<List<Integer>> combinationSum(int[] arr, int t) {
           List<List<Integer>> list = new ArrayList<>();
            int sum = 0;
        solve(arr, t, sum, list, new ArrayList<>(),0);
        return list;
    }
}


// import java.util.ArrayList;
// import java.util.List;

// class combinationsum {

    
//     public static void main(String[] args) {
     
//         int arr[] = {2, 3, 6, 7};
//         int t = 7;
       
//         System.out.println(list);

//     }
// }
