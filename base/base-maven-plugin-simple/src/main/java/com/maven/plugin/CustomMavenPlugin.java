package com.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "demo-java-plugin")
public class CustomMavenPlugin extends AbstractMojo {

    @Parameter( property = "demo-java-plugin.greeting", defaultValue = "Hello plugin!" )
    private String greeting;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info( "Hello, plugin." );
    }
}
