
public class ExceptionMain {

	public void doSomething(int value) throws CustomException{
		int limit = 0;
		//do stuff here
		if (value > limit){
			throw new CustomException(value);
		}
	}

}
