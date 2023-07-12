package lab8;

import java.util.Comparator;

public class LengthComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
	// TODO Auto-generated method stub
	if (o1.length == o2.length) {
	    return 0;
	} else if (o1.length < o2.length) {
	    return -1;
	}
	return 1;
    }

}
