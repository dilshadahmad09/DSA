package dsaJava;

public class Pattern {
    public static void main(String[] args){

        // // right triangle pattern
        // for(int i=1; i<=5; i++){
        //     String str = "";
        //     for(int j=1; j<=i; j++){
        //         str += " " + "*";
                
        //     }
        //     System.out.println(str);
        // }

        // // left triangle pattern

        // for(int i=1; i<=5; i++){
        //     String str = "";
        //     for(int j=1; j<=5-i; j++){
        //         str += " " + " ";
        //     }

        //     for(int k=1; k<=i; k++){
        //         str += " " + "*";
        //     }

        //     System.out.println(str);
        // }

        // pyramid pattern

        //     int row = 56;
        // for(int i=0; i<row; i++){
        //     String str = "";
        //     for(int k=row-i; k>1; k--){
        //         str += " ";
        //       //  System.out.print(" ");
        //     }
        //     for(int j=0; j<=i; j++){
        //         str +=   "* " ;
        //        // System.out.print("* ");
        //     }
        //     System.out.println(str);
        // }

        // Diamond pattern

    //    int i,j,k,row=50;
    //         // up side 
    //    for(int m=0; m<row-1; m++){
    //        String up = "";
    //         for(int n=0; n<row - m; n++){
    //             up += " ";
    //         }

    //         for(int s=0; s<m; s++){
    //             up += "* ";
    //         }
    //         System.out.println(up);
    //    }

    //    // down side
    //    for(i=0; i<row; i++){
    //       String str = "";
    //       for(k=0; k<=i; k++){
    //         str += " ";
    //     }
    //        for(j=row-i; j>1; j--){
    //          str += "* ";
    //        }
          
    //        System.out.println(str);
    //    }

    // downward triangle pattern


        int i,j,row=10;

        for(int c=0; c<row; c++){
            String first = "";
            for(int l=0; l<c; l++){
                first += " " + "*";
            }
            System.out.println(first);
        }
    for(i=0; i<row; i++){
        String str = "";


        for(j=row-i; j>0; j--){
            str += " " + "*";
        }
        System.out.println(str);
    }
    }
}
