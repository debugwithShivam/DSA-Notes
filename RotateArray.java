import java.util.ArrayList;
import java.util.List;
public class RotateArray{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        int num = 4;
        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        for(int i = 0;i < num;i++){
            start.add(array[i]);
        };
        for(int i = num;i < array.length;i++){
            end.add(array[i]);
        };


        List<Integer> result = new ArrayList<>(end);
        result.addAll(start);
        System.out.println(result);



    };
};