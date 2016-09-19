public interface Comparable<T> {
	// Ist this größer als other, return > 0
	// Ist this gleich wie other, return 0
	// Ist this kleiner als other, return < 0
	// Muss transitiv sein
	public int compareTo(T other);
}
