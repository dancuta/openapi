package ancuta.example.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class ApiContextFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiContextFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        LOGGER.info("Logging Request  {} : {}", request.getMethod(), request.getRequestURI());

        String uri = request.getRequestURI();
        //call next filter in the filter chain
      //  if (uri.endsWith("swagger.html") || uri.endsWith("api/*"))
            filterChain.doFilter(servletRequest, servletResponse);

        LOGGER.info("Logging Response :{}", response.getContentType());
    }
}
