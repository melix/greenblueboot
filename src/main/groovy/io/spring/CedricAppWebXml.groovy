package io.spring

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.SpringBootServletInitializer;

class CedricAppWebXml extends SpringBootServletInitializer {

    @Override
    protected void configure(final SpringApplicationBuilder application) {
        application.sources(CedricTestApp)
    }

}
