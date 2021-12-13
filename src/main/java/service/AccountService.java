package service;

import domain.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccountMapper;
import service.interfaces.IAccountService;

import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;


    @Override
    public List<AccountDTO> mybatisTest() {
        return accountMapper.mybatisTest();
    }
}
