package com.example.awssqs.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class NotificationEntity {
    @Id
    private String id;
    @Column("subject")
    private String subject;
    @Column("text")
    private String text;
    @Column("recipient_uid")
    private String recipientUid;
}

