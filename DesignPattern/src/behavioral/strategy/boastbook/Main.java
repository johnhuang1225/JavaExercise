package behavioral.strategy.boastbook;

import java.util.Random;

public class Main {

	public static int getRandomIndex() {
		Random r = new Random();
		return r.nextInt(5);
	}

	public static void main(String[] args) {
		double[] moneys = new double[] { 100, 400, 1200, 2000, 10000 };
		CashType[] types = { CashType.NORMAL, CashType.REBATE, CashType.RETURN };
		int index = getRandomIndex();
		double money = moneys[index];
		System.out.println("原始金額:" + money);
		for (int i = 0; i < types.length; i++) {
			CashContext c = new CashContext(types[i]);//Client端只認識CashContext
			System.out.println(c.calculate(money));
		}
	}
}
