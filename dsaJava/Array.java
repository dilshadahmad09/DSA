package dsaJava;
import java.util.Arrays;
public class Array { 
    
 // main method 
 public static void main(String[] args){
     // declare an array
    //  int [][] matrix = {{10000,3,4},{1,20,103,5,4},{1,3},{1}};
    
    //  for(int i=0; i<matrix.length; i++){
    //      for(int j=0; j<matrix[i].length; j++){
    //         System.out.println(matrix[i][j]);
    //      }
    //  }
    // int i=0;
    // while(i<matrix.length){
    //     int j=0;
    //     while( j < matrix[i].length){
    //         System.out.println(matrix[i][j]);
    //         j++;
    //     }
    //     i++;
    // }

    // for(int[] nestedArr: matrix){
    //     for(int num : nestedArr){
    //         System.out.println(num);
    //     }
    // }
    // int i=0;
    // do{

    //     int j=0;
    //     do{
    //         System.out.println(matrix[i][j]);
    //         j++;
    //     }while(j<matrix[i].length);
    //     i++;
    // }while(i<matrix.length);

    //  System.out.println(Arrays.deepToString(matrix));



    // 3D arrays

    // int[][][] numbers = {
    //     {{1,2,3,4},{5,6,7,8,9},{10,11}}
    // };

    // for(int i=0; i<numbers.length; i++){
    //     for(int j=0; j<numbers[i].length; j++){
    //         for(int k=0; k<numbers[i][j].length; k++){
    //             System.out.println(numbers[i][j][k]);
    //         }
    //     }
    // }
//    System.out.println(Arrays.deepToString(numbers));


int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int [] n2 = new int[numbers.length];

System.arraycopy(numbers,0,n2,0,numbers.length);

System.out.println(Arrays.toString(n2));
 }
}
