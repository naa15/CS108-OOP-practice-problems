import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyFilter implements Filter {

    private List<Integer> indexes;

    public MyFilter() {
        indexes = new ArrayList<Integer>();
    }

    @Override
    public int size() {
        return indexes.size();
    }

    @Override
    public boolean isPresent(int index) {
        int foundIndex = Collections.binarySearch(indexes, index);

        return foundIndex >= 0;
    }

    @Override
    public void add(int index) {
        int foundIndex = Collections.binarySearch(indexes, index);
        if (foundIndex >= 0) return;

        int newIndex = -foundIndex -1;
        indexes.add(newIndex, index);
    }

    @Override
    public void remove(int index) {
        int foundIndex = Collections.binarySearch(indexes, index);
        if (foundIndex < 0) return;

        indexes.remove(foundIndex);
    }

//    private Boolean[] indexes;
//    private int count;
//    private int len = 100;
//
//    public MyFilter() {
//        indexes = new Boolean[len];
//        for (int i = 0; i < indexes.length; i++) {
//            indexes[i] = false;
//        }
//        count = 0;
//    }
//
//    @Override
//    public int size() {
//        return count;
//    }
//
//    @Override
//    public boolean isPresent(int index) {
//        if (index < indexes.length) {
//            return indexes[index];
//        }
//       return false;
//    }
//
//    @Override
//    public void add(int index) {
//        if (index >= len) {
//            int newLen = len * 2;
//            Boolean [] newArr = new Boolean[newLen];
//            System.arraycopy(indexes,0, newArr, 0, len);
//            indexes = newArr;
//            len = newLen;
//        }
//        if (! indexes[index]) {
//            indexes[index] = true;
//            count++;
//        }
//    }
//
//    @Override
//    public void remove(int index) {
//       if (indexes[index]) {
//           indexes[index] = false;
//           count--;
//       }
//    }
}
