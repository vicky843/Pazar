package com.vicky.pazar.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.vicky.pazar.controller.Register;
import com.vicky.pazar.model.Registermodel;

@Configuration
@ComponentScan("com.vicky")
@EnableTransactionManagement
public class AppConfiguration {

	@Bean(name="dataSource")
	public DataSource getH2DataSource(){
	
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/NIITDB");
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUsername("saiteja");
	dataSource.setPassword("saiteja843");
	
	return dataSource;
	}
		
	private Properties getHibernateProperties(){
		
		Properties properties=new Properties();
	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");	
	return properties;
	}
@Autowired
@Bean(name="sessionFactory")
public  SessionFactory getSessionFactory(DataSource dataSource)
{
	LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);	
	sessionBuilder.addProperties(getHibernateProperties());
	sessionBuilder.addAnnotatedClass(Registermodel.class);

	return sessionBuilder.buildSessionFactory();
}
@Autowired
@Bean(name="transcationManager")
public HibernateTransactionManager getTranscationManager(SessionFactory sessionfactory){
	HibernateTransactionManager transcationmanager= new HibernateTransactionManager(sessionfactory);
	return transcationmanager;
	
}
}

