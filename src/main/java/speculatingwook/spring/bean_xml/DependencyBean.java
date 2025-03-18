package speculatingwook.spring.bean_xml;

public class DependencyBean {
    private final XmlBean xmlBean;
    private final String beanName;
    private final Long beanId;

    public DependencyBean(XmlBean xmlBean, String beanName, Long beanId) {
        this.xmlBean = xmlBean;
        this.beanName = beanName;
        this.beanId = beanId;
    }

    public XmlBean getXmlBean() {
        return xmlBean;
    }

    public String getBeanName() {
        return beanName;
    }

    public Long getBeanId() {
        return beanId;
    }

    @Override
    public String toString() {
        return "This Bean has a dependency on " + xmlBean.getBeanName() + " bean";
    }
}
