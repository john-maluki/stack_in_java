public class Stack {
  int array[] = new int[5];
  int top = 0;

  public void push(int x) {
    array[top] = x;
    top++;
  }

  public int pop(){
    int x = array[top--];
    return x;
  }

  public int peek(){
    return array[top];
  }

  public void show(){
    for(int i = 0; i < top; i++){
      System.out.println(" " + array[i]);
    }
  }

}