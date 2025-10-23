class Producto(
    val nombre: String,
    var precio: Double,
    var stock: Int
) {
    init{
        require(precio > 0){"El precio debe ser mayor a 0"}
        require(stock >= 0){"El stock no puede ser negativo"}
    }

    fun vender(cantidad: Int): Boolean{
        if (cantidad <= stock){
            stock -= cantidad
            return true
        }

        return false
    }

    override fun toString(): String {
        return "$nombre - $$precio (Stock: $stock)"
    }
}