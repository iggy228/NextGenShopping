package sk.iggy.nextgenshopping.database.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id : Int,
    @ColumnInfo(name = "login_name") var loginName : String?,
    @ColumnInfo(name = "password") var password : String?
)
