package kr.co.greenart.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 이 클래스는 Spring Web MVC에서 DispatcherServlet을 초기화하는 설정 클래스입니다.
 * AbstractAnnotationConfigDispatcherServletInitializer를 상속받아 필요한 설정들을 구현합니다.
 * XML 설정을 사용하지 않고, 자바 클래스를 통해 Spring의 설정을 구성합니다.
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 애플리케이션의 전역 설정을 담당하는 RootConfig 클래스를 반환합니다.
     * 루트 애플리케이션 컨텍스트는 주로 서비스, 리포지토리 등의 전역적인 bean을 관리합니다.
     * @return RootConfig 클래스를 담은 배열
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // RootConfig 클래스를 반환하여 루트 애플리케이션의 설정을 제공합니다.
        return new Class[] { RootConfig.class };
    }

    /**
     * DispatcherServlet에 대한 설정을 담당하는 WebConfig 클래스를 반환합니다.
     * 서블릿 애플리케이션 컨텍스트는 주로 웹 관련 bean을 관리합니다.
     * @return WebConfig 클래스를 담은 배열
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // WebConfig 클래스를 반환하여 서블릿 애플리케이션의 설정을 제공합니다.
        return new Class[] { WebConfig.class };
    }

    /**
     * DispatcherServlet이 처리할 URL 패턴을 정의합니다.
     * 여기서는 "/" 경로를 매핑하여 모든 요청을 DispatcherServlet으로 처리하도록 설정합니다.
     * @return "/" 패턴을 포함한 문자열 배열
     */
    @Override
    protected String[] getServletMappings() {
        // "/" 경로로 들어오는 모든 요청을 DispatcherServlet에서 처리하도록 매핑합니다.
        return new String[] { "/" };
    }

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter 
		= new CharacterEncodingFilter("UTF-8", true);
		
		return new Filter[] { encodingFilter};
	}

    

    

}
