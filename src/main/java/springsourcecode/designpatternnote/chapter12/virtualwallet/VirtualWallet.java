package springsourcecode.designpatternnote.chapter12.virtualwallet;

import java.math.BigDecimal;

public class VirtualWallet {

    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;
    private Boolean isAllowOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;

    //冻结和透支
    public void freeze(){}
    public void unfreeze(){}
    public void increaseOverdraftAmount(BigDecimal amount){}
    public void decreaseOverdraftAmount(BigDecimal amount){}
    public void closeOverdraft(){}
    public void openOverdraft(){}

    public VirtualWallet(Long preAllocatedId){
        this.id = preAllocatedId;
    }

    public BigDecimal balance(){
        return this.balance;
    }

    public void debit(BigDecimal amount){
        if (this.balance.compareTo(amount) < 0) {
            throw new RuntimeException("余额不足");
        }
        this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            throw new RuntimeException("不合规金额");
        }
        this.balance.add(amount);
    }

}
