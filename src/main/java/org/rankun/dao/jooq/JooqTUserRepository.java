package org.rankun.dao.jooq;

import org.jooq.DSLContext;
import org.jooq.types.UInteger;
import org.rankun.dao.TUserRepository;
import org.rankun.dao.model.User;
import org.rankun.data.tables.records.TUserRecord;
import org.rankun.service.baseService.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.rankun.data.tables.TUser.T_USER;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
@Repository
public class JooqTUserRepository implements TUserRepository {
    @Autowired
    private DateTimeService dateTimeService;
    @Autowired
    private DSLContext jooq;

    @Override
    @Transactional
    public User add(User user) {
        TUserRecord persisted = jooq.insertInto(T_USER)
                .set(createRecord(user))
                .returning()
                .fetchOne();

        return convertQueryResultToModelObject(persisted);
    }

    @Override
    @Transactional
    public User delete(Long id) {
        User deleted = findById(id);
        jooq.delete(T_USER).where(T_USER.UID.equal(UInteger.valueOf(id))).execute();
        return deleted;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        jooq.selectFrom(T_USER).fetchInto(TUserRecord.class).forEach(
                (r) -> userList.add(convertQueryResultToModelObject(r))
        );
        return userList;
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return convertQueryResultToModelObject(
                jooq.selectFrom(T_USER)
                        .where(T_USER.UID.equal(UInteger.valueOf(id)))
                        .fetchOne()
        );
    }

    @Override
    @Transactional
    public User update(User user) {
        jooq.update(T_USER)
                .set(T_USER.AVATAR, user.getAvatar())
                .set(T_USER.UID, UInteger.valueOf(user.getUid()))
                .set(T_USER.GENDER, user.getGender())
                .set(T_USER.LOCATION, user.getLocation())
                .set(T_USER.NICKNAME, user.getNickName())
                .set(T_USER.PASSWORD, user.getPassword())
                .set(T_USER.SCHOOL, user.getSchool())
                .set(T_USER.SIGN, user.getSign())
                .set(T_USER.REGISTER, new Timestamp(user.getRegisterTime().toDate().getTime()))
                .set(T_USER.USERNAME, user.getUserName());

        return findById(user.getUid());
    }

    public User convertQueryResultToModelObject(TUserRecord record) {
        return User.getBuilder(record.getUsername())
                .avatar(record.getAvatar())
                .gender(record.getGender())
                .location(record.getLocation())
                .nickName(record.getNickname())
                .password(record.getPassword())
                .registerTime(record.getRegister())
                .school(record.getSchool())
                .sign(record.getSign())
                .uid(record.getUid().longValue())
                .build();
    }

    public TUserRecord createRecord(User user) {
        TUserRecord record = new TUserRecord();

        record.setAvatar(user.getAvatar());
        record.setGender(user.getGender());
        record.setLocation(user.getLocation());
        record.setNickname(user.getNickName());
        record.setPassword(user.getPassword());
        record.setRegister(new Timestamp(user.getRegisterTime().toDate().getTime()));
        record.setSchool(user.getSchool());
        record.setSign(user.getSign());
        record.setUsername(user.getUserName());

        return record;
    }

}
