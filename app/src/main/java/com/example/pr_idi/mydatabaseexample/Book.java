package com.example.pr_idi.mydatabaseexample;

import android.content.ContentValues;

import java.io.Serializable;

/**
 * Book
 * Created by pr_idi on 10/11/16.
 */
public class Book implements Serializable {

    // Basic book data manipulation class
    // Contains basic information on the book

    private long id;
    private String author;
    private String title;
    private int year;
    private String publisher;
    private String category;
    private String personal_evaluation;

    public Book (){}

    public Book(String author, String title, int year, String publisher, String category, String personal_evaluation) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.category = category;
        this.personal_evaluation = personal_evaluation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title= title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year= year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher= publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPersonal_evaluation() {
        return personal_evaluation;
    }

    public void setPersonal_evaluation(String personal_evaluation) {
        this.personal_evaluation = personal_evaluation;
    }

    // Will be used by the ArrayAdapter in the ListView
    // Note that it only produces the title and the author
    // Extra information should be created by modifying this
    // method or by adding the methods required
    @Override
    public String toString() {
        return String.format("%s - %s", title, author);
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_TITLE, title);
        values.put(MySQLiteHelper.COLUMN_AUTHOR, author);
        values.put(MySQLiteHelper.COLUMN_YEAR, year);
        values.put(MySQLiteHelper.COLUMN_PUBLISHER, publisher);
        values.put(MySQLiteHelper.COLUMN_CATEGORY, category);
        values.put(MySQLiteHelper.COLUMN_PERSONAL_EVALUATION, personal_evaluation);

        return values;
    }


}