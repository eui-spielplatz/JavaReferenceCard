public class TreeSet<E>
		implements NavigableSet<E> {
	// Neues, leeres Set. Entweder in Comparable-Ordnung
	// oder durch comparator geordnet
	public TreeSet();
	public TreeSet(Comparator<? super E> comparator);

	// Automatisch nach Comparable-Ordnung sortieren
	public TreeSet(Collection<? extends E> c);

	// Behält Ordnung bei
	public TreeSet(SortedSet<E> s);
}
