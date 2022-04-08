package de.vc.persistence;

import de.vc.entity.User;
import org.junit.jupiter.api.Test;


class DaoTest {
    Dao dao;

    @Test
    public void addUserTest(){
        User user = new User();
        user.setUsername("Test2");
        user.setPassword("Pass2");

        dao = new Dao();
        dao.addUser(user);
    }

}