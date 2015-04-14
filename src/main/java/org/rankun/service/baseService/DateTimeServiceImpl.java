package org.rankun.service.baseService;

import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
@Component
public class DateTimeServiceImpl implements DateTimeService {
    @Override
    public LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    @Override
    public Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
