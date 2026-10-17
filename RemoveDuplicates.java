public class RemoveDuplicates{
    public static void main(String[] args){
         int[] array1 = {1,1,2,2,3,3,4,4};
        
        for(int i = 0;i<array1.length;i++){
            int count = 0;
            for(int j = 0;j<i;j++){
                if(array1[i]==array1[j]){
                    count++;
                    break;
                };
            };
            if(count == 1){
                System.out.println(array1[i]);
                // System.out.println(count);
            };
        };
    };   
};