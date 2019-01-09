package com.jason.springbootdemo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springbootdemo1ApplicationTests {

	@Test
	public void contextLoads() {
		for(int i=0;i<55;i++){
			System.out.println("阿发放xxxx"+i*10);
		}
	}

}

