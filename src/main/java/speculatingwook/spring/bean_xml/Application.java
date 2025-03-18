package speculatingwook.spring.bean_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("application.xml");

        XmlBean xmlBean = applicationContext.getBean(XmlBean.class);
        DependencyBean dependencyBean = applicationContext.getBean(DependencyBean.class);

        System.out.println("xml bean info:");
        System.out.println(xmlBean.toString());
        System.out.println();
        System.out.println("dependency bean info:");
        System.out.println(dependencyBean.toString());
    }
}