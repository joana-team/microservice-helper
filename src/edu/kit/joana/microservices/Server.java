package edu.kit.joana.microservices;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class Server {
    /**
     * Run Jaxrs-CFX service implementation at the passed url
     * @param url service url, e.g. "http://localhost:9010/"
     * @param apiServiceImpl service impl object
     * @param resourceClasses special resource classes used by the service impl object
     */
    @EndpointMethod
    public static void run(String url, Object apiServiceImpl, Class<?>... resourceClasses) {
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setResourceClasses(resourceClasses);
        factory.setResourceClasses(apiServiceImpl.getClass());
        factory.setResourceProvider(apiServiceImpl.getClass(),
                new SingletonResourceProvider(apiServiceImpl));
        factory.setProvider(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());
        factory.setAddress(url);
        factory.create();
        System.out.println("Server ready...");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Server exiting ...");
        System.exit(0);
    }

    @EndpointMethod
    public static void run2(String url, Object apiServiceImpl, Class<?>... resourceClasses) {

    }
}
