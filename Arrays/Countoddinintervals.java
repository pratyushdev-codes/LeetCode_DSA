// import java.util.Scanner;

// public class Countoddinintervals{
//     public static void main(String[] args) {
//               Scanner sc= new Scanner(System.in);
    
//         int arr []= {1,2,3,4,5,6};
//         int low= sc.nextInt();
//         int high=sc.nextInt();


//         int ans= countOdds(int arr [],int low, int high);
//         System.out.println(ans);


//     }public  public int countOdds(int arr [],int low, int high) {
//         for(int s=low;s<arr.length;s++){
//              for(int e=s;e<arr.length;e++){
//                 int count=0;

//                 for(int i=s;s<e;s++){
//                     if(arr[i]%2==0){
//                     count++;
                    
//                     return count;
//                 }else{
//                     return -1;
//                 }
            
//         }
//         }
        
//     }
// }
// }



import java.util.Scanner;

public class  Countoddinintervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 6};
        int low = sc.nextInt();
        int high = sc.nextInt();

        int ans = countOdds(low, high);
        System.out.println(ans);
    }

    public static int countOdds(int low, int high) {
        if(low%2==0){
            low++;
        }
            return (high-low+2)/2;

    }
}