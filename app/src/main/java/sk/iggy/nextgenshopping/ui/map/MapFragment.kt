package sk.iggy.nextgenshopping.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import sk.iggy.nextgenshopping.databinding.FragmentMapBinding

class MapFragment : Fragment() {
    private lateinit var searchViewModel: MapViewModel
    private var _binding: FragmentMapBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMapBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null;
    }
}