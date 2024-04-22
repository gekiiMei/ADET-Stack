public class IntStack {
    int[] arr = new int[100];
    int topIndex = -1;
    public IntStack(int[] initialArr) {
        //fill arr with initialArr
        for (int i=0; i<initialArr.length; ++i) {
            this.arr[i] = initialArr[i];
        }
        topIndex = initialArr.length-1;
    }
    public IntStack() {} //just construct the object

    public boolean push(int n) {
        if (topIndex+1 > 99) {
          return false; //return false if push isnt possible
        }
        topIndex++;
        arr[topIndex] = n;
        return true;
    }

    public boolean isFull() {
        return (topIndex == 99);
      }

    public boolean isEmpty() {
        return topIndex == -1; // Stack is empty if the top index is -1
    }

    public int top() {
        if (!isEmpty()) {
            return stackArray[topIndex];
        } else {
            System.out.println("Stack is empty.");
            return -1; 
        }
    }

    public static void main(String[] args) {
        IntStack st = new IntStack();
        

    }
}
