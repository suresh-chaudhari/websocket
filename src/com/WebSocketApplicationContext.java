package com;


public class WebSocketApplicationContext {


	/** The ctxt. */
	private static WebSocketApplicationContext ctxt = new WebSocketApplicationContext();

	/** The main ctxt. */
	//	ClassPathXmlApplicationContext mainCtxt;

	org.springframework.context.ApplicationContext mainCtxt;


	/**
	 * Instantiates a new tP application context.
	 */
	private WebSocketApplicationContext(){
		//load();
	}

	/**
	 * Gets the single instance of OTPApplicationContext.
	 *
	 * @return single instance of OTPApplicationContext
	 */
	public static WebSocketApplicationContext getInstance(){
		return ctxt;
	}

	/**
	 * Gets the bean instance.
	 *
	 * @return the bean instance
	 */
	public static WebSocketApplicationContext getBeanInstance(){
		return ctxt;
	}

	/**
	 * Gets the bean.
	 *
	 * @param beanName the bean name
	 * @return the bean
	 */
	public Object getBean(String beanName) {
		return mainCtxt.getBean(beanName);
	}

	/**
	 * Gets the bean by name.
	 *
	 * @param beanName the bean name
	 * @return the bean by name
	 */
	public static Object getBeanByName(String beanName) {
		return getInstance().getBean(beanName);
	}

	public void setContext(org.springframework.context.ApplicationContext ctx) {
		this.mainCtxt = ctx;
	}
}
