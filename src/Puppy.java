
public class Puppy {
    /* 第一个java程序
    它将输出字符串 hello world
     */
    int puppyAge;
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是： " + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge( ){
        System.out.println("小狗的年龄为： "+ puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        /* 创建对象 */
        Puppy myPuppy = new Puppy ("tommy");
        /*通过方法来设定 age*/
        myPuppy.setAge ( 2);
        /*调用另一个方法来获取age*/
        myPuppy.getAge ();

        /* 你也可以像下面这样访问成员变量  */
        System.out.println("变量值： "+ myPuppy.puppyAge);

        System.out.print("Hello world\n");
        //输出 hello world
    }
}

/*
java 中的对象和类

对象： 对象是类的一个实例，有状态 （属性） 和行为（通过方法实现或者改变），
类：  类是一个模版，它描述一类对象的行为和状态


源文件的申明规则： 当一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则：

1。一个源文件中只能有一个public class;
2.  一个源文件中可以有多个非public class
3。 源文件的名称应该和public class的类名一致。 例如：文件中public 类的类名Employee,那么源文件应该命名为 Employee.java
4.  如果一个类定义在某个包中，那么package语句应该在源文件的首行
5。 如果源文件包含import 语句， 那么应该放在package语句和类定义之间，  如果没有package语句， 那么import 语句应该在源文件的最前面
6。 import语句和package 语句对源文件中定义的所有类都有效。 在同一个源文件中，不能给不同的类不同的包申明。

类有若干种访问级别，并且类也分不同的类型：抽象类和 final 类等。
除了上面提到的几种类型，Java 还有一些特殊的类，如：内部类、匿名类。


Java 包
包主要用来对类和接口进行分类。当开发 Java 程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类。

import 语句
在 Java 中，如果给出一个完整的限定名，包括包名、类名，那么 Java 编译器就可以很容易地定位到源代码或者类。import 语句就是用来提供一个合理的路径，使得编译器可以找到某个类。

例如，下面的命令行将会命令编译器载入 java_installation/java/io 路径下的所有类

 */
