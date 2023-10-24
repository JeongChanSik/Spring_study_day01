package exam01.main;

import exam01.Great;
import exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        // 스프링 컨테이너
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Great g1 = ctx.getBean("great", Great.class);
        g1.hello("정찬식");

        ctx.close();
    }
}
