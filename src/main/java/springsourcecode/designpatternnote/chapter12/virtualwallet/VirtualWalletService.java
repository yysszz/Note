package springsourcecode.designpatternnote.chapter12.virtualwallet;

import java.math.BigDecimal;
import java.sql.ResultSet;

public class VirtualWalletService {

    private VirtualWalletReposity walletRepo;

    private VirtualWalletTransactionReposity transactionRepo;

    public VirtualWallet getWallet(Long walletId){
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = entityConvert2Domain(walletEntity);
        return wallet;
    }

    private VirtualWallet entityConvert2Domain(VirtualWalletEntity walletEntity) {
        return new VirtualWallet(1L);
    }

    public void debit(Long walletId, BigDecimal amount){
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = entityConvert2Domain(walletEntity);
        wallet.debit(amount);
        walletRepo.updateBalance(walletId,wallet.balance());
    }

    public void credit(Long walletId,BigDecimal amount){
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = entityConvert2Domain(walletEntity);
        wallet.credit(amount);
        walletRepo.updateBalance(walletId,wallet.balance());
    }

    public void transfer(Long fromWalletId,Long toWalletId,BigDecimal amount){

    }


}
