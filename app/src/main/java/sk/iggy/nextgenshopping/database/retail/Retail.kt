package sk.iggy.nextgenshopping.database.retail

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "retails")
data class Retail(
    @PrimaryKey(autoGenerate = true) val id : Int,
    @ColumnInfo(name = "name") var name : String?,
    @ColumnInfo(name = "width") var width : Int,
    @ColumnInfo(name = "height") var height : Int,
    @ColumnInfo(name = "added_by") var addedBy : Int,
    @ColumnInfo(name = "approved_by") var approvedBy : Int
)
