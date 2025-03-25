package com.test.exceptions;

import java.io.Serial;

public class ProductNotFoundExcepton extends RuntimeException
{

    @Serial
    private static final long serialVersionUID = 1L;
	
	public ProductNotFoundExcepton(String msg)
	{
		super(msg);
	}
}
