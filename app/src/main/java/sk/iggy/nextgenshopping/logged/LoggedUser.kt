package sk.iggy.nextgenshopping.logged

import sk.iggy.nextgenshopping.database.user.User

object LoggedUser {
    var user : User? = null

    fun isLogged() : Boolean{
        return user != null
    }
}