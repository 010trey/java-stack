package com.teje.test;

public class Painting extends Art {
    private String paintType;

    public Painting(String title, String author, String description, String paintType) {
        super(title, author, description);
        this.paintType = paintType;
    }

    @Override
    public void viewArt() {
        System.out.println("Painting:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Description: " + getDescription());
        System.out.println("Paint Type: " + paintType);
        System.out.println();
    }
}
