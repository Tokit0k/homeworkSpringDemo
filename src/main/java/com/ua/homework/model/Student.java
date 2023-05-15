package com.ua.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private int group_id;
    private int age;

    // Створіть конструктори, гетери та сетери для властивостей
}

