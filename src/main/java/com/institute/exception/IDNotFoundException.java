package com.institute.exception;

import java.io.Serial;

public class IDNotFoundException extends Exception {

    /**
     * 
     */
    @Serial
    private static final long serialVersionUID = 1L;
	
	public IDNotFoundException(String msg)
	{
		super(msg);
	}

}
