import java.util.Arrays;
import java.util.Collection;

public class BinaryChop {
    public int chop(int searchingFor, int[] data) {
        int offset = 0;
        while(data.length>0){
            int middle = data.length/2;
            if(data[middle]==searchingFor)
            {
                return offset + middle;
            }
            if(data.length == 1){
                break;
            }
            if(searchingFor > data[middle]){
                data = Arrays.copyOfRange(data,middle,data.length);
                offset +=middle;
            }else{
                data = Arrays.copyOfRange(data,0,middle);
            }
        }
        return -1;
    }
}
