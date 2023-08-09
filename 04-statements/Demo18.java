public class Demo18 {
    public static void main(String[] args) {
        
         /* 
            Nested Loops
            Via + / \


            + + + + + +
            + + / \ + +
            + / / \ \ +
            + \ \ / / +
            + + \ / + +
            + + + + + +
          */
        
        int width = 10;
        int y = 0;
        int k = 0;
        while (y++ < width){

            int x = 0;
            while (x++ < width){
                if (x > ((width/2)-k) && x <= ((width/2)+k)){
                    
                    if (x > ((width/2)-k) && x <= (width/2) && y <= (width/2) || 
                        x <= ((width/2)+k) && x > (width/2) && y >= ((width/2) + 1)){
                        System.out.print("/ ");
                    }else{
                        System.out.print("\\ ");
                    }

                }else{
                    System.out.print("+ ");
                }
            }

            if (y < (width/2)){
                k++;
            }else if(y >= (width/2 + 1)){
                k--; 
            }
            
            System.out.println();

        }
    }
}
