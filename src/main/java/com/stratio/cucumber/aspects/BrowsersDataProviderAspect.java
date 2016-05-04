package com.stratio.cucumber.aspects;

import com.google.common.collect.Lists;
import com.stratio.specs.BaseGSpec;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;

import java.util.Arrays;
import java.util.List;

@Aspect
public class BrowsersDataProviderAspect extends BaseGSpec {

	private final Logger logger = LoggerFactory.getLogger(this.getClass()
			.getCanonicalName());

	@Pointcut("execution (static * com.stratio.data.BrowsersDataProvider.available*(..)) ")
	protected void availableBrowsersCallPointcut() {
	}

	/**
	 * If a System property with FORCE_BROWSER exists then Methods in
	 * BrowsersDataProvider will return its value.
	 * 
	 * @param pjp
	 * @return Object
	 * @throws Throwable
	 */
	@Around(value = "availableBrowsersCallPointcut()")
	public Object availableBrowsersCalls(ProceedingJoinPoint pjp)
			throws Throwable {

		if (Arrays.asList(((ITestContext)pjp.getArgs()[0]).getIncludedGroups()).contains("mobile")) {
			return pjp.proceed();
		}else if ("".equals(System.getProperty("FORCE_BROWSER", ""))) {
			return pjp.proceed();
		} else {
			List<String[]> lData = Lists.newArrayList();
			lData.add(new String[] { System.getProperty("FORCE_BROWSER") });
			logger.debug("Forcing browser to {}",
					System.getProperty("FORCE_BROWSER"));
			return lData.iterator();
		}

	}
}
