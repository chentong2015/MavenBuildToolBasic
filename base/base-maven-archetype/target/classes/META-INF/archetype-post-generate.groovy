// TODO. 改脚本文件如何被调用，如何从控制�?�/终端获�?�指定的�?�数值 ?

// 设置�?��?的相关�?置
def MXVersion = request.getArchetypeVersion();
def service = request.getProperties().getProperty('service')

def projectDirectory = request.outputDirectory;

// 根�?��?��?设置生�?的文件
if (testable == 'N') {
    new File(projectDirectory + '/src/test/resources/testfile').delete()
}