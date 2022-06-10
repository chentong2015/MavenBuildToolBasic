package com.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

// 构建Java自定义的Maven Plugin
// https://maven.apache.org/guides/plugin/guide-java-plugin-development.html
@Mojo(name = "demo-java-plugin")
public class MyJavaMavenPlugin extends AbstractMojo {

    @Parameter( property = "demo-java-plugin.greeting", defaultValue = "Hello plugin!" )
    private String greeting;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info( "Hello, plugin." );
    }
}
