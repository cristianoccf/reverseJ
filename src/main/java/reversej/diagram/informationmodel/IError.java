package reversej.diagram.informationmodel;

import reversej.diagram.Information;

public class IError implements Information {
	private static String VALUE = "information_error";
	IError(){}
	@Override
	public String getValue() {
		return VALUE;
	}

	@Override
	public String describe() {
		return this.getClass().getSimpleName() + " : " + getValue();
	}
}
