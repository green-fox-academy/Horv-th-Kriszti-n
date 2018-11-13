package counter;

public class Counter {
    int counter;
    int resetNumber;

    Counter(){
        this.counter = 0;
    }
    Counter(int inputNumber){           // <--- This need If user write the number into it. If not then the default value(0) will be used.
        this.counter = inputNumber;
        this.resetNumber = inputNumber;
    }
    public void add(int number){
        counter += number;

    }
    public void add(){
        counter++;

    }
    public int get(){
        return counter;
    }
    public void reset(){
        counter = resetNumber;
    }
}
