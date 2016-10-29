public class MyDynamicStack 
 {  private int stackSize;
    private int[] stackArr;
    private int top;
 
    public MyDynamicStack(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
 
    
    public void push(int entry){
        if(this.isStackFull()){
            this.increaseStackCapacity();
        }
        
        this.stackArr[++top] = entry;
    }
 
   
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            System.out.println("--");
            
        }
        int entry = this.stackArr[top--];
        return entry;
    }
     
    
    public long peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
         
        int[] newStack = new int[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
    public boolean isStackEmpty() {
        return (top == -1);
    }
public boolean isStackFull() {
        return (top == stackSize - 1);
    }
 
    public static void main(String[] args) {
        MyDynamicStack stack = new MyDynamicStack(2);
        for(int i=1;i<10;i++){
            stack.push(i);
        }
    
        }
    }