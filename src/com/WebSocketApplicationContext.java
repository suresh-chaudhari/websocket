package com;


/**
 * The Class ZcalApplicationContext.
 *
 * @author nirmal
 */
public class WebSocketApplicationContext {

	/**
	 * The Enum SPRING_BEANS.
	 */
	public enum SPRING_BEANS{
		MONGO_OPERATION_TEMPLATE("mongoOpetation"),
		PERSISTANCE_SERVICE("persistenceService"),
		EVENT_LOGGING_SERVICE("tpEventLoggingService"),
		FEEDBACK_SERVICE("tpFeedbackService"),
		PLAN_SERVICE("tpPlanService"),
		OTP_MONITORING_SERVICE("otpMonitoringService"),
		BART_API_CLIENT("bartApiClient"),
		NEXT_BUS_API_CLIENT("nextBusApiClient"),

		NEXT_BUS_API_Impl("nextBusApiImpl"),
		BART_API_IMPL("bartApiImpl"),
		WMATA_API_IMPL("wmataApiImpl"),

		CALTRAIN_ADVISORIES_SERVICE("caltrainAdvisoriesService"),
		USER_MANAGEMENT_SERVICE("userManagementService"),
		Advisories_REST_SERVICE("advisoriesService"),
		APN_SERVICE("apnService"),
		GTFS_DATA_MONITOR("gtfsMonitoring"),
		TWITTER_ADVISORIES_SERVICE("twitterAdvisoriesService"),
		ADVISORIES_PUSH_SERVICE("advisoriesPushService"),
		GTFS_DATA_SERVICE("gtfsDataService"),
		TWITTER_SEARCH_MANAGER("twitterSearchManager"),
		FLURRY_MANAGEMENT_SERVICE("flurryManagementService"),
		SPORT_SERVICE("sportService"),
		ON_CONNECT_TV_API_SERVICE("OnConnectTvApiService"),
		GenericPushService("genericPushService"),
		sportDataSoccerService("sportDataSoccerService"),
		LOGGING_SERVICE("loggingService");
		String name;

		/**
		 * Instantiates a new sPRIN g_ beans.
		 *
		 * @param name the name
		 */
		private SPRING_BEANS(String name) {
			this.name = name;
		}

		/**
		 * Instantiates a new sPRIN g_ beans.
		 */
		private SPRING_BEANS() {
			this.name = name();
		}

		/**
		 * Bean.
		 *
		 * @return the string
		 */
		public String bean() {
			return name;
		}
	}

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
