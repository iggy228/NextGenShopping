package sk.iggy.nextgenshopping.ui.shoppingcart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sk.iggy.nextgenshopping.databinding.FragmentShoppingCartBinding
import sk.iggy.nextgenshopping.ui.shoppingcart.model.Product

class ShoppingCartFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private lateinit var notificationsViewModel: ShoppingCartViewModel
    private var _binding: FragmentShoppingCartBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShoppingCartBinding.inflate(inflater, container, false)
        val root: View = binding.root

        recyclerView = binding.productRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(root.context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = ProductAdapter(
            arrayOf(
                Product("bread", 2),
                Product("apple", 7),
                Product("orange", 6),
                Product("lemon", 1),
            )
        )

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}