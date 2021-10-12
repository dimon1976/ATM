

public class Atm extends Thread {
    private Integer id;
    private String userName;
    private Integer cacheAmount;
    private static final MoneyAccount moneyAccount = MoneyAccount.getInstance();

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public void setCacheAmount(final Integer cacheAmount) {
        this.cacheAmount = cacheAmount;
    }

    @Override
    public void run() {
        synchronized (moneyAccount) {
        final int lastMoney = MoneyAccount.getInstance().getAccount();
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (lastMoney < cacheAmount) {
            System.out.println(userName + " недостаточно средств.");
            return;
        }
        MoneyAccount.getInstance().cache(cacheAmount);

        System.out.println(userName + " выдано " + cacheAmount + "$ остаток на счете - "
                + MoneyAccount.getInstance().getAccount() + "$");
        }
    }
}
