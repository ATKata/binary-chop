import java.util.Arrays;

public class BinaryChop {
    public int chop(int searchingFor, int[] data) {
        int result;
        int size = data.length;
        int middle = size/2;
        int offset = 0;

        if(data.length == 0) {
            return -1;
        }

        if(data[middle] == searchingFor) {
            return middle;
        }

        if(middle == 0) {
            return -1;
        }

        if(searchingFor > data[middle]) {
            result = chop(searchingFor, Arrays.copyOfRange(data, middle, data.length));
            offset = middle;
        } else {
            result = chop(searchingFor, Arrays.copyOfRange(data, 0, middle));
        }

        if ( result != -1 ) {
            return offset + result;
        }

        return result;
    }
}
