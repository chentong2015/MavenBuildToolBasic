package com.maven.plugin;

// Maven提供的默认插件
// https://maven.apache.org/plugins/index.html
public class MavenPlugins {

   // Maven plugins: "Maven" is core framework of a collection of maven plugins
   // 1. plugins are almost the real action 插件实际上是要执行的一些action
   // 2. almost any action to perform on project is implemented as a plugins

   // POM 构建的两种插件: 需要配置基本信息(groupId, artifactId,,,)
   // 1. <build /> : Build plugins will be executed during the build
   // 2. <reporting />: Reporting plugins will be executed during the site generation (test report)

   // 常见的插件介绍 -----------------------------------------------------------
   // Compiler Plugin
   // 两种Goals：compile(编译main code中源代码) & testCompile(编译test中源代码)
   // 1. Invokes javac
   // 2. Default older JDK1.7, 使用<configuration>指定自定义版本
   // 3. Source/target: 自定义编译的源和目标

   // Jar Plugin
   // Package codes to a JAR File
   // Package phase
   // Configuration
   //    includes/excludes 指定要打包的
   // Manifest: build this file

   // Javadoc Plugin 对于添加了JavaDoc注释的项目
   // Package javadocs
   // Package phase
   // Defaults
   //    customization 可以自定义


}
