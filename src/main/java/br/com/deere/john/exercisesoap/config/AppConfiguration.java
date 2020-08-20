package br.com.deere.john.exercisesoap.config;

import br.com.deere.john.exercisesoap.service.CorreiosSoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class AppConfiguration {
    private static final String URI = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("br.com.deere.john.exercisesoap.soap");
        return marshaller;
    }

    @Bean
    public CorreiosSoapClient correiosSoapClient(Jaxb2Marshaller marshaller) {
        return new CorreiosSoapClient(URI, marshaller);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
