package basic;

// https://mvnrepository.com/ 搜索并添加<dependency>刷新maven projects
// https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html
public class MavenDependencies {

    // Versions: The release number of artifact
    //   SNAPSHOT 快照版本，不是面向用户的发布版本
    //     MyApp-1.0-SNAPSHOT.jar
    //   Release
    //     MyApp-1.0-M1.jar
    //     MyApp-1.0-RC1.jar
    //     MyApp-1.0-RELEASE.jar
    //     MyApp-1.0-Final.jar

    // Types:
    //   Package Types: jar war pom ear maven-plugin
    // Default jar
    // Dependency POM

    // Transitive Dependencies:
    // 1. 如果出现冲突，会选择最新的版本
    // 2. 下载一个依赖的时候，所有相关的传递的依赖都将被下载

    // Scopes:
    // 1. compile: 默认，不需要显示标注
    //      It means all the resources are available everywhere inside of application
    // 2. provided:
    //      The artifact is available throughout the entire build cycle
    //      在构建的时候可以不打包指定的依赖
    // 3. runtime:
    //      不需要测试，不需要编译，不需要打包，需要运行
    //      It's needed for execution 运行的时候动态加载
    // 4. test:
    //      在生产代码中是不可见的依赖
    //      For the test compilation and execution phase
    //      it does nothing for compiling; packaging; not included in final artifact
    //      JUnit or TestNG jars
    // 5. System:
    //      never use it
    // 6. import:
    //      Dependency Management deals with sharing resources across multiple POMs
    //      用于"依赖管理"处理共享资源，一般在<dependencyManagement>中设置
}