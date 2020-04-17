package SpringBootWithHibernateCurd;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Properties;

@Configuration
//@PropertySource("application.properties")
public class HibernaConfig {
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String pasword;
    @Value("${spring.datasource.driver-class}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.jpa.properties.hibernate.dialect}")
    private String dilate;
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String hbm_2ddl;
    @Value("${spring.jpa.show-sql}")
    private String show_Sql;

    @Bean
    public DriverManagerDataSource getDriverManagerDataSource() {
        DriverManagerDataSource source = new DriverManagerDataSource(url, username, pasword);
        source.setDriverClassName(driver);
        return source;
    }

    public Properties properties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", dilate);
        properties.put("hibernate.show_sql", show_Sql);
        properties.put("hibernate.hbm2ddl.auto", hbm_2ddl);
        return properties;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactoryBean() {
        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();

        bean.setDataSource(getDriverManagerDataSource());
        bean.setHibernateProperties(properties());
        return bean;
    }

    @Bean
    public HibernateTransactionManager getManager() {
        HibernateTransactionManager manager = new HibernateTransactionManager();
        manager.setSessionFactory(getSessionFactoryBean().getObject());
        return manager;


    }


}
