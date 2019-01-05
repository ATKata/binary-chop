class BinaryChop {
    int chop(int searchingFor, int[] data) {

        int start = 0;
        int mid;
        int end = data.length - 1;

        while(start<=end){
            mid = (start + end)/2;

            if(data[mid]==searchingFor){
                return mid;
            }

            if(searchingFor<data[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }

        return -1;

    }
}
