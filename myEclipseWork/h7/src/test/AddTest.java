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
		t1.setName("����");
		Type t2=new Type();
		t2.setName("����");
		Type t3=new Type();
		t3.setName("�н�");
		
		td.add(t1);
		td.add(t2);
		td.add(t3);
	}

}
