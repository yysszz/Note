package springsourcecode.designpatternnote.chapter12.virtualwallet;

import java.math.BigDecimal;

public interface VirtualWalletReposity {

    VirtualWalletEntity getWalletEntity(Long walletId);

    void updateBalance(Long walletId, BigDecimal balance);
}
