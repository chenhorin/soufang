package top.hrfeat.souh.entity;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.hrfeat.souh.ApplicationTests;

/**
 * @Author: 81247
 * @Description: ${Description}
 */
public class UserRepository extends ApplicationTests {

    @Autowired
    private top.hrfeat.souh.repository.UserRepository userRepository;
    @Test
    public void testOne() {
        User user = userRepository.findOne(1L);
        Assert.assertEquals("wali", user.getName());
    }
}
