package com.example.awssqs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("recipients")
public class RecipientEntity implements Persistable<String> {

    @Id
    private String id;
    @Column("channel")
    private String channel;
    @Column("address")
    private String address;
    @Column("fullName")
    private String fullName;

    @Transient
    @ToString.Exclude
    private List<NotificationEntity> notifications;

    @Override
    public boolean isNew() {
        return !StringUtils.hasText(id);
    }
}