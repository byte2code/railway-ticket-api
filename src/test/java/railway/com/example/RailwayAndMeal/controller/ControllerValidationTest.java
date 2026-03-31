package railway.com.example.RailwayAndMeal.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import railway.com.example.RailwayAndMeal.service.RailwayService;

@WebMvcTest(Controller.class)
class ControllerValidationTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private RailwayService railwayService;

	@Test
	void rejectsInvalidPostBody() throws Exception {
		mockMvc.perform(post("/railway/ticket")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"pnr\":0,\"name\":\"AB\",\"age\":28,\"birth\":\"LOWER\"}"))
			.andExpect(status().isBadRequest());
	}

	@Test
	void rejectsInvalidPutBody() throws Exception {
		mockMvc.perform(put("/railway/ticket")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"pnr\":0,\"name\":\"AB\",\"age\":28,\"birth\":\"LOWER\"}"))
			.andExpect(status().isBadRequest());
	}
}
