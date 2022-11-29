package Configure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

public class ConfigureTopicsDB {
    @Primary
    @Bean
    @ConfigurationProperties("spring.secondDatasource")
    public DataSourceProperties dataSourceProperties(){
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "topicsDataSource")
    @ConfigurationProperties(prefix = "spring.secondDatasource")
    public DataSource topicsDataSource(@Qualifier("topicsDSProps") DataSourceProperties properties){
        return properties.initializeDataSourceBuilder().build();
    }
}
