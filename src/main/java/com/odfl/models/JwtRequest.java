package com.odfl.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class JwtRequest {
    private String username;
    private String password;
}
