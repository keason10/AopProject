package gy.configuration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yantao on 2017/4/2.
 */
@Configuration
@ComponentScan(basePackages = {"gy.configuration.scanBeans"})
public class BaseConfigurationImpt {
}

