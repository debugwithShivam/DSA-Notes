public class findUnique{
    public static void main(String[] args){
        int[] array = {1,1,2,2,5,3,3,4,4};

        int[] find = {};
        for(int i = 0;i<array.length;i++){
            int isDublicate = 0;
             for(int j =0 ;j<array.length;j++){
                   if(array[i] == array[j]){
                   ++isDublicate;
                   };
             };
             if(isDublicate <= 1){
             System.out.println(array[i]);
             }
        };
    };
}