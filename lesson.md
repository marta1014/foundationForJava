
JVM java虚拟机 执行字节码的虚拟计算机
JRE java运行时环境。包含java虚拟机，库函数，运行java应用程序的必须文件
JDK java开发工具包 包含JRE，以及增加编译器和调试器等用于程序开发的文件


/**
 * 数据类型
 * 
 * 基本类型8个
 * 
 * 整型
 * 
 *  按照存储的空间大小 小=>大 字节byte 短整型sort 整型int long长整型
 * 
 * 浮点型
 * 
 * float单精度 double双精度
 * 
 * 字符型 char
 * 
 * 布尔型 boolean
 * 
 * 
 * 
 * 引用数据类型（占用四个字节）
 * 
 * 数组[] 、类class(抽象类 abstract class)、 接口interface 、枚举enum 、注解类型 @interface
 */


常量

final修饰符 ：符号常量

局部变量

成员变量

静态变量：从属于类，生命周期伴随类始终

静态方法不需要实例化调用,静态方法不能使用非静态的方法,非静态方法可调用静态方法

this可用在普通的方法中不能在静态成员中使用

**javaBean 可重用组件 实体类**

**抽象类 abstract**
/**
* about 抽象类 abstract
* 当一个类被abstract修饰为抽象类、他不可以被实例化(创建对象)
* 当一个方法被abstract修饰为抽象方法、该方法只有声明、没有任何实现(存在的意义就是规范子类的代码) 
* 抽象方法被子类继承后、子类必须重写该方法、除非子类也是抽象类
* 父类中的抽象方法就是限制子类必须要做某些事
* 只有抽象类中可以定义抽象方法、普通类不可以
*   
* 特点
* 1. abstract 需用关键字修饰抽象方法和抽象类
* 2. 抽象类里可以没抽象方法
* 3. 抽象类参照多态来创建对象(虽不能直接实例化，参照多态的方式通过子类对象来实例化)
* 4. 抽象类的子类需要重写抽象类的抽象方法(全部抽象方法)
* 5. 如果不重写抽象类中的抽象方法，需要自己本身就是抽象类
* 
* 注意： 父类中的抽象方法就是限制子类必须要做某些事/ 非抽象方法为了提高复用性
* 
* 多态的前提：有继承或者实现关系；有方法重写；有父(类/接口)引用指向(子/实现)类对象
* 
* 抽象类的成员特点
* 1
* 
* 
* public abstract void eat(); // 抽象方法 => 因为没有方法体故为抽象方法、索引类必须定义为抽象类
* 
*/

**interface 接口**

接口内部没构造方法 里面的方法只能是抽象的(默认就是)

  public interface Jumping {
   public abstract void jump();
   // 此处可省略 public abstract
  }

 **接口和抽象类的区别**

/**
* 成员区别
* 
* 抽象类 变量，常量，构造方法，抽象方法，非抽象方法
* 接口 常量，抽象方法
* 
* 关系区别
* 
* 类与类 单继承
* 类与接口 实现，单实现/多实现
* 接口与接口 单继承/多继承
* 
* 设计理念区别
* 
* 抽象类 对类抽象 包括属性/行为
* 接口 行为抽象 行为
  */

// 成员外部类:  格式： 外部类名.内部类名 name = 外部类对象.内部类对象  => Outer.Inner oi = new Outer().new Inner();
// 局部内部类:  方法调用也是间接 通过外部类的对象调用他的成员方法，在该方法内部创建局部内部类对象调用方法
// 匿名内部类   详见img


**基本类型包装类**
/**
* 最常用操作 将基本数据类型与字符串之间的转换
* 包装类 => 基本类型
* Boolean => boolean
* Integer => int
* Byte => byte
* Long => long
* Float => float
* Double => double
* Character => char
* Short => short
*/

Integer i = Integer.valueOf(100);
Integer i2 = Integer.valueOf("100");
String s = String.valueOf(i) // int 转成 String

String str = "strTest"
// String => int (temp1)
Integer ii = Integer.valueOf(str);
int X = i.intValue();
// String => int (temp2) ***
int ir = Integer.parseInt(str);


**String类**

/**
* 特点
* 1 字符串不可变 => 创建后不可被更改
* 2 虽然值不可变 但可以被共享
*/

// equals 字符串对比

StringBuilder sb = new StringBuilder("admin"); // StringBuilder 可变字符串（容器）

sb.append(",display").append(true).append(89757); //链式编程

// StringBuilder => String
String displayString = sb.toString();

// String => StringBuilder
String st = "Marta";
StringBuilder s = new StringBuilder(st);


**ArrayList Collection 集合**

/**
* ArrayList 集合
* List可变大小的数组实现
*/