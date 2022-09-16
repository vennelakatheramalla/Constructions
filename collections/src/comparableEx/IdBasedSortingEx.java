package comparableEx;

import java.util.Comparator;

public class IdBasedSortingEx implements Comparator<Employee> {

	    @Override
	    public int compare(Employee o1, Employee o2) {
	        return o1.getId() - o2.getId();
	    }

	}

