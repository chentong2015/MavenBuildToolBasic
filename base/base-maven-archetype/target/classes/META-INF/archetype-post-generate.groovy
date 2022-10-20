// TODO. 改脚本文件如何被调用，如何从控制台/终端获取指定的参数值 ?

// 设置变量的相关配置
def MXVersion = request.getArchetypeVersion();
def service = request.getProperties().getProperty('service')

def projectDirectory = request.outputDirectory;

// 根据变量设置生成的文件
if (testable == 'N') {
    new File(projectDirectory + '/src/test/resources/testfile').delete()
}