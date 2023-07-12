package lab8;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MyPriorityQueue<T> extends AbstractQueue<T> {
    private ArrayList<T> array;
    private Comparator<T> comparator;

    public MyPriorityQueue(Comparator<T> queueComparator) {
	// TODO Auto-generated constructor stub
	this.array = new ArrayList<T>();
	this.comparator = queueComparator;
    }

    private void percolateDown(int hole) {
	// TODO Auto-generated method stub
	int lint = leftChild(hole);
	int rint = rightChild(hole);

	if (lint >= size()) {
	    return;
	} else if (rint >= size()) {
	    // do no right case
	    T cur = this.array.get(hole);
	    T left = this.array.get(lint);
	    if (comparator.compare(cur, left) > 0) {
		this.array.set(lint, cur);
		this.array.set(hole, left);
	    }
	    return;
	}

	T cur = this.array.get(hole);
	T left = this.array.get(lint);
	T right = this.array.get(rint);
	int c = comparator.compare(left, right);

	// finds sign of of comparator
	switch (c / Math.abs(c)) {
	case -1:
	    this.array.set(lint, cur);
	    this.array.set(hole, left);
	    percolateDown(lint);
	    return;
	case 1:
	    this.array.set(rint, cur);
	    this.array.set(hole, right);
	    percolateDown(rint);
	    return;

	}
    }

    private void percolateUp(int hole) {
	// TODO Auto-generated method stub
	if (hole == 0) {
	    return;
	}

	int partent = parent(hole);
	T cur = this.array.get(hole);
	T par = this.array.get(partent);

	if (comparator.compare(cur, par) < 0) {
	    this.array.set(partent, cur);
	    this.array.set(hole, par);
	    percolateUp(partent);
	}
    }

    @Override
    public boolean offer(T item) {
	// TODO Auto-generated method stub
	this.array.add(item);
	percolateUp(size() - 1);
	return true;
    }

    private int parent(int x) {
	return (x - 1) / 2;
    }

    private int leftChild(int x) {
	return 2 * x + 1;
    }

    private int rightChild(int x) {
	return 2 * x + 2;
    }

    @Override
    public T poll() {
	// TODO Auto-generated method stub
	T pol = this.array.remove(0);
	if (size() == 0) {
	    return pol;
	}
	this.array.add(0, this.array.remove(size() - 1));
	percolateDown(0);
	return pol;
    }

    @Override
    public T peek() {
	// TODO Auto-generated method stub
	return this.array.get(0);
    }

    @Override
    public Iterator<T> iterator() {
	// TODO Auto-generated method stub
	return array.iterator();
    }

    @Override
    public int size() {
	// TODO Auto-generated method stub
	return this.array.size();
    }

    public void clear() {
	this.array.clear();
    }

}
