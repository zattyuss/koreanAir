package koreanAir.copy.config;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import koreanAir.copy.AppTest;

public class RootConfigTest extends AppTest{

	@Autowired
	DataSource dataSource;
	
	@Test
	public void dataSourceTest() {
		assertNotNull(dataSource);
	}
}
