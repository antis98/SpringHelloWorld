import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanClone =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == beanClone);
        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat catClone = (Cat) applicationContext.getBean("cat");
        System.out.println(cat == catClone);
    }
}