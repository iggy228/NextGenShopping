package sk.iggy.nextgenshopping.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import sk.iggy.nextgenshopping.database.product.Product
import sk.iggy.nextgenshopping.database.product.ProductDao
import sk.iggy.nextgenshopping.database.retail.Retail
import sk.iggy.nextgenshopping.database.retail.RetailDao
import sk.iggy.nextgenshopping.database.shelf.Shelf
import sk.iggy.nextgenshopping.database.shelf.ShelfDao
import sk.iggy.nextgenshopping.database.user.User
import sk.iggy.nextgenshopping.database.user.UserDao

@Database(entities = arrayOf(User::class, Retail::class, Shelf::class, Product::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao() : UserDao
    abstract fun getRetailDao() : RetailDao
    abstract fun getShelfDao() : ShelfDao
    abstract fun getProductDao() : ProductDao


    companion object Database{
        private var INSTANCE : AppDatabase? = null

        fun getDatabase(application: Application) : AppDatabase{
            if(INSTANCE != null)
                return INSTANCE!!
            INSTANCE = Room.databaseBuilder(application.applicationContext,
                AppDatabase::class.java,
                "retail-app-database").build()
            return INSTANCE!!
        }
    }
}