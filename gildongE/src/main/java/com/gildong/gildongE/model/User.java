package com.gildong.gildongE.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String userName;
    private String loginId;
    private String password;
    private LocalDateTime createdAt = LocalDateTime.now();
}