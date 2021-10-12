public class MoneyAccount {
    private static MoneyAccount moneyAccount;
    private Integer account;

    public MoneyAccount() {
        account = 10;
    }

    public static MoneyAccount getInstance() {
        if (moneyAccount == null) {
            moneyAccount = new MoneyAccount();
        }
        return moneyAccount;
    }

    public void cache(final int money) {
        account -= money;
    }

    public Integer getAccount() {
        return account;
    }

}
