package com.easyms.sampleapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client
{
    private String name;
    private String lastName;
    private String email;
}