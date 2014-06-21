package behavioral.strategy.boastbook;

public class CashReturn implements CashSuper {
	private double coditionMoney;
	private double returnMoney;

	public CashReturn(double conditionMoney, double returnMoney) {
		this.coditionMoney = conditionMoney;
		this.returnMoney = returnMoney;
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (result >= coditionMoney) {
			result = Math.floor(money / coditionMoney) * returnMoney;
			result = money - result;
		}
		return result;
	}

}
