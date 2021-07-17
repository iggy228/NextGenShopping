package sk.iggy.nextgenshopping.ui.shoppinglist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sk.iggy.nextgenshopping.R
import sk.iggy.nextgenshopping.databinding.FragmentSearchBinding
import sk.iggy.nextgenshopping.databinding.FragmentShoppingListBinding

class ShoppingListFragment : Fragment() {

    private lateinit var viewModel: ShoppingListViewModel
    private var _binding: FragmentShoppingListBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentShoppingListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null;
    }
}