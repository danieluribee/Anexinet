package com.example.anexinetTest;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.Helpers.Services;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnexinetTestApplicationTests {
	
	Services anexinetService;
	
	@Before
    public void init() {
		anexinetService = new Services();
    }

	@Test
	public void task1Test() {
		final String cat = "cat";
		final String dog = "dog";
		final String rabbit = "rabbit";
		final String kangaroo =  "kangaroo";
		
		String[] resp = anexinetService.task1(new String[]{cat, dog, rabbit}, new String[]{kangaroo, rabbit, cat});
		
		assertTrue(resp.length == 2);
		assertTrue(resp[0].equals("cat"));
		assertTrue(resp[1].equals("rabbit"));
	}
	
	@Test
	public void task2Test() {
		Double resp = anexinetService.task2();
		Double result =  0.7853979133974436*4;
		
		assertTrue(resp.equals(result));
	}
	
	@Test
	public void task4Test() {
		Object[] resp = anexinetService.task4(new Object[]{'x', 'y', 'z'}, new Object[]{10, 20, 30});
		
		assertTrue(resp[0].equals('x'));
		assertTrue(Integer.parseInt(resp[1].toString()) == 10);
		assertTrue(resp[2].equals('y'));
		assertTrue(Integer.parseInt(resp[3].toString()) == 20);
		assertTrue(resp[4].equals('z'));
		assertTrue(Integer.parseInt(resp[5].toString()) == 30);
	}
	
	@Test
	 public void task5Test(){
			Integer[][] matrix = 
			{
					{1,2,3},
					{4,0,6},
					{7,8,9}
					
			};
			
			Integer[][] matrix2 = 
				{
					{1,0,3},
					{0,0,0},
					{7,0,9}
						
			};
			
			Integer[][] matrix3 = 
			{
					{1,  0,  3,  4,  5,  6},
					{7,  8,  9,  10, 11, 12},
					{13, 14, 15, 16, 17, 18},
					{19, 20, 21, 22, 0,  24},
					{25, 26, 27, 28, 29, 30}
					
					
			};
				
			Integer[][] matrix4 = 
			{
					{0,  0,  0,  0,  0,  0},
					{7,  0,  9,  10, 0,  12},
					{13, 0,  15, 16, 0,  18},
					{0,  0,  0,  0,  0,  0},
					{25, 0,  27, 28, 0,  30}
		
			};
			
		Integer[][] respMatrix1 = anexinetService.task5(matrix);
		Integer[][] respMatrix2 = anexinetService.task5(matrix3);

		assertTrue(Arrays.deepEquals(respMatrix1, matrix2));
		assertTrue(Arrays.deepEquals(respMatrix2, matrix4));
	}
	
	@Test
	 public void task6Test(){
		int resp = anexinetService.task6(8, 13);
		
		assertTrue(resp == 21);
	}

}
