package org.example.springweb.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class UserForm {
    private String id;
    private String name;
    private String password;
    private String email;
}
