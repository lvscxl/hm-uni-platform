package com.zp.uni.hmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_12)
                // 当前的ip 和 端口号  为那个服务产生 接口文档
                .host("localhost:1688")
                .apiInfo(apiInfo())
                .select()
                //指定对应的接口类
                .apis(RequestHandlerSelectors.basePackage("com.zp.pdd.portal.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //接口文档的信息
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //标题
                .title("我的API文档")
                //描述
                .description("我的测试接口文档")
                //版本号
                .version("1.0")
                .build();
    }
}
