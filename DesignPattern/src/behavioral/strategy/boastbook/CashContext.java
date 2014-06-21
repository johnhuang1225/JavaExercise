package behavioral.strategy.boastbook;

public class CashContext {
	private CashSuper cs;

	public CashContext(CashType type) {
		switch (type) {
		case NORMAL:
			cs = new CashNormal();
			break;
		case REBATE:
			cs = new CashRebate(0.8);
			break;
		case RETURN:
			cs = new CashReturn(1000, 100);
			break;
		default:
			break;
		}
	}

	public double calculate(double money) {
		return cs.acceptCash(money);
	}
}
