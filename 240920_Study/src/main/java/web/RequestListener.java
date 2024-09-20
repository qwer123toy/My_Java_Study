package web;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class RequestListener implements ServletRequestListener{

	private static Logger log = LoggerFactory.getLogger(RequestListener.class);
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		
		String uri = request.getRequestURI();
		String method = request.getMethod();
		
//		System.out.println(uri + " " + method);
		log.info(uri + " " + method);
	}
	
}
