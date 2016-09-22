public class CustomException extends Exception {
	int value;

	public CustomException(int value) {
		this.value = value;
	}
}
