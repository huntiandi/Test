###                                Spring

##### IOC的过程

（xml解析，工厂模式，反射）

* 第一步xml配置文件，配置创建的对象

  ```xm
  <bean id = "dao" class = "com.yang.dao.UserDao"></bean>
  ```

* 第二步 创建工厂类，

  ```java
  class UserFactory {
      public static UserDao getDao(){
          String classValue = class属性值;//xml的解析
          Class clazz = Clas.forName(clasValue);//通过反射创建对象
          return (UserDao)clazz.newInstance();
      }
  }
  ```

##### IOC接口

* IOC的思想是基于IOC容器完成的，IOC容器的底层则是对象工厂
* Spring提供IOC容器的两种实现：
  * BeanFactory IOC容器基本实现，是内部使用的接口
    * 加载配置文件时不会创建对象，在获取或使用时才会创建对象。
  * ApplicationContext 是BF的子接口，提供了更多的功能
    * 在加载配置文件就会创建

##### IOC操作(Bean管理)

* Bean管理是指 Spring创建对象，Spring注入属性
* Bean管理的两种操作方式
  * 基于xml的配置文件
  * 基于注解的方式