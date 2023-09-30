package com.skss.spring.dto;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.skss.spring.configuration.AppConfiguration;

public class WebConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {AppConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}
}
