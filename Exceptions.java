// Alles was beim Ausführen so schief geht
public class RuntimeException
		extends Exception;

// Beispiel: Durch 0 teilen
public class ArithmeticException
		extends RuntimeException;

// Lesen / Schreiben von Elementen, deren
// Index nicht im Array / String ist
public class IndexOutOfBoundsException
		extends RuntimeException;
public class ArrayIndexOutOfBoundsException
		extends IndexOutOfBoundsException;
public class StringIndexOutOfBoundsException
		extends IndexOutOfBoundsException;

// Unerwartete Verwendung eines null-Werts
public class NullPointerException
		extends RuntimeException;
