package com.example.rabbitmq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

	@Autowired
	private HelloSender helloSender;

	@Test
	public void hello() throws Exception {
		helloSender.send();
	}

	@Test
	public void hello1() throws Exception {
		helloSender.send1();
	}

	@Test
	public void hello2() throws Exception {
		helloSender.send2();
	}

	@Test
	public void hello3() throws Exception {
		helloSender.send3();
	}

	@Test
	public void hello4() throws Exception {
		helloSender.send4();
	}

	@Test
	public void send5() throws Exception {
		helloSender.send5();
	}

}