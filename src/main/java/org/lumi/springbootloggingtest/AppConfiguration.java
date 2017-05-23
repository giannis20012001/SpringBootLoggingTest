package org.lumi.springbootloggingtest;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/5/2017.
 */

@Configuration
@ComponentScan("org.lumi.springbootloggingtest")
public class AppConfiguration {
    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();

    }

}
