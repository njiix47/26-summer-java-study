package com.example.ex05;

public class Student {

        private final int id;
        private final String name;
        private final int age;
        private final String email;
        private final String created_at;

    public Student(int id, String name, int age, String email, String created_at) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCreated_at() {
        return created_at;
    }
}
