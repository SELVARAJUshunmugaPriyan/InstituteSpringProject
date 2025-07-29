package com.institute.exception;

import java.io.Serial;

public class NameNotFoundException extends Exception {

    /**
     * 
     */
    @Serial
    private static final long serialVersionUID = 1L;
	
	public NameNotFoundException(String msg)
	{
		super(msg);
	}

}
