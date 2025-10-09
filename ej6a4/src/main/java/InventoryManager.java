import java.util.*;

/**
 * Gestor de inventario del almacén
 * ------------------------------------------
 * Una empresa necesita gestionar el inventario de un pequeño almacén. Se requiere poder:
 * - Añadir productos y sus unidades en stock.
 * - Actualizar la cantidad de productos.
 * - Eliminar aquellos productos que se han quedado sin unidades.
 * - Consultar cuántas unidades hay de un producto.
 * - Mostrar el inventario completo.
 *
 * Para garantizar acceso rápido a los productos por su nombre, se debe usar la interfaz Map.
 * En la implementación, se recomienda utilizar HashMap.
 *
 * MÉTODOS A IMPLEMENTAR:
 * -----------------------
 * - Map<String, Integer> createInventory()
 *     -> Crea y devuelve un nuevo inventario vacío. Se recomienda usar HashMap.
 *
 * - void addProduct(Map<String, Integer> inventory, String product, int quantity)
 *     -> Añade un producto o incrementa su stock si ya existe.
 *        Argumentos: inventario (Map), nombre del producto (product), cantidad a añadir (quantity).
 *
 * - void updateStock(Map<String, Integer> inventory, String product, int newQuantity)
 *     -> Actualiza la cantidad de un producto. Si no existe, no hace nada.
 *        Argumentos: inventario (Map), producto (product), nueva cantidad (newQuantity).
 *
 * - void removeZeroStock(Map<String, Integer> inventory)
 *     -> Elimina todos los productos con stock igual a 0.
 *        Argumentos: inventario (Map).
 *
 * - int getStock(Map<String, Integer> inventory, String product)
 *     -> Devuelve la cantidad de stock de un producto. Si no existe, devuelve 0.
 *        Argumentos: inventario (Map), nombre del producto (product).
 *
 * - void printInventory(Map<String, Integer> inventory)
 *     -> Muestra por pantalla todos los productos y sus cantidades.
 *        Argumentos: inventario (Map).
 *
 * En este ejercicio las funciones no forman parte de una clase que almacena internamente el estado
 * (por ejemplo, una lista de tareas), sino que operan sobre listas que se pasan como parámetro.
 * Esta manera de trabajar no es la más habitual en programación orientada a objetos, ya que va 
 * en contra del principio de encapsulamiento: los datos (como la lista de tareas) no se ocultan
 * dentro de la clase. En este ejercicio, se utiliza con fines didácticos. Por otra parte,
 * las ventajas de esta implementación es que favorece la independencia entre funciones y datos (loose coupling)
 * y facilita trabajar con listas ya existentes sin tener que rediseñarlas.
 *
 * EJEMPLO:
 * --------
 * Map<String, Integer> inventory = createInventory();
 * addProduct(inventory, "Mouse", 10);
 * addProduct(inventory, "Keyboard", 5);
 * addProduct(inventory, "Mouse", 2);  // Añade al stock existente
 * updateStock(inventory, "Keyboard", 0); // Se actualiza a 0 unidades
 * removeZeroStock(inventory); // Se elimina el teclado
 *
 * System.out.println("Mouse stock: " + getStock(inventory, "Mouse")); // 12
 * System.out.println("Keyboard stock: " + getStock(inventory, "Keyboard")); // 0
 *
 * printInventory(inventory);
 *
 * // Salida:
 * // Mouse stock: 12
 * // Keyboard stock: 0
 * // == Current Inventory ==
 * // Mouse: 12
 *
 * ---
 *
 * Gestor de inventari del magatzem
 * ------------------------------------------
 * Una empresa necessita gestionar l'inventari d'un petit magatzem. Es requereix poder:
 * - Afegir productes i les seves unitats en estoc.
 * - Actualitzar la quantitat dels productes.
 * - Eliminar aquells productes que s'han quedat sense unitats.
 * - Consultar quantes unitats hi ha d'un producte.
 * - Mostrar l'inventari complet.
 *
 * Per garantir un accés ràpid als productes pel seu nom, s'ha d'utilitzar la interfície Map.
 * A la implementació, s'ha d'utilitzar HashMap.
 *
 * MÈTODES A IMPLEMENTAR:
 * -----------------------
 * - Map<String, Integer> createInventory()
 *     -> Crea i retorna un nou inventari buit. Es recomana usar HashMap.
 *
 * - void addProduct(Map<String, Integer> inventory, String product, int quantity)
 *     -> Afegeix un producte o augmenta el seu estoc si ja existeix.
 *        Arguments: inventari (Map), nom del producte (product), quantitat a afegir (quantity).
 *
 * - void updateStock(Map<String, Integer> inventory, String product, int newQuantity)
 *     -> Actualitza la quantitat exacta d’un producte. Si no existeix, no fa res.
 *        Arguments: inventari (Map), producte (product), nova quantitat (newQuantity).
 *
 * - void removeZeroStock(Map<String, Integer> inventory)
 *     -> Elimina tots els productes amb estoc igual a 0.
 *        Arguments: inventari (Map).
 *
 * - int getStock(Map<String, Integer> inventory, String product)
 *     -> Retorna la quantitat d’estoc d’un producte. Si no existeix, retorna 0.
 *        Arguments: inventari (Map), nom del producte (product).
 *
 * - void printInventory(Map<String, Integer> inventory)
 *     -> Mostra per pantalla tots els productes i les seves quantitats.
 *        Arguments: inventari (Map).
 *
 * En aquest exercici les funcions no formen part d'una classe que emmagatzema internament l'estat 
 * (per exemple, una llista de tasques), sinó que operen sobre llistes que es passen com a paràmetre. 
 * Aquesta manera de treballar no és la més habitual en programació orientada a objectes, ja que va 
 * en contra del principi d'encapsulament: les dades (com la llista de tasques) no s'amaguen 
 * dins de la classe. En aquest exercici, es fa servir amb fins didàctics. D'altra banda, 
 * els avantatges d'aquesta implementació és que afavoreix la independència entre funcions i dades (loose coupling) 
 * i facilita treballar amb llistes ja existents sense haver de redissenyar-les.
 *
 * EXEMPLE:
 * --------
 * Map<String, Integer> inventory = createInventory();
 * addProduct(inventory, "Mouse", 10);
 * addProduct(inventory, "Keyboard", 5);
 * addProduct(inventory, "Mouse", 2);  // Suma al stock existent
 * updateStock(inventory, "Keyboard", 0); // S'actualitza a 0 unitats
 * removeZeroStock(inventory); // S'elimina el teclat
 *
 * System.out.println("Mouse stock: " + getStock(inventory, "Mouse")); // 12
 * System.out.println("Keyboard stock: " + getStock(inventory, "Keyboard")); // 0
 *
 * printInventory(inventory);
 *
 * // Sortida esperada:
 * // Mouse stock: 12
 * // Keyboard stock: 0
 * // == Current Inventory ==
 * // Mouse: 12
 */
public class InventoryManager {

    public static Map<String, Integer> createInventory() {
        // TODO: Create and return a new HashMap
        return null;
    }

    public static void addProduct(Map<String, Integer> inventory, String product, int quantity) {
        // TODO: Add the product with quantity or increment existing quantity
    }

    public static void updateStock(Map<String, Integer> inventory, String product, int newQuantity) {
        // TODO: If the product exists, update its quantity to newQuantity
    }

    public static void removeZeroStock(Map<String, Integer> inventory) {
        // TODO: Remove all entries where quantity is 0 using a for-each structure
    }

    public static int getStock(Map<String, Integer> inventory, String product) {
        // TODO: Return the stock for the product, or 0 if not present
        return 0;
    }

    public static void printInventory(Map<String, Integer> inventory) {
        // TODO: Print all product names and their quantities
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        Map<String, Integer> inventory = createInventory();
        addProduct(inventory, "Mouse", 10);
        addProduct(inventory, "Keyboard", 5);
        addProduct(inventory, "Mouse", 2);
        updateStock(inventory, "Keyboard", 0);
        removeZeroStock(inventory);
        System.out.println("Mouse stock: " + getStock(inventory, "Mouse"));
        System.out.println("Keyboard stock: " + getStock(inventory, "Keyboard"));
        printInventory(inventory);
    }
    */
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
