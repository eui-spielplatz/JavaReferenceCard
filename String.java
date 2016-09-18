// CharSequence ist ein Interface, wird
// von String, CharBuffer, ... implementiert

public class String implements CharSequence {
	// Erzeugt leeren String ""
	public String();

	// Erzeugt String aus bytes
	public String(byte[] bytes);
	public String(char[] value);

	// Aus String / StringBuffer
	public String(String original);
	public String(StringBuffer buffer);

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
	public String substring
			(int beginIndex, int endIndex);

	// "Harbison".substring(3) --> "bison"
	public String substring (int beginIndex);

	// Whitespace am Anfang / Ende entfernen
	public String trim();

	// Index des ersten Auftretens von str
	// (last... letztes Auftreten)
	public int indexOf(String str);
	public int lastIndexOf(String str);
	public int hashCode();
	public int length();
}
