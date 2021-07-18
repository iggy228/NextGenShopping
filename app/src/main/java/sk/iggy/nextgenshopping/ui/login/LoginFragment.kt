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
        binding.login.setOnClickListener(){
            Thread{
                if(binding.loginName.toString() != "" && binding.password.toString() != "") {
                    var database = AppDatabase.getDatabase(activity?.application!!)
                    val user = database.getUserDao().getUser(binding.loginName.toString(), binding.password.toString())
                    if(user != null)
                        LoggedUser.user = user
                }
            }.start()
        }

        binding.signUp.setOnClickListener(){
            Thread{
                if(binding.loginName.toString() != "" && binding.password.toString() != null){
                    val database = AppDatabase.getDatabase(activity?.application!!)
                    database.getUserDao().insert(User(0, binding.loginName.toString(), binding.password.toString(), 0))
                }
            }
        }

        binding.noLogin.setOnClickListener(){
            TODO("close this fragment / change to navigation")
        }


        return root
    }

}