package guru.springframework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Modified by Pierrot on 11/30/2021.
 */
@SpringBootTest
 class Spring5RecipeAppApplicationTests {

	@Test
	 void contextLoads(ApplicationContext appCtx) {
		assertThat(appCtx).isNotNull();
	}

}
