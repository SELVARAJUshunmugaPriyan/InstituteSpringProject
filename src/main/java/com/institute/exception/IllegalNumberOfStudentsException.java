package com.institute.exception;

import java.io.Serial;

public class IllegalNumberOfStudentsException extends Exception {

    /**
     * 
     */
    @Serial
    private static final long serialVersionUID = 1L;

	public IllegalNumberOfStudentsException(String msg)
	{
		super(msg);
	}
}
