public class NavigableMap<K,V>
		extends SortedMap<K,V> {
	// Siehe NavigableSet
	public Map.Entry<K,V> ceilingEntry(K key);
	public Map.Entry<K,V> floorEntry(K key);

	public NavigableMap<K, V> descendingMap();

	// Zurückgeben und entfernen
	public Map.Entry<K,V> pollFirstEntry();
	public Map.Entry<K,V> pollLastEntry();
}
