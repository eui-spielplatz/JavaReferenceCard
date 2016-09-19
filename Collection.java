public interface Collection<E>
		extends Iterable<E> {
	public boolean add(E e);
	public boolean addAll
			(Collection<? extends E> c);
	public void clear();
	public boolean contains(Object o);
	public boolean containsAll(Collection<?> c);
	public boolean isEmpty();
	public int size();

	// Reihenfolge ist nur bei bestimmten Collection-
	// Klassen definiert, z.B. LinkedList
	// Änderungen am zurückgegebenen Array ändern
	// die Collection selbst nicht (nicht jedoch
	// bei Änderungen an Array-Elementen).
	public Object[] toArray();

	// Entfernt erstes Element e, welches o.equals(e)
	// erfült. True, falls ein solches e existiert.
	public boolean remove(Object o);

	// Enterfernt alle Elemente, die auch in c
	// vorkommen. True, falls sich die Collection
	// dadurch ändert.
	public boolean removeAll(Collection<?> c);

	// Info: hashCode(), .equals() sind definiert
}
