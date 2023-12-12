package com.simsols.user_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
public class BookModel {
    @Id
    @Column(name = "ID")
    private UUID uuid;
    @Column(name = "BOOKNAME")
    private String bookName;
    @Column(name="BOOKPRICE ")
    private String bookPrice;
}
