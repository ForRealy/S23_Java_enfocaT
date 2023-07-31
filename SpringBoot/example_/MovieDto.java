package com.example;

import lombok.Data;

@Data
public class MovieDto {

    private Long id;
    private String title;
    private String director;
    private String description;
    private String genres;
    private Integer stars;
}