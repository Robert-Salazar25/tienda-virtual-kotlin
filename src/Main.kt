fun main() {

    val tienda = Tienda()

    tienda.agregarProducto(Producto("Laptop", 200.0, 5))
    tienda.agregarProducto(Producto("Mouse", 25.50, 10))
    tienda.agregarProducto(Producto("Teclado", 45.0, 3))

    // Mostrar productos disponibles
    tienda.mostrarProductos()

    // Crear pedido para Robert
    val pedido = tienda.crearPedido("Robert")

    // Robert compra productos - FORMA SUPER LIMPIA
    println("\n🛒 Robert está comprando...")
    tienda.buscarYAgregarProducto(pedido, "Laptop", 1)
    tienda.buscarYAgregarProducto(pedido, "Mouse", 2)
    tienda.buscarYAgregarProducto(pedido, "Teclado", 1)
    tienda.buscarYAgregarProducto(pedido, "Tv", 1)          // Producto que no existe
    tienda.buscarYAgregarProducto(pedido, "Laptop", 10)     // Sin stock suficiente

    // Mostrar el pedido completo
    pedido.mostrarPedido()

    // Mostrar stock actualizado
    println("\n📊 Stock después de las ventas:")
    tienda.mostrarProductos()

}