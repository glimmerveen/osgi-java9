package org.glimmerveen.osgi;

import com.google.gson.Gson;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting...");
        Gson gson = new Gson();
        System.out.println("gson = " + gson);
    }

    @Override
    public void stop(BundleContext context) throws Exception {

    }
}
