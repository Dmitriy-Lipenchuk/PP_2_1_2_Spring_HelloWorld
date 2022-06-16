import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean = applicationContext.getBean(HelloWorld.class);

        Cat catBean = applicationContext.getBean(Cat.class);
        Cat secondCatBean = applicationContext.getBean(Cat.class);

        System.out.println(bean == secondBean);
        System.out.println(catBean == secondCatBean);
    }
}