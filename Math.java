public class Math {
	public static double E;
	public static double PI;

	// T kann sein: double, float, int, long
	public static T abs(T a);
	public static T max(T a, T b);
	public static T min(T a, T b);

	public static double sin(double a);
	public static double cos(double a);
	public static double tan(double a);

	public static double sinh(double x);
	public static double cosh(double x);
	public static double tanh(double x);

	public static double acos(double a);
	public static double asin(double a);
	public static double atan(double a);
	public static double atan2
			(double y, double x);

	// log = natürlicher logarithmus
	public static double exp(double a);
	public static double log(double a);
	public static double log10(double a);

	// Quadrat- / Kubikwurzel
	public static double sqrt(double a);
	public static double cbrt(double a);

	public static double pow(double a, double b);

	// Runden auf größere / kleinere / nächste Ganzzahl
	// Beachte Typen der Rückgabewerte!!
	public static double ceil(double a);
	public static double floor(double a);
	public static long round(double a);
	public static int round(float a);

	// Zufälliger Wert zwischen 0.0 und 1.0
	public static double random();
}
