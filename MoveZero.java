import java.util.ArrayList;
import java.util.List;
public class MoveZero{
    public static void main(String[] args){
        int[] array = {1,0,2,0,3,0,4,0,55};
        
        List<Integer> num = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();

        for(int i = 0;i<array.length;i++){
            if(array[i]==0){
                zero.add(array[i]);
            }else{
                num.add(array[i]);
            };
        };

        List<Integer> result = new ArrayList<>(num);
        result.addAll(zero);
        System.out.println(result);
        
      
    };
};