package jenkins.persistence.mongo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author panbo
 */
@Configuration
public class MongoConfig implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring引入成功，启动ing.............................................................................");
    }
}
