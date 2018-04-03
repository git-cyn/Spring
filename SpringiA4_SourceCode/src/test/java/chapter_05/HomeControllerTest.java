package chapter_05;

<<<<<<< HEAD
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import s_05.web.HomeController;
=======
import Chapter_05.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
>>>>>>> e9c206d723a10569bc7b1e1907fcce1a985f54c7

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
    HomeController controller = new HomeController();
    MockMvc mockMvc = standaloneSetup(controller).build();
    mockMvc.perform(get("/")).andExpect(view().name("home"));
  }

}
