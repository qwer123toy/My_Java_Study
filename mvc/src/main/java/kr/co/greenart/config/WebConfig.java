package kr.co.greenart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// Spring MVC 설정을 활성화합니다.
@EnableWebMvc
// "kr.co.greenart" 패키지를 컴포넌트 스캔하여 Spring Bean으로 등록합니다.
@ComponentScan("kr.co.greenart")
public class WebConfig implements WebMvcConfigurer {

	// 뷰 리졸버(View Resolver)를 설정합니다.
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// JSP 파일의 경로와 확장자를 설정합니다.
		// "/WEB-INF/views/" 경로에 있는 JSP 파일을 사용하며, 확장자는 ".jsp"입니다.
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	// 정적 리소스 핸들러를 추가합니다.
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// "/static/**" 경로로 요청이 들어오면, "/static/" 폴더에 있는 리소스들을 참조합니다.
		// 즉, 정적 리소스(이미지, CSS, JavaScript 등)의 위치를 지정합니다.
		registry.addResourceHandler("/static/**")
		.addResourceLocations("/static/");
	}
}
