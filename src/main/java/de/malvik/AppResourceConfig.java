package de.malvik;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by smalvik on 05.12.2017.
 */
public class AppResourceConfig extends Application {

    Set<Class<?>> classes = new HashSet<Class<?>>();

    public AppResourceConfig() {
        classes.add(TestEndpoint.class);
    }

    public Set<Class<?>> getClasses() {
        return classes;
    }
}
