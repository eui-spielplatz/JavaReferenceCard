// Double-Ended Queue, "deck"
public interface Deque<E>
		extends Collection<E> {
	// Einfügen am Anfang / Ende, addLast = add
	public void addFirst(E e);
	public void addLast(E e);

	// Gibt erstes / letztes Objekt zurück oder null
	// falls Deque leer
	public E peekFirst();
	public E peekLast();

	// Löscht erstes / letztes Objekt und gibt es zurück,
	// oder null falls Deque leer
	public E pollFirst();
	public E pollLast();

	// Statt peek / poll gibt es auch get / remove
	// Diese werfen Exception falls Deque leer
}
