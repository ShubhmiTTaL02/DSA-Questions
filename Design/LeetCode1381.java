package Design;

class CustomStack {
    private int[] stack; 
    private int[] inc; 
    private int i;  
   
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        inc = new int[maxSize];
        i = 0;
    }

    public void push(int x) {
        if (i < stack.length) {
            stack[i++] = x;
        }
    }
    
    public int pop() {
        if (i <= 0) { 
            return -1;
        }
        int result = stack[--i] + inc[i]; 
        if (i > 0) { 
            inc[i - 1] += inc[i];
        }
        inc[i] = 0; 
        return result;
    }

    public void increment(int k, int val) {
        if (i > 0) { 
            int index = Math.min(i, k) - 1; 
            inc[index] += val; 
        }
    }
}