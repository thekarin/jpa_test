package me.ggulmool.jpatest;

import me.ggulmool.jpatest.config.TestConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
//@ContextConfiguration(classes = TestConfiguration.class)
public class JpaTestApplicationTests {

    @Autowired
    String myBean;

    @Test
    public void name() throws Exception {

    }
}
