package practice;

public class Account {
    int a;
    int b;

    public  void setData(int a, int b){
        this.a = a;
        this.b = b; // Miért nem működött a videó szerint???Nem jó a This...
    }
    public void showData(){
        System.out.println("Value of A =" + a);
        System.out.println("Value of B =" + b);
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.setData(2, 3);
        obj.showData();
    }
}
