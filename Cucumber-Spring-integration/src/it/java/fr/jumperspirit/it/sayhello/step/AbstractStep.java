package fr.jumperspirit.it.sayhello.step;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import fr.jumperspirit.it.config.ItBootConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ItBootConfig.class, loader = SpringBootContextLoader.class)
@WebAppConfiguration
public abstract class AbstractStep {



}
