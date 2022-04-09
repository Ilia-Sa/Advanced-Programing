package ilia;

//addition of two numbers.
public class calcPlus implements Calculate{
    private int num1p;
    private int num2p;

    public int getNum1p() {
        return num1p;
    }

    public void setNum1p(int num1p) {
        this.num1p = num1p;
    }

    public int getNum2p() {
        return num2p;
    }

    public void setNum2p(int num2p) {
        this.num2p = num2p;
    }

    @Override
    public void calc(){
        System.out.println("Enter the numbers you want to add:");
        setNum1p(sc.nextInt());
        setNum2p(sc.nextInt());
        System.out.print("The result of " + getNum1p() + "+" +getNum2p() + " is:");
        System.out.println(getNum1p()+getNum2p());
    }
}
