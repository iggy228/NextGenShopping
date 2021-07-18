package sk.iggy.nextgenshopping.database.product

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import sk.iggy.nextgenshopping.database.shelf.Shelf

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id : Int,
    @ColumnInfo(name = "name") var name : String?,
    @ColumnInfo(name = "position_x") var positionX : Int,
    @ColumnInfo(name = "position_y") var positionY : Int,
    @ColumnInfo(name = "shelf_id") var shelfId : Int,
    @ColumnInfo(name = "added_by") var addedBy : Int,
    @ColumnInfo(name = "approved_by") var approvedBy : Int
)
