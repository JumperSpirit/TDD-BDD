package fr.jumperspirit.it.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "fr.jumperspirit.rest.api" })
public class ItBootConfig {

	@Autowired
	protected WebApplicationContext context;

	@Bean
	public MockMvc mockMvc() throws Exception {
		return MockMvcBuilders.webAppContextSetup(context).build();
	}

}
