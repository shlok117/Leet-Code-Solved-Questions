class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s1= new Stack<>();
    Stack<Integer> minS1 = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        s1.push(val);
        if(minS1.isEmpty() || minS1.peek()>=val){
            minS1.push(val);
        }
    }
    
    public void pop() {
        if (s1.peek().equals(minS1.peek())) {
            minS1.pop();
        }
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minS1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */