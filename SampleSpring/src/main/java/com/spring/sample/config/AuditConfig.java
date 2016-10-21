package com.spring.sample.config;

import org.audit4j.integration.spring.AuditAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AuditConfig {

	@Bean
	public AuditAspect auditAspect() {
		AuditAspect auditAspect = new AuditAspect();
		return auditAspect;
	}

	// If you want to load configurations from file
	// (resources/audit4j.conf.yaml),
	// comment below method
	/*@Bean
	public MongoAuditHandler databaseHandler() {
		MongoAuditHandler dbHandler = new MongoAuditHandler();
		return dbHandler;
	}*/

	// If you want to load configurations from file
	// (resources/audit4j.conf.yaml),
	// comment below method
	/*
	 * @Bean public SpringAudit4jConfig springAudit4jConfig() {
	 * SpringAudit4jConfig springAudit4jConfig = new SpringAudit4jConfig();
	 * springAudit4jConfig.setLayout(new SimpleLayout()); List<Handler> handlers
	 * = new ArrayList<Handler>(); handlers.add(new ConsoleAuditHandler());
	 * 
	 * handlers.add(databaseHandler());
	 * springAudit4jConfig.setHandlers(handlers);
	 * springAudit4jConfig.setMetaData(new AuditMetaData()); return
	 * springAudit4jConfig; }
	 */

}
