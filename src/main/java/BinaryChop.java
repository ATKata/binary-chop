import java.util.Arrays;

public class BinaryChop {
    public int chop(int searchingFor, int[] data) {

        if(data.length == 0) {
            return -1;
        }

        int size = data.length;
        int middle = size/2;

        if(data[middle] == searchingFor) {
            return middle;
        }

        if(middle == 0) {
            return -1;
        }

        int result = -1;
        if(searchingFor > data[middle]) {
            result = chop(searchingFor, Arrays.copyOfRange(data, middle, data.length));
            if ( result != -1 ) {
                return middle + result;
            }
        } else {
            return chop(searchingFor, Arrays.copyOfRange(data, 0, middle));
        }
        return -1;
    }
}
