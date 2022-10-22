package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.TreeSet;

public class CharsInText {
	private File f;
	private char[] chArr = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	private char[] text;
	private TreeSet<CharCounter> tr = new TreeSet<CharCounter>(new CharCounterComparator());

	public CharsInText(File f) {
		super();
		this.f = f;
		readText();
	}

	public CharsInText() {
		super();
	}

	private void readText() {
		try (BufferedReader bf = new BufferedReader(new FileReader(f))) {
			String str = "";
			String str1 = "";
			for (; (str1 = bf.readLine()) != null;) {
				str += str1;
			}
			text = str.toCharArray();
			System.out.println(Arrays.toString(text));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void howManyChars() {
		for (char c : chArr) {
			CharCounter cc = new CharCounter(c);
			for (char a : text) {
				if (c == a) {
					cc.addCount();
				}
			}
			if (cc.getCount() != 0) {
				tr.add(cc);
			}
		}
		for (CharCounter counter : tr) {
			System.out.println(counter.getCh() + "-" + counter.getCount());
		}
	}
}
