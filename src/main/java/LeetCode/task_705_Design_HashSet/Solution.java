package LeetCode.task_705_Design_HashSet;

public class Solution {

    private boolean[] set;

    public Solution() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int key  = 100;
        obj.add(key);
        obj.remove(key);
        boolean param_3 = obj.contains(key);
        System.out.println("Чи є ключ у наборі? " + param_3);
    }
}
