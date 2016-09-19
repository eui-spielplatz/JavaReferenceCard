public interface SortedSet<E> extends Set<E> {
	// Verwendeten Comparator erhalten, null für
	// die durch Comparable induzierte Ordnung
	Comparator<? super E> comparator();

	// first = niedrigstes, last = höchstes bzgl. Ordnung
	E first();
	E last();

	// headSet(): Alle Werte kleiner toElement
	// headSet(): Alle Werte größer toElement
	SortedSet<E> headSet(E toElement);
	SortedSet<E> tailSet(E fromElement);

	E headSet(E toElement);
}
