package fi.xmethod.util;

public class SuspiciousOperation extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SuspiciousOperation(String message) {
		super(message);
	}
}
