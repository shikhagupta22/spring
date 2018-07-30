package com.nucleus.newpack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorChild implements BeanPostProcessor
{

	@Override
	public Object postProcessAfterInitialization(Object bean , String beanName)
			throws BeansException 
			{
		  System.out.println("After :Bean Name: "+ beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException 
			{
		  System.out.println("Before: Bean Name: "+ beanName);
			return bean;
	}

}
