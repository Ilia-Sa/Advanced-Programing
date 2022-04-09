package ilia;

//subtraction of two numbers.
public class calcMinus implements Calculate{
    private int num1m;
    private int num2m;

    public int getNum1m() {
        return num1m;
    }

    public void setNum1m(int num1m) {
        this.num1m = num1m;
    }

    public int getNum2m() {
        return num2m;
    }

    public void setNum2m(int num2m) {
        this.num2m = num2m;
    }

    @Override
    public void calc(){
        System.out.println("Enter the numbers you want to subtract:");
        setNum1m(sc.nextInt());
        setNum2m(sc.nextInt());
        System.out.print("The result of " + getNum1m() + "-" +getNum2m() + " is:");
        System.out.println(getNum1m()-getNum2m());
    }
}
