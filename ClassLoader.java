public class PathClassLoader extends ClassLoader
{
    private String classPath;
    
    public PathClassLoader(String classPath)
    {
        this.classPath = classPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException
    {
        byte[] classData = getData(name);
        if (classData == null)
        {
            throw new ClassNotFoundException();
        }
        else
        {
            return defineClass(name, classData, 0, classData.length);
        }
    }

    private byte[] getData(String className)
    {
    }
}
