package lab8;

import java.util.Comparator;

public class MyComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
	// TODO Auto-generated method stub
	if (o1.priority == o2.priority) {
	    if (weight(o1) > weight(o2)) {
		return -1;
	    }
	} else if (o1.priority > o2.priority) {
	    return -1;
	} else {
	    return 1;
	}
	return 0;
    }

    // some weighting function that can prioritize length, deadline, and priority.
    // I just messed around with the formula until I got something that seems to
    // work better than the priority.
    private double weight(Task task) {
	double dTime = task.deadline - task.length; // time before deadline
	return dTime / task.deadline;
    }

}
