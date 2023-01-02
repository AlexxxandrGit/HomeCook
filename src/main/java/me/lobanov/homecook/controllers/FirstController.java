package me.lobanov.homecook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String start() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String startInfo() {
        return "Судент: Лобанов Александр. " +
                "Проект: Домашний повар. " +
                "Дата создания проекта: 29.12.2022г " +
                "Данный проект  предоставляет удобный сервис по поиску рецептов мировой кухни " +
                "и пошаговую инструкцию по приготовлению данных блюд с наименованим и колличеством необходимых продуктов" +
                " и ингридиентов ";


    }

}
