package lab8;

import java.util.Comparator;

public class NameComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
	// TODO Auto-generated method stub
	Comparator<String> cmp = Comparator.naturalOrder();
	return cmp.compare(o1.name, o2.name);

    }

}
