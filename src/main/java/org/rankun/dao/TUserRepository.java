package org.rankun.dao;

import org.rankun.dao.model.User;

import java.util.List;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */

public interface TUserRepository {

    User add(User record);

    User delete(Long id);

    List<User> findAll();

    User findById(Long id);

    User update(User tUser);

}
