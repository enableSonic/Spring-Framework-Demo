package com.up1.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.up1.demo.exception.JSONError;

public class BaseController {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleAllExceptions(Exception ex) {
		return new JSONError(ex.getMessage()).asModelAndView();
	}

	@ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED, reason = "Contact not found")
	public void notFound() {
	}

}
