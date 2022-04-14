import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1= (Cat) applicationContext.getBean("pojocat");
        Cat beanCat2= (Cat) applicationContext.getBean("pojocat");

        boolean beanHello=bean1==bean;
        boolean beanCat=beanCat1==beanCat2;
        System.out.println(beanHello);
        System.out.println(beanCat);
    }
}