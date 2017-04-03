package gy.configuration.config;

import gy.configuration.beans.ConfigurationStudent;
import gy.configuration.scanBeans.ScanStudent;
import org.springframework.context.annotation.*;

/**
 * Created by yantao on 2017/4/2.
 */
@Configuration
@Import(BaseConfigurationImpt.class)
public class BaseConfiguration {

    @Bean
    @Scope(value = "prototype")
    public ConfigurationStudent configurationStudentProtoType() {
        return new ConfigurationStudent();
    }

    @Bean
    public ConfigurationStudent configurationStudentSigton() {
        return new ConfigurationStudent();
    }

    @Bean(name = {"scanStudent1","scanStudent"},initMethod = "init", destroyMethod="distory" )
    public ScanStudent scanStudent() {
        return new ScanStudent();
    }
}
