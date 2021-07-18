package sk.iggy.nextgenshopping.database.retail

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RetailDao {
    @Insert
    fun insert(retail: Retail)

    @Query("SELECT * FROM retails")
    fun getAll() : List<Retail>

    @Query("SELECT * FROM retails WHERE id = :id")
    fun getById(id : Int) : List<Retail>

    @Query("SELECT * FROM retails WHERE name = :name")
    fun getByName(name: String) : List<Retail>

    @Query("SELECT * FROM retails WHERE name LIKE :name")
    fun getByNameLike(name: String) : List<Retail>

}