public class Array {
    public static void main (String args[]){
        int [] arr = new int[]{2, 6, 1, 3, 9};
        int a = arr[0];
        int b = arr[arr.length-1];
        arr[arr.length-1] = a;
        arr[0] = b;
        int c = arr[0] + arr[arr.length/2];
        System.out.println(c);
    }


}

