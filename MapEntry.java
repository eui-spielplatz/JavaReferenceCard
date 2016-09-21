public interface Map.Entry<K,V> {
	public K getKey();
	public V getValue();

	// Verändert auch Eintrag in der Map selbst
	public V setValue();
}
