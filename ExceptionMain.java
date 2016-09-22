public class ExceptionMain {
	public void doSomething(int value)
			throws CustomException {
		int limit = 0;

		if (value > limit) {
			throw new CustomException(value);
		}
	}
}
