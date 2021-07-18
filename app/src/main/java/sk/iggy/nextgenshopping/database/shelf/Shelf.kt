package sk.iggy.nextgenshopping.database.shelf

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shelves")
data class Shelf(
    @PrimaryKey(autoGenerate = true) val id : Int,
    @ColumnInfo(name = "position_x") var positionX : Int,
    @ColumnInfo(name = "position_y") var positionY : Int,
    @ColumnInfo(name = "width") var width : Int,
    @ColumnInfo(name = "height") var height : Int,
    @ColumnInfo(name = "retail_id") var retailID : Int,
    @ColumnInfo(name = "added_by") var addedBy : Int,
    @ColumnInfo(name = "approved_by") var approvedBy : Int

)
