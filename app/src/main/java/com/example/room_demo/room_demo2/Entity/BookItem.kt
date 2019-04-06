package com.example.room_demo.room_demo2.Entity

import androidx.room.*

/**
 * User: Ashik
 * Date: 03-03-2019
 * Time: 15:23
 */
@Entity(
    tableName = "books",
    indices = [(Index(value = ["book_id"], name = "idx_books_book_id"))],
    foreignKeys = [(ForeignKey(
        entity = AuthorModel::class,
        parentColumns = ["author_id"],
        childColumns = ["book_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE
    ))]
)
data class BookItem(
    @PrimaryKey @ColumnInfo(name = "author_id") val author_id: Long,
    @ColumnInfo(name = "book_id") val bookId: Long,
    val name: String
) {

}
