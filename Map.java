public interface Map<K, V> {
	public V get(Object key);

	// Gibt vorigen Wert an Stelle key zurück oder null
	public V put(K key, V value);
	public void putAll(Map<K, V> m);

	public boolean containsKey(Object key);
	public boolean containsValue(Object value);

	// Gibt entfernten Wert (oder null) zurück
	public V remove();
	public void clear();
	public boolean isEmpty();

	public int size();

	// Zum Iterieren geeignet:
	public Set<Map.Entry<K, V>> entrySet();
	public Set<K> keySet();
	public Collection<V> values();
}
