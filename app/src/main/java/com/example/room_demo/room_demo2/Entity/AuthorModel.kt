package com.example.room_demo.room_demo2.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * User: Ashik
 * Date: 03-03-2019
 * Time: 15:22
 */
@Entity(tableName = "authors")
class AuthorModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "author_id")
    val authorId: Long = 0,
    @ColumnInfo(name = "author_name")
    var authorName: String
)
