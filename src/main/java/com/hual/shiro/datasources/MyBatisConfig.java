package com.hual.shiro.datasources;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * springboot集成mybatis的基本入口 1）创建数据源(如果采用的是默认的tomcat-jdbc数据源，则不需要)
 * 2）创建SqlSessionFactory 3）配置事务管理器，除非需要使用事务，否则不用配置
 */
//@Configuration // 该注解类似于spring配置文件
//@MapperScan(basePackages = "com.hual.shiro.mapper")
public class MyBatisConfig {

//    @Autowired
//    private Environment env;
//
//    /**
//     * 创建数据源(数据源的名称：方法名可以取为XXXDataSource(),XXX为数据库名称,该名称也就是数据源的名称)
//     */
//    @Bean
//    public DataSource myDs1DataSource() throws Exception {
//        Properties props = build(env,"spring.datasource.druid1.");
//        return DruidDataSourceFactory.createDataSource(props);
//    }
//
//    @Bean
//    public DataSource myDs2DataSource() throws Exception {
//        Properties props = build(env,"spring.datasource.druid2.");
//        return DruidDataSourceFactory.createDataSource(props);
//    }
//
//    /**
//     * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
//     * @Qualifier 根据名称进行注入，通常是在具有相同的多个类型的实例的一个注入（例如有多个DataSource类型的实例）
//     */
//    @Bean
//    @Primary
//    public DynamicDataSource dataSource(@Qualifier("myDs1DataSource") DataSource myTestDbDataSource,
//                                        @Qualifier("myDs2DataSource") DataSource myTestDb2DataSource) {
//        Map<Object, Object> targetDataSources = new HashMap<>();
//        targetDataSources.put(DataSourceType.ds1, myTestDbDataSource);
//        targetDataSources.put(DataSourceType.ds2, myTestDb2DataSource);
//
//        DynamicDataSource dataSource = new DynamicDataSource();
//        dataSource.setTargetDataSources(targetDataSources);// 该方法是AbstractRoutingDataSource的方法
//        dataSource.setDefaultTargetDataSource(myTestDbDataSource);// 默认的datasource设置为myTestDbDataSource
//
//        return dataSource;
//    }
//
//    /**
//     * 根据数据源创建SqlSessionFactory
//     */
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DynamicDataSource ds) throws Exception {
//        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
//        fb.setDataSource(ds);// 指定数据源(这个必须有，否则报错)
//        // 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
//        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));// 指定基包
//        fb.setMapperLocations(
//                new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));//
//
//        return fb.getObject();
//    }
//
//    /**
//     * 配置事务管理器
//     */
//    @Bean
//    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    /**
//     * 主要针对druid数据库链接池
//     * @param env
//     * @param prefix
//     * @return
//     */
//    protected Properties build(Environment env, String prefix) {
//        Properties prop = new Properties();
//        prop.put("url", env.getProperty(prefix + "url"));
//        prop.put("username", env.getProperty(prefix + "username"));
//        prop.put("password", env.getProperty(prefix + "password"));
//        prop.put("driverClassName", env.getProperty(prefix + "driverClassName", ""));
//        prop.put("initialSize", env.getProperty(prefix + "initialSize"));
//        prop.put("maxActive", env.getProperty(prefix + "maxActive"));
//        prop.put("minIdle", env.getProperty(prefix + "minIdle"));
//        prop.put("maxWait", env.getProperty(prefix + "maxWait"));
//        prop.put("poolPreparedStatements", env.getProperty(prefix + "poolPreparedStatements"));
//
//        prop.put("maxPoolPreparedStatementPerConnectionSize",
//                env.getProperty(prefix + "maxPoolPreparedStatementPerConnectionSize"));
//
//        prop.put("validationQuery", env.getProperty(prefix + "validationQuery"));
////        prop.put("validationQueryTimeout", env.getProperty(prefix + "validationQueryTimeout", Integer.class));
//        prop.put("testOnBorrow", env.getProperty(prefix + "testOnBorrow"));
//        prop.put("testOnReturn", env.getProperty(prefix + "testOnReturn"));
//        prop.put("testWhileIdle", env.getProperty(prefix + "testWhileIdle"));
//        prop.put("timeBetweenEvictionRunsMillis", env.getProperty(prefix + "timeBetweenEvictionRunsMillis"));
//        prop.put("minEvictableIdleTimeMillis", env.getProperty(prefix + "minEvictableIdleTimeMillis"));
//        prop.put("filters", env.getProperty(prefix + "filters"));
//        return prop;
//    }

}
