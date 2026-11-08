package sv.edu.utec.modelo;
/**
 * Una fila del reporte por categoria. Un record genera solo el
 * constructor, los metodos de acceso, equals, hashCode y toString.
 */
public record ResumenCategoria(String categoria, int productos,
                               int unidades, double valorInventario) {
}
