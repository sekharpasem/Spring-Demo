package com.spring.sample.config;

import javax.servlet.ServletRequest;

import org.audit4j.core.MetaData;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class AuditMetaData implements MetaData {
	private static final long serialVersionUID = 7243065407615627372L;

	public String getOrigin() {
		try {
			return ((ServletRequest) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
					.getRequest()).getRemoteAddr();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "unidentified";
	}

	public String getActor() {
	/*	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
			return ((UserDetails) authentication.getPrincipal()).getUsername();
		}*/
		return "anonymous";
	}
}
