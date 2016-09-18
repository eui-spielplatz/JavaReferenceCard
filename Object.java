public class Object {
	// Muss reflexiv, symmetrisch, transitiv
	// und gleichbleibend sein
	public boolean equals(Object obj);

	protected Object clone()
			throws CloneNotSupportedException;

	// Für Zwei Objekte obj1, obj2 muss gelten:
	// obj1.equals(obj2)
	// => obj1.hashCode() = obj2.hashCode()
	public int hashCode();

	public String toString();
}
