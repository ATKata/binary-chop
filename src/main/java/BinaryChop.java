import java.util.Collection;

public class BinaryChop {
    public int chop(int searchingFor, int[] data) {

        for(int i = 0; i < data.length; i++){
            if(data[i] == searchingFor){
                return i;
            }
        }

        return -1;

    }
}
