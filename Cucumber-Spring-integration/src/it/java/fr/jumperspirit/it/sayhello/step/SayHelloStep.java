package fr.jumperspirit.it.sayhello.step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SayHelloStep extends AbstractStep {

	@Autowired
	protected MockMvc mockMvc;

	private ResultActions resultActions;

	@When("^the client calls /sayhello$")
	public void the_client_calls_sayhello() throws Throwable {
		resultActions = mockMvc
				.perform(MockMvcRequestBuilders.get("http://localhost:8080/sayhello").accept(MediaType.TEXT_PLAIN));
	}

	@Then("^the client receives status code of (\\d+)$")
	public void the_client_receives_status_code_of(int arg1) throws Throwable {
		resultActions.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Then("^the client receives \"([^\"]*)\"$")
	public void the_client_receives(String arg1) throws Throwable {
		resultActions.andExpect(MockMvcResultMatchers.content().string(arg1));
	}
}
