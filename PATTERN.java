public class PATTERN{
  
        public static void main(String[] args){
            int rows=3;
            int columns=4;
            for(int i=0;i<rows;i++){
                for(int j=0;j<=columns;j++){
                    if((i%2==0)&&(j%2==0)){
                        System.out.print(" ");
                    }else{
                        System.err.print("*");
                    }
                }
                System.out.println();
            }
        }   
    }

      
    

