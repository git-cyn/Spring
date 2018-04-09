package s_10.spittr.jdbctest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
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
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("com.mysql.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/test");
    ds.setUsername("root");
    ds.setPassword("root");
//    ComboPooledDataSource ds = new ComboPooledDataSource();
//    ds.setDataSourceName("com.mysql.jdbc.Driver");
//    ds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
//    ds.setUser("root");
//    ds.setPassword("root");
    return ds;
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
