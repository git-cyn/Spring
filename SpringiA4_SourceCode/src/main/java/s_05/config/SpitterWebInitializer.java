package s_05.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import s_05.web.WebConfig;
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

//  第一个方法是getServletMappings()， 它会将一个或多个路径映
//  射到DispatcherServlet上。 在本例中， 它映射的是“/”， 这表示
//  它会是应用的默认Servlet。 它会处理进入应用的所有请求。
  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}