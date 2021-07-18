package sk.iggy.nextgenshopping.ui.shoppingcart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sk.iggy.nextgenshopping.R
import sk.iggy.nextgenshopping.ui.shoppingcart.model.Product

class ProductAdapter(
    private val dataset: Array<Product>
): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val quantityView: TextView
        val nameView: TextView

        init {
            nameView = view.findViewById(R.id.text_product_name)
            quantityView = view.findViewById(R.id.text_product_quantity)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val quantityText = dataset[position].quantity.toString() + "x"
        holder.quantityView.text = quantityText
        holder.nameView.text = dataset[position].name
    }

    override fun getItemCount() = dataset.size
}