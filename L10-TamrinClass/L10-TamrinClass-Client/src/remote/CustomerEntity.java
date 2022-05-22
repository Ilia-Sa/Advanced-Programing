package remote;

public class CustomerEntity {
    private Long deposit;
    private Long withdraw;

    public Long getDeposit() {
        return deposit;
    }

    public Long setDeposit(Long deposit) {
        this.deposit = deposit;
        return deposit;
    }

    public Long getWithdraw() {
        return withdraw;
    }

    public Long setWithdraw(Long withdraw) {
        this.withdraw = withdraw;
        return withdraw;
    }

}
