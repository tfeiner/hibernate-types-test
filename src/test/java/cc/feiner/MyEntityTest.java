package cc.feiner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestJpaConfiguration.class)
@DataJpaTest
public class MyEntityTest {

	@Autowired
	private MyEntityDao myEntityDao;

	@Test
	public void testTags() {
		MyEntity article = myEntityDao.getOne(1L);
		assertThat(article.getTags()).isEmpty();
	}

}
