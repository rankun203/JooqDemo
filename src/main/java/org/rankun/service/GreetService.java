package org.rankun.service;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.rankun.data.tables.records.TCityRecord;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import static org.rankun.data.tables.TCity.T_CITY;


/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
@Service
public class GreetService {

    public List<TCityRecord> fetchData() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/recruitment?useUnicode=true&amp;characterEncoding=UTF-8&amp;zeroDateTimeBehavior=convertToNull",
                "root", "root");

        DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
        return create.select().from(T_CITY).fetch().into(TCityRecord.class);
    }

}
