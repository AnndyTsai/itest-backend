package priv.itest.backend.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create By ab.xie.
 * 0n 2018/10/30 15:15.
 */
@Configuration
public class CommonConfiguration {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

//    @Bean
//    public HttpMessageConverters customConverters() {
//        Collection<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//        GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
//        messageConverters.add(gsonHttpMessageConverter);
//        return new HttpMessageConverters(true, messageConverters); }

}
