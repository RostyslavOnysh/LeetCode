package LeetCode.task_284_Peeking_Iterator;

import java.util.Iterator;

class Solution implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;
    private boolean hasCachedNext;


    public Solution(Iterator<Integer> iterator) {
        this.iterator = iterator;
        advanceIterator();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextElement;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer result = nextElement;
        advanceIterator();
        return result;
    }

    @Override
    public boolean hasNext() {
        return hasCachedNext;
    }

    private void advanceIterator() {
        if (iterator.hasNext()) {
            nextElement = iterator.next();
            hasCachedNext = true;
        } else {
            nextElement = null;
            hasCachedNext = false;
        }
    }
}