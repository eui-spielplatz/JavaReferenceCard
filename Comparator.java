public interface Comparator<T> {
	// Ist o1 größer als o2, return > 0
	// Ist o1 gleich wie o2, return 0
	// Ist o1 kleiner als o2, return < 0
	public int compare(T o1, To2);

	// Return value ist Comparator mit umgekehrter
	// Reihenfolge
	public default Comparator<T> reversed();
}

// Vorgefertigt in Klasse String
// (String.CASE_INSENSITIVE_ORDER)
public static final Comparator<String>
		CASE_INSENSITIVE_ORDER;
