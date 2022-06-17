package com.nchu;

import com.nchu.dao.RoleMapper;
import com.nchu.mapper.AccountMapper;
import com.nchu.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 使用 @MapperScan注解 进行全局扫描对应的 Dao接口所在包，然后创建 Dao动态代理实现类
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.nchu.dao","com.nchu.mapepr"})
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        // 那么 run() 完之后，spring容器就已经创建成功了
        // 我们可以测试，看可不可以获取到所有的Dao接口动态代理实现类
        UserMapper userMapper = context.getBean(UserMapper.class);
        AccountMapper accountMapper = context.getBean(AccountMapper.class);
        RoleMapper roleMapper = context.getBean(RoleMapper.class);
        System.out.println(userMapper+"  --  "+accountMapper+"  --  "+roleMapper);
    }

}
