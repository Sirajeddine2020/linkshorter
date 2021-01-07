package com.glibnoy.linkshorter.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Properties specific to Test.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public final class ApplicationProperties {

	private final Config config = new Config();
	
	@Getter
	@Setter
	public static final class Config {
		private int codeSize;
		private String hashAlgorithm;
	}
}
