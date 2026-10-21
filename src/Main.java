public class Main {
    public static void main(String[] args) {

        // 1. Creación de pedidos
        Pedido pedido1 = new Pedido("Carlos", 120.50); // Ejemplo de la guía[cite: 6]
        Pedido pedido2 = new Pedido("María", 80.00);
        Pedido pedido3 = new Pedido("Andrés", 45.25);

        System.out.println("=== ESTADO INICIAL DE PEDIDOS ===");
        pedido1.mostrarInformacion();
        pedido2.mostrarInformacion();
        pedido3.mostrarInformacion();

        System.out.println("\n=== GESTIÓN DE CONFIRMACIONES ===");
        // Prueba 1: Confirmar pedido 1
        pedido1.confirmar();

        // Prueba 2: Confirmar pedido 2
        pedido2.confirmar();

        // Prueba 3: Intentar confirmar el pedido 1 por segunda vez (desafío)[cite: 6]
        pedido1.confirmar();

        System.out.println("\n=== ESTADO FINAL DE PEDIDOS ===");
        pedido1.mostrarInformacion();
        pedido2.mostrarInformacion();
        pedido3.mostrarInformacion(); // Permanece como "Pendiente"

        System.out.println("------------------------------------");
        System.out.println("Total de pedidos creados: " + Pedido.getContadorPedidos());
        System.out.println("Ventas totales acumuladas: $" + Pedido.getVentasTotales());
    }
}
