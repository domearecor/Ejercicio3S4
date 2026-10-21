public class Pedido {

    // Atributos privados de instancia
    private int numero;
    private String cliente;
    private double total;
    private String estado;

    // Atributos estáticos (compartidos por la clase)
    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    // Constructor requerido
    public Pedido(String cliente, double total) {
        contadorPedidos++;                // Incrementa contador global de pedidos
        this.numero = contadorPedidos;    // Asigna el número secuencial
        this.cliente = cliente;           // Inicializa el cliente
        this.total = total;               // Inicializa el total
        this.estado = "Pendiente";        // Se establece automáticamente en "Pendiente"[cite: 6]
    }

    // Desafío: confirmar pedido[cite: 6]
    public void confirmar() {
        if ("Pendiente".equals(this.estado)) {
            this.estado = "Confirmado";
            ventasTotales += this.total; // Suma a ventasTotales[cite: 6]
            System.out.println("Pedido #" + this.numero + " confirmado con éxito por $" + this.total);
        } else {
            // Evita contabilizar dos veces un pedido ya confirmado[cite: 6]
            System.out.println("Aviso: El pedido #" + this.numero + " ya se encuentra confirmado. No se sumará de nuevo.");
        }
    }

    // Métodos estáticos para consultar totales de la clase
    public static int getContadorPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }

    // Getters
    public int getNumero() {
        return this.numero;
    }

    public String getCliente() {
        return this.cliente;
    }

    public double getTotal() {
        return this.total;
    }

    public String getEstado() {
        return this.estado;
    }

    // Método para mostrar información del pedido
    public void mostrarInformacion() {
        System.out.println("Pedido #" + this.numero +
                " | Cliente: " + this.cliente +
                " | Total: $" + this.total +
                " | Estado: " + this.estado);
    }
}