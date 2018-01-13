package com.example.mateen.sugarormlab;

import com.orm.SugarRecord;

/**
 * Created by Mateen on 1/13/2018.
 */

public class Book extends SugarRecord<Book> {
    String title;
    String edition;

    public Book() {
    }

    public Book(String title, String edition) {
        this.title = title;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }
}