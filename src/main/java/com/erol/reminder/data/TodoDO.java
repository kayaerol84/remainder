package com.erol.reminder.data;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Wither;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

@Builder
@Value
@Wither
@Table("todo")
public class TodoDO {
    @PrimaryKey
    private UUID id;

    @Column
    private String text;

    @Column
    private String link;

    @Column
    private Instant createdAt;

    @Column
    private Instant lastRead;

    @Column
    private Status status;

}
