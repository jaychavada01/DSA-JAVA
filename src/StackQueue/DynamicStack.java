package StackQueue;

public class DynamicStack extends Stack {
    public DynamicStack(){
        super(); // it will call Stack()
    }

    public DynamicStack(int size){
        super(size); // it will call Stack(int size)
    }

    @Override
    public boolean push(int item){
        // this takes care of it to not being full
        if(this.isFull()){
            // Double the array size
            int[] temp = new int[data.length * 2];

            // copy all previously allocated items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // Array is not full, insert item
        return super.push(item);
    }
}
