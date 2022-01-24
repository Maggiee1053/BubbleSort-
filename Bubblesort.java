import java.util.*;
class BubbleSort{
public static void sortedarray(int arr[]){
System.out.println("sorted array is");
for( int i=0; i<arr.length; i++ ){
System.out.println(arr[i]+" ");
}
System.out.println();
}
public static  void main(String args[]){
Scanner sc= new Scanner(System.in);
int arr[] = new int[6];
for(int i=0; i<arr.length; i++){
arr[i]=sc.nextInt();
}
for(int i=0 ; i<(arr.length-1) ; i++){
for(int j=0; j<(arr.length-i-1); j++){
if(arr[j] > arr[j+1] ){
int temp = arr[j];
arr[j]= arr[j+1];
arr[j+1] = temp ;
}
}
}
sortedarray(arr);
}
}

