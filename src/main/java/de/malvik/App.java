package de.malvik;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {
        Server server = new Server(8080);

        server.setHandler(getRESTeasyHandler());

        server.start();
        server.join();
    }

    private static Handler getRESTeasyHandler() {
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);

        ServletHolder servlet = handler.addServlet(HttpServletDispatcher.class, "/");
        servlet.setInitParameter("javax.ws.rs.Application", AppResourceConfig.class.getCanonicalName());


        return handler;
    }
}
