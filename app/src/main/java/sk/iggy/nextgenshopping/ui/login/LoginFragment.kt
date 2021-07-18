package sk.iggy.nextgenshopping.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import sk.iggy.nextgenshopping.R
import sk.iggy.nextgenshopping.database.AppDatabase
import sk.iggy.nextgenshopping.database.user.User
import sk.iggy.nextgenshopping.databinding.FragmentLoginBinding
import sk.iggy.nextgenshopping.databinding.FragmentSearchBinding
import sk.iggy.nextgenshopping.logged.LoggedUser
import sk.iggy.nextgenshopping.ui.search.SearchViewModel
import java.lang.Appendable

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel
    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel =
            ViewModelProvider(this).get(LoginViewModel::class.java)

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //TODO("need to be completed")
        binding.buttonLogin.setOnClickListener(){
            Thread{
                if(binding.inputName.toString() != "" && binding.inputPassword.toString() != "") {
                    var database = AppDatabase.getDatabase(activity?.application!!)
                    val user = database.getUserDao().getUser(binding.inputName.toString(), binding.inputPassword.toString())
                    if(user != null)
                        LoggedUser.user = user
                }
            }.start()
        }

        binding.buttonSignUp.setOnClickListener(){
            Thread{
                if(binding.inputName.toString() != "" && binding.inputPassword.toString() != ""){
                    val database = AppDatabase.getDatabase(activity?.application!!)
                    database.getUserDao().insert(User(0, binding.inputName.toString(), binding.inputPassword.toString(), 0))
                }
            }
        }

        binding.buttonNoLogin.setOnClickListener(){
            TODO("close this fragment / change to navigation")
        }


        return root
    }

}