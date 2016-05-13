package com.sainsburys.productscrapper.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sainsburys.productscrapper.facade.ResultsFacade;
import com.sainsburys.productscrapper.facade.ResultsFacadeImpl;
import com.sainsburys.productscrapper.parser.HtmlParserImpl;
import com.sainsburys.productscrapper.parser.Parser;
import com.sainsburys.productscrapper.reporter.ConsoleReporter;
import com.sainsburys.productscrapper.reporter.Reporter;
import com.sainsburys.productscrapper.serializer.ResultJsonSerializer;
import com.sainsburys.productscrapper.serializer.ResultSerializer;
import com.sainsburys.productscrapper.service.ProductService;
import com.sainsburys.productscrapper.service.ProductServiceImpl;
import com.sainsburys.productscrapper.webclient.JsoupWebClient;
import com.sainsburys.productscrapper.webclient.WebClient;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ProductService productService() {
        return new ProductServiceImpl();
    }

    @Bean
    public ResultsFacade resultsFacade() {
        return new ResultsFacadeImpl();
    }

    @Bean
    public Parser htmlParser() {
        return new HtmlParserImpl();
    }

    @Bean
    public WebClient webClient() {
        return new JsoupWebClient();
    }

    @Bean
    public Reporter consoleReporter() {
        return new ConsoleReporter();
    }

    @Bean
    public ResultSerializer jsonSerializer() {
        return new ResultJsonSerializer();
    }
}
