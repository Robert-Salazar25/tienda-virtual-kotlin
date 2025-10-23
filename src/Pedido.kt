class Pedido(
    val id: Int,
    val usuario: String
) {
    private val items = mutableListOf<ItemPedido>()

    fun agregarItem(producto: Producto, cantidad:Int){
        if (producto.vender(cantidad)){
            val nuevoItem = ItemPedido(producto, cantidad)
            items.add(nuevoItem)
            println("✅ $cantidad x ${producto.nombre} agregado al pedido")
        }else{
            println("❌ No hay suficiente stock de ${producto.nombre}")
        }
    }

    fun calcularTotal():Double{
        return items.sumOf { it.calcularSubTotal() }
    }

    fun mostrarPedido(){
        println("\n📦 Pedido #$id - Cliente: $usuario")
        items.forEachIndexed { index, item ->
            println("${index + 1}. ${item.producto.nombre} x ${item.cantidad} - $${item.calcularSubTotal()}")
        }

        println("${calcularTotal()}")
    }

}