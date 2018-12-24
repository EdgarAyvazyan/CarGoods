package com.ayv.cargoods.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {

    private Long id;
    private String description;
    private String title;

}
