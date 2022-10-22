package homework;

import java.util.ArrayDeque;

public class ColaDegue {
	private ArrayDeque<String> dqe = new ArrayDeque<String>();

	public ColaDegue(ArrayDeque<String> dqe) {
		super();
		this.dqe = dqe;
	}

	public ColaDegue() {
		super();
		dqe.push("Sheldon");
		dqe.addLast("Leonard");
		dqe.addLast("Volovitc");
		dqe.addLast("Kutrapalli");
		dqe.addLast("Penny");
	}
	
	public void howMuchCouple(int cup) {
		for (int i = 0; i < cup; i++) {
			drink();
		}
		System.out.println(dqe);
	}
	private void drink() {
		String str = dqe.pollFirst();
		dqe.addLast(str);
		dqe.addLast(str);
	}
}
