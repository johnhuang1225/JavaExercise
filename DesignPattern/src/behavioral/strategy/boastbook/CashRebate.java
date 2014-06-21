package behavioral.strategy.boastbook;

public class CashRebate implements CashSuper {
	private double rebate;

	public CashRebate(double rebate) {
		this.rebate = rebate;
	}

	@Override
	public double acceptCash(double money) {
		return money * rebate;
	}

}
