package s_11.springdata.spittr.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration

@EnableJpaRepositories(basePackages = {"s_11.springdata.spittr.db","s_11.springdata.spittr.domain"})
public class SpringDataJpaConfig {
  
  @Bean
  public DataSource dataSource() {
    ComboPooledDataSource ds;
    ds = new ComboPooledDataSource();
    ds.setDataSourceName("com.mysql.jdbc.Driver");
    ds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
    ds.setUser("root");
    ds.setPassword("root");
    return ds;
  }
  
  @Bean
  public JpaTransactionManager transactionManager() {
    return new JpaTransactionManager(); // does this need an emf???
  }
  
  @Bean
  public HibernateJpaVendorAdapter jpaVendorAdapter() {
    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
    adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
    return adapter;
  }
  
  @Bean
  public Object emf() {
    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
    emf.setDataSource(dataSource());
    emf.setJpaVendorAdapter(jpaVendorAdapter());
    emf.setPackagesToScan("s_11.jpahibernate.spittr");
    return emf;
  }
  
}
