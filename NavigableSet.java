public class NavigableSet<E>
		extends SortedSet<E> {
	// ceiling: Kleinstes Element >= e (non-existent: null)
	// floor: Größtes Element <= e (non-existent: null)
	public E ceiling(E e);
	public E floor(E e);

	// higher = ceiling, lower = floor; aber mit > / <
	public E higher(E e);
	public E lower(E e);

	// headSet(): Alle Werte < to (oder <= falls incl.)
	// tailSet(): Alle Werte > from (oder >= falls incl.)
	public SortedSet<E> headSet(E to,
			boolean inclusive);
	public SortedSet<E> tailSet(E from,
			boolean inclusive);

	// iterator() (da Iterable) ist aufsteigend
	// descendingIterator() ist absteigend
	public Iterator<E> descendingIterator();

	// Niedrigstes (first) / höchstes (last) Element
	// zurückgeben und entfernen (non-existent: null)
	public E pollFirst();
	public E pollLast();
}
