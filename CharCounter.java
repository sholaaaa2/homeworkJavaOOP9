package homework;

import java.util.Objects;

public class CharCounter {
	private char ch;
	private int count = 0;
	
	public CharCounter(char ch) {
		super();
		this.ch = ch;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void addCount() {
		count = count+1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ch, count);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharCounter other = (CharCounter) obj;
		return ch == other.ch && count == other.count;
	}
	
}
