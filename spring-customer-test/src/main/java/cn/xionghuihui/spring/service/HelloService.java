package cn.xionghuihui.spring.service;

import org.springframework.stereotype.Service;

/**
 * 测试Bean
 *
 * @author huihui.xiong
 * @since 2022-03-11 15:23:08
 */
@Service
public class HelloService {

	public void hello() {
		System.out.println("hello");
	}
}
