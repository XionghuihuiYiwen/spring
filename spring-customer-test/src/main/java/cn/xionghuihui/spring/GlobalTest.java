package cn.xionghuihui.spring;

import cn.xionghuihui.spring.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试
 *
 * @author huihui.xiong
 * @since 2022-03-11 15:19:33
 */
public class GlobalTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(GlobalConfig.class);
		HelloService helloService = annotationConfigApplicationContext.getBean("helloService", HelloService.class);
		helloService.hello();
	}
}
