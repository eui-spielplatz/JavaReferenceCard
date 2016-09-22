public class Arrays {
	// T kann sein: byte, char, double, float int, long,
	// Object, short

	// Sucht key in aufsteigend sortiertem Array a; gibt
	// index zurück (negativ, falls nicht gefunden)
	public static int binarySearch(T[] a, T key);

	// Wahr, wenn gleiche Elemente in gleicher Reihenfolge
	public static boolean equals(T[] a, T[] b)

	public static void fill(T[] a, T val);

	// Sortiert aufsteigend (Quicksort, O(n log(n)))
	public static void sort(T[] a);
	public static void sort
			(T[] a, Comparator<T> c);

	// deepToString führ mehrdimensionale Arrays
	// Ausgabe z.B. "[1, 2, 3]", "[[1, 2], [2, 3]]"
	public static void toString(T[] a);
	public static void deepToString(T[] a);
}
