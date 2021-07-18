package sk.iggy.nextgenshopping.database.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAll() : List<User>

    @Query("SELECT * FROM users WHERE id = :id" )
    fun getById(id : Int) : User


    @Insert
    fun insert(user: User)
}