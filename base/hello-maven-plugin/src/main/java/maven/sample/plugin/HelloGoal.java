package maven.sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

// Custom Maven Plugin
// https://maven.apache.org/guides/plugin/guide-java-plugin-development.html
@Mojo(name = "say-hello")
public class HelloGoal extends AbstractMojo {

    @Parameter( property = "say-hello.username", defaultValue = "victor" )
    private String username;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info( "Hello: " );
        getLog().info(username);
    }
}
