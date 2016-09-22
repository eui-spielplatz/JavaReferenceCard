// CharSequence ist Interface, das String implementiert!

public class String implements CharSequence,
		Comparable<String> {
	public String(); // leerer String ""
	public String(byte[] bytes);
	public String(char[] value);
	public String(String original);

	public char charAt(int index);
	public char[] toCharArray();

	public boolean contains(CharSequence s);
	public boolean startsWith(String prefix);
	public boolean endsWith(String suffix);
	public boolean isEmpty();

	public String replace(CharSequence target,
			CharSequence replacement);
	public String toLowerCase();
	public String toUpperCase();

	// "qbc".substring(2, 3) --> "c"
	// "Harbison".substring(3) --> "bison"
	public String substring(int begin, int end);
	public String substring (int beginIndex);

	// Whitespace am Anfang / Ende entfernen
	public String trim();

	// String an regex (bzw. einfach String) trennen
	public String[] split(String regex);

	// Index des ersten / letzten Auftretens von str
	public int indexOf(String str);
	public int lastIndexOf(String str);
	public int hashCode();
	public int length();

	// Implementiert Comparable mit lexikal Reihenfolge
	// (Unicode / Länge), return value  > 0, falls other
	// früher im Alphabet
	public int compareTo(String other);

	// String-Darstellung der Werte. b kann sein:
	// boolean, char, double, float, int, long, Object
	public static String valueOf(b);
}
