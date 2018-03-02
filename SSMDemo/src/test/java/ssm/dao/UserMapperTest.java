package ssm.dao;

import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.entity.User;

public class UserMapperTest extends TestCase {
    private ApplicationContext app;
    @Autowired
    private UserMapper userMapper;
    public void setUp() throws Exception {
        app=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        userMapper=app.getBean(UserMapper.class);
    }

    public void tearDown() throws Exception {
    }

    public void testInsert() {
        User u=new User();
        u.setId(4);
        u.setName("john");
        u.setAge(25);
        int result=userMapper.insert(u);
        System.out.println(result);
        assert (result==1);
    }
}