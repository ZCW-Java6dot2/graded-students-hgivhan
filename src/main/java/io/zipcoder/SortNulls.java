package io.zipcoder;
import java.util.Comparator;

public class SortNulls implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        if (s1 == null && s2 == null) {
            return 0;
            // if both null, no moving here, so return 0 to tell sorter not to remove them
        }
        if (s1 == null){
            return 1;
            // tells sorter to push null to the right
        }
        if (s2 == null){
            return -1;
            //tells sorter to move null to the right, if null is on left, gotta use -1 saying it's less than, sorting based on greater less than
        }
        // if neither are null, they can stay put
        return 0;
    }

}
