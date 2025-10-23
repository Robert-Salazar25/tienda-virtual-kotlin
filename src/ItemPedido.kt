class ItemPedido(
    val producto: Producto,
    val cantidad: Int
) {
    init {
        require(cantidad > 0){"Cantidad debe ser mayor a 0"}
    }

    fun calcularSubTotal():Double{
        return producto.precio * cantidad
    }
}