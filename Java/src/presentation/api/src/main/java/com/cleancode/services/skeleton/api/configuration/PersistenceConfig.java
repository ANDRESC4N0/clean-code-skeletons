package com.cleancode.services.skeleton.api.configuration;

import com.cleancode.services.skeleton.configuration.AppConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

@Configuration
public class PersistenceConfig {

    @Bean
    public AppConfig appConfig() {
        return new AppConfig();
    }

    @Bean
    public DynamoDbEnhancedClient getDynamoDbEnhancedClient() {
        return DynamoDbEnhancedClient.builder()
                .dynamoDbClient(appConfig().getDynamoDbClient())
                .build();
    }

}
