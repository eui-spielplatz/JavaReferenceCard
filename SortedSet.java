public interface SortedSet<E> extends Set<E> {
	Comparator<? super E> comparator();
}
