package com.imcApi.service.user;

import com.imcApi.model.HealthStatus;
import com.imcApi.model.User;
import com.imcApi.repository.UserRepository;
import com.imcApi.service.imcCalc.CalcImc;
import com.imcApi.service.imcCalc.LogicHealthStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Date;

@Service
@Transactional
@Slf4j
public class UserImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CalcImc calcImc;
    @Autowired
    private LogicHealthStatus healthStatus;

    public User saveUser(User user) {
        log.info("Saving new user name: {}", user.getFirstName());
        double saveIMC = calcImc.calcImc(user.getWeight(), user.getHeight());
        HealthStatus saveHealthStatus = healthStatus.logicStatus(saveIMC);
        user.setImc(saveIMC);
        user.setDate(new Date());
        user.setHealthStatus(saveHealthStatus);
        return userRepository.save(user);
    }

    @Override
    public User getUser(String id) {
        log.info("Fetching user id: {}", id);
        return userRepository.findById(id).get();
    }

    @Override
    public Boolean deleteUser(String id) {
        log.info("Deleting user id: {}", id);
        userRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public Collection<User> userList(int limit) {
        log.info("Fetching user list");
        return userRepository.findAll(PageRequest.of(0, limit)).toList();
    }

    @Override
    public User updateUser(User user) {
        log.info("Updating user: {}", user.getFirstName());
        return userRepository.save(user);
    }

}
