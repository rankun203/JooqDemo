package org.rankun.service.baseService;

import org.joda.time.LocalDateTime;

import java.sql.Timestamp;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
public interface DateTimeService {
    LocalDateTime getCurrentDateTime();

    Timestamp getCurrentTimestamp();
}
