public interface Iterator<E> {
	public boolean hasNext();
	public E next();

	// Löscht Element, welches zuletzt
	// von next() zurückgegeben wurde
	// aus der dahinterliegenden Collection
	// Nur 1x pro next()-Aufruf
	public void remove();
}
