package lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyPriorityQueueTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testPeek() {
	MyPriorityQueue<Integer> queue = new MyPriorityQueue<Integer>(Comparator.naturalOrder());
	queue.offer(10);
	queue.offer(20);
	queue.offer(5);
	assertEquals(5, queue.peek());
    }

    @Test
    public void testPoll() {
	MyPriorityQueue<Integer> queue = new MyPriorityQueue<Integer>(Comparator.naturalOrder());
	queue.offer(10);
	queue.offer(20);
	queue.offer(5);
	assertEquals(5, queue.poll());
	assertEquals(10, queue.poll());
	assertEquals(20, queue.poll());
	assertTrue(queue.isEmpty());
    }

    @Test
    public void testOffer() {
	MyPriorityQueue<Integer> queue = new MyPriorityQueue<Integer>(Comparator.naturalOrder());
	assertTrue(queue.offer(10));
	assertTrue(queue.offer(20));
	assertTrue(queue.offer(5));
	assertEquals(3, queue.size());
    }

    @Test
    public void testPercolateUp() {
	MyPriorityQueue<Integer> queue = new MyPriorityQueue<Integer>(Comparator.naturalOrder());
	queue.offer(10);
	queue.offer(20);
	queue.offer(5);
	queue.offer(15);
	assertEquals(4, queue.size());
	assertEquals(5, queue.poll());
	assertEquals(10, queue.poll());
	assertEquals(15, queue.poll());
	assertEquals(20, queue.poll());
	assertTrue(queue.isEmpty());
    }

    @Test
    public void testPercolateDown() {
	MyPriorityQueue<Integer> queue = new MyPriorityQueue<Integer>(Comparator.naturalOrder());
	queue.offer(10);
	queue.offer(5);
	queue.offer(15);
	queue.offer(20);
	queue.offer(25);
	assertEquals(5, queue.size());
	assertEquals(5, queue.poll());
	assertEquals(10, queue.poll());
	assertEquals(15, queue.poll());
	assertEquals(20, queue.poll());
	assertEquals(25, queue.poll());
	assertTrue(queue.isEmpty());
    }

}
