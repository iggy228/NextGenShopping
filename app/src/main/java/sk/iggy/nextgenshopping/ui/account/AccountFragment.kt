package sk.iggy.nextgenshopping.ui.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import sk.iggy.nextgenshopping.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    private lateinit var viewModel: AccountViewModel
    private var _binding: FragmentAccountBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        return binding.root
    }
}