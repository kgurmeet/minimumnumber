public class Amin {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,3,4};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println("min element is "+ min);
    }
    
}

