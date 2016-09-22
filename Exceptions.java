
public class Exceptions {

	ArithmeticException e01;
	//Beispiel: Durch 0 teilen (extends RuntimeException)
	
	ArrayIndexOutOfBoundsException e02;
	//Lesen/Schreiben von Elementen, deren Index nicht im Array ist
	//Auch:
	IndexOutOfBoundsException e03;
	StringIndexOutOfBoundsException e04;
	
	NullPointerException e05;
	//Unerwartete Verwendung eines null-Werts (extends Runtime-Exception)
	
	RuntimeException e;
	//Alles was beim Ausführen so schief geht
}
