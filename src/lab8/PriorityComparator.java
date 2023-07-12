package lab8;

import java.util.Comparator;

public class PriorityComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
	// TODO Auto-generated method stub
	if (o1.priority == o2.priority) {
	    return 0;
	} else if (o1.priority > o2.priority) {
	    return -1;
	}
	return 1;
    }

}
