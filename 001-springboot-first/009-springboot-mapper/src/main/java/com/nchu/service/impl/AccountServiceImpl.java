package com.nchu.service.impl;

import com.nchu.dao.AccountDao;
import com.nchu.domain.Account;
import com.nchu.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-08
 * 账户service层的请求方法逻辑编写：包含事务控制
 */
@Service("/accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public Account queryAccountById(Integer id) {
        return accountDao.queryAccountById(id);
    }
}
