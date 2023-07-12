package lab8;

import java.util.Comparator;

public class DeadlineComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
	// TODO Auto-generated method stub

	if (o1.deadline == o2.deadline) {
	    return 0;
	} else if (o1.deadline < o2.deadline) {
	    return -1;
	}
	return 1;
    }

}
