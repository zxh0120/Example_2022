package org.example.designPattern.blend.commandAndChain;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 根据父类获取子类
 * network  demo   https://blog.csdn.net/cqb18257344546/article/details/70869468
 */
@Slf4j
public class ClassUtils {

    /***
     * 根据父类查找所有的子类，默认情况是子类和父类都在同一个包名下
     * @param fatherClass
     * @return
     */
    public static List<Class> getSonClasses(Class fatherClass) throws ClassNotFoundException {
        //定一个返回值
        List<Class> returnClassList = new ArrayList<>();
        //获取包的名称
        String packageName = fatherClass.getPackage().getName();
        //获取包中所有类
        List<Class> packageClasses = getClasses(packageName);
        //判断是否子类
        for (Class cla : packageClasses) {
            if (fatherClass.isAssignableFrom(cla) && !fatherClass.equals(cla)) {
                returnClassList.add(cla);
            }
        }
        return returnClassList;
    }

    /**
     * 从一个包中查找出所有的类，在jar包中不能查找
     *
     * @param packageName
     * @return
     */
    private static List<Class> getClasses(String packageName) {
        List<Class> classes = new ArrayList<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".", "/");
        Enumeration<URL> resources = null;
        try {
            resources = classLoader.getResources(path);
        } catch (Exception e) {
            log.error("Exception:{}", e);
        }
        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    /**
     * @param directory
     * @param packageName
     * @return
     */
    private static List<Class> findClasses(File directory, String packageName) {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                try {
                    // 如果是java类文件 去掉后面的.class 只留下类名
                    String className = file.getName().substring(0, file.getName().length() - 6);
                    classes.add(Class.forName(packageName + "." + className));
                } catch (ClassNotFoundException e) {
                    log.error("e:{}", e);
                }
            }
        }
        return classes;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        List<Class> sonClasses = getSonClasses(CommandName.class);
        sonClasses.stream().forEach(x -> log.info("子类：{}",sonClasses));

    }
}
