package basic;

// Maven:
//   Software "project management tool"
//   Manage build automation构建工具
//   From Apache Software Foundation
// POM.xml: Project Object Model
//   Manage project build, reporting, documentation, complete state of a project
//   Across all projects / works with multiple projects

// Maven的特点:
//   1. 使项目的build变得容易，管理项目的整个生命周期
//   2. 提供一个通用的build system构建系统，多个项目可以同时依赖一下repos，不会出现重复的情况
//   3. GuildLines and provide quality project information
//   4. Large repository of libraries and metadata, with open source projects 开源，同时拥有大量的类库
//   5. Offer model based builds: 能够构建任意数量的项目，成预先定义好的格式(jar or war files)
public class MavenConfig {

    // 1. Ignored pom.xml 解决pom文件被忽略的问题
    //    相同名称的module在之前被创建过，在IDEA中留有痕迹，重新创建一个新的同名module会让IDEA自动将这个pom.xml文件忽略

    // 2. Enable Auto-import 当在对POM构建文件修改后，将会自动的引入变更
    //    # The Project is imported by Maven, Any changes made in its configuration may be lost after reimporting #

    // 3 Maven lifecycle: 3种生命周期
    //    1. default: handles project deployment
    //    2. clean: handles project cleaning
    //    3. site:  handles the creation of project's site documentation
}