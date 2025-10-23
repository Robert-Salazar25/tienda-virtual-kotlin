class Tienda {
    private val productos = mutableListOf<Producto>()
    private val pedidos = mutableListOf<Pedido>()
    private var nextId = 1

    fun agregarProducto(producto:Producto) {
        productos.add(producto)
    }

    fun crearPedido(usuario: String): Pedido{
        val pedido = Pedido(nextId++, usuario)
        pedidos.add(pedido)
        return pedido
    }

    fun buscarYAgregarProducto(pedido: Pedido, nombreProducto: String, cantidad: Int){
        val producto = productos.find { it.nombre == nombreProducto }
        if (producto != null){
            pedido.agregarItem(producto, cantidad)
        }else{
            println("❌ Producto '$nombreProducto' no encontrado")
        }
    }

    fun mostrarProductos(){
        println("\n🛍️ Productos disponibles:")
        productos.forEach { println("- ${it.nombre}: $${it.precio} (stock: ${it.stock})") }
    }
}