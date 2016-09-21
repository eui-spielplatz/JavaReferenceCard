public class SortedMap<K,V> extends Map<K,V> {
	public Comparator<? super K> comparator();

	// first = niedrigster Key, last = höchster Key
	public K firstKey();
	public K lastKey();
}
