package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ss.dao.TypeDao;
import com.ss.dao.impl.TypeDaoImpl;
import com.ss.entity.Type;

public class AddTest {
	TypeDao td=null;
	@Before
	public void setUp() throws Exception {
		td=new TypeDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Type t1=new Type();
		t1.setName("Çó×â");
		Type t2=new Type();
		t2.setName("³ö×â");
		Type t3=new Type();
		t3.setName("ÖÐ½é");
		
		td.add(t1);
		td.add(t2);
		td.add(t3);
	}

}
