package com.tartan.apisuite.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Builder
public class JwtResponse {

    private String jwtToken;

    private String username;

}
