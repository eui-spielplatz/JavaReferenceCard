public interface List<E> extends Collection<E> {
	// Das index-te Elemente der Liste und alle folgenden
	// werden nach hinten verschoben und element bzw. c
	// davor eingefügt. Die Zählung beginnt bei 0!
	public void add(int index, E element);
	public void addAll(int index,
			Collection<? extends E> c);

	// Element an Stelle index abfragen / setzen
	// set gibt Element zurück, das zuvor an index stand
	public E get(int index);
	public E set(int index, E element);

	// indexOf (lastIndexOf) gibt Index des ersten
	// (letzten) Auftretens von o zurück (bzgl. equals)
	// oder -1, falls nicht gefunden
	public int indexOf(Object o);
	public int lastIndexOf(Object o);

	// Ist c == null, so wird nach Comparable-Ordnung
	// sortiert. Sortiert aufsteigend.
	public void sort(Comparator<? super E> c);

	// inklusive fromIndex; exklusive toIndex
	public List<E> subList(int fromIndex,
			int toIndex);
}
