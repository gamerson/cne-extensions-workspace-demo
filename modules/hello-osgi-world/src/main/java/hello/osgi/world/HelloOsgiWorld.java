package hello.osgi.world;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Activate;

/**
 * @author Greg
 */
@Component(immediate = true)
public class HelloOsgiWorld {

    @Activate
    public void activate() {
        System.out.println("Hello Osgi World!");
    }
}
