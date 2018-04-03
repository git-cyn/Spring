package s_10.spittr.jdbctest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import s_10.spittr.db.SpitterRepository;
import s_10.spittr.db.SpittleRepository;
import s_10.spittr.db.jdbc.JdbcSpitterRepository;
import s_10.spittr.db.jdbc.JdbcSpittleRepository;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
      .addScripts("classpath:schema.sql", "classpath:test-data.sql")
      .build();
  }
  
  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }
  
  @Bean
  public SpitterRepository spitterRepository(JdbcTemplate jdbcTemplate) {
    return new JdbcSpitterRepository(jdbcTemplate);
  }

  @Bean
  public SpittleRepository spittleRepository(JdbcTemplate jdbcTemplate) {
    return new JdbcSpittleRepository(jdbcTemplate);
  }
  
  @Bean
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

}
