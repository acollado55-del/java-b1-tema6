import java.util.*;

/**
 * Gestor de tareas dinámico
 * ------------------------------------------
 * En una empresa de desarrollo, se necesita llevar un registro de tareas que permita:
 *  - Añadir tareas al final y al principio (si son urgentes).
 *  - Fusionar listas de tareas.
 *  - Marcar tareas como completadas y eliminarlas.
 *  - Consultar y revisar tareas pendientes.
 *  - Modificar el contenido de una tarea existente.
 *
 * Se debe usar una estructura de tipo List y se elegirá la implementación adecuada
 * (ArrayList, LinkedList o Vector) según el comportamiento que se describe.
 *
 * MÉTODOS A IMPLEMENTAR:
 * -----------------------
 * - List<String> createTaskList()
 *     -> Crea una nueva lista vacía de tareas. Se recomienda usar LinkedList.
 *
 * - void addTask(List<String> list, String task)
 *     -> Añade una tarea al final de la lista.
 *        Argumentos: lista de tareas (list), nueva tarea (task).
 *
 * - void addUrgentTask(List<String> list, String task)
 *     -> Añade una tarea al principio de la lista. Si es una LinkedList, se usará addFirst.
 *        Argumentos: lista de tareas (list), tarea urgente (task).
 *
 * - void mergeTaskLists(List<String> base, List<String> toMerge)
 *     -> Añade todas las tareas de 'toMerge' al final de 'base'.
 *        Argumentos: lista base (base), lista a fusionar (toMerge).
 *
 * - void markCompleted(List<String> list, Set<String> completed)
 *     -> Elimina las tareas que estén contenidas en el conjunto 'completed'.
 *        Argumentos: lista de tareas (list), conjunto de tareas completadas (completed).
 *
 * - void reviewTasks(List<String> list)
 *     -> Muestra todas las tareas pendientes por la salida estándar.
 *        Argumentos: lista de tareas (list).
 *
 * - void updateTask(List<String> list, String oldTask, String newTask)
 *     -> Sustituye una tarea existente por una nueva si la tarea antigua existe.
 *        No actualiza nada si la tarea original no se encuentra.
 *        Argumentos: lista de tareas (list), tarea a reemplazar (oldTask), nueva tarea (newTask).
 *
 * En este ejercicio las funciones no forman parte de una clase que almacena internamente el estado
 * (por ejemplo, una lista de tareas), sino que operan sobre listas que se pasan como parámetro.
 * Esta manera de trabajar no es la más habitual en programación orientada a objetos, ya que va 
 * en contra del principio de encapsulamiento: los datos (como la lista de tareas) no se ocultan
 * dentro de la clase. En este ejercicio, se utiliza con fines didácticos. Por otra parte,
 * las ventajas de esta implementación es que favorece la independencia entre funciones y datos (loose coupling)
 * y facilita trabajar con listas ya existentes sin tener que rediseñarlas.
 *
 * EXAMPLE:
 * --------
 * List<String> tasks = createTaskList();
 * addTask(tasks, "Prepare slides");
 * addUrgentTask(tasks, "Fix urgent bug");
 * addTask(tasks, "Review PRs");
 *
 * List<String> extra = List.of("Schedule meeting", "Write documentation");
 * mergeTaskLists(tasks, new ArrayList<>(extra));
 *
 * Set<String> done = Set.of("Prepare slides", "Schedule meeting");
 * markCompleted(tasks, done);
 *
 * updateTask(tasks, "Review PRs", "Review pull requests");
 *
 * reviewTasks(tasks);
 *
 * // Salida esperada:
 *
 * // Fix urgent bug
 * // Write documentation
 * // Review pull requests
 *
 * ---
 *
 * Gestor de tasques dinàmic
 * -------------------------------------------
 * En una empresa de desenvolupament, cal portar un registre de tasques que permeti:
 *  - Afegir tasques al final i al principi (si són urgents).
 *  - Fusionar llistes de tasques.
 *  - Marcar tasques com a completades i eliminar-les.
 *  - Consultar i revisar tasques pendents.
 *  - Modificar el contingut d'una tasca existent.
 *
 * Cal utilitzar una estructura de tipus List i triar la implementació adequada
 * (ArrayList, LinkedList o Vector) segons el comportament descrit.
 *
 * MÈTODES A IMPLEMENTAR:
 * -----------------------
 * - List<String> createTaskList()
 *     -> Retorna una nova llista buida de tasques. Es recomana LinkedList.
 *
 * - void addTask(List<String> list, String task)
 *     -> Afegeix una tasca al final de la llista.
 *
 * - void addUrgentTask(List<String> list, String task)
 *     -> Afegeix una tasca al principi de la llista. Si és una LinkedList, s'utilitza addFirst.
 *
 * - void mergeTaskLists(List<String> base, List<String> toMerge)
 *     -> Afegeix totes les tasques de 'toMerge' al final de 'base'.
 *
 * - void markCompleted(List<String> list, Set<String> completed)
 *     -> Elimina les tasques que estiguin dins del conjunt 'completed'.
 *
 * - void reviewTasks(List<String> list)
 *     -> Mostra per la sortida estàndar totes les tasques pendents.
 *
 * - void updateTask(List<String> list, String oldTask, String newTask)
 *     -> Substitueix la tasca 'oldTask' per 'newTask' si existeix.
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
 * List<String> tasks = createTaskList();
 * addTask(tasks, "Prepare slides");
 * addUrgentTask(tasks, "Fix urgent bug");
 * addTask(tasks, "Review PRs");
 *
 * List<String> extra = List.of("Schedule meeting", "Write documentation");
 * mergeTaskLists(tasks, new ArrayList<>(extra));
 *
 * Set<String> done = Set.of("Prepare slides", "Schedule meeting");
 * markCompleted(tasks, done);
 *
 * updateTask(tasks, "Review PRs", "Review pull requests");
 *
 * reviewTasks(tasks);
 *
 * // Sortida esperada:
 *
 * // Fix urgent bug
 * // Write documentation
 * // Review pull requests
 */
public class TaskManager 
{

    public static List<String> createTaskList() {
        // TODO: Return a new LinkedList
        return new LinkedList<>();


        
    }

    public static void addTask(List<String> list, String task) {
        // TODO: Add task at the end
        list.add(task);

    }

    public static void addUrgentTask(List<String> list, String task) {
        // TODO: Add task at the beginning (if LinkedList, use addFirst)
        if (list instanceof LinkedList) {
            ((LinkedList<String>) list).addFirst(task);
        } else {
            list.add(0, task);
        }       
    }

    public static void mergeTaskLists(List<String> base, List<String> toMerge) {
        // TODO: Add all tasks from toMerge to base
        base.addAll(toMerge);

    }

    public static void markCompleted(List<String> list, Set<String> completed) 
    {
        // TODO: Remove tasks in 'completed' using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) 
            {
            String task = iterator.next();
            if (completed.contains(task)) 
                {
                iterator.remove();
                }
            }
    
    }

    public static void reviewTasks(List<String> list) {
        // TODO: Print all remaining tasks
        for (String task : list) {
            System.out.println(task);
        }
    }

    public static void updateTask(List<String> list, String oldTask, String newTask) {
        // TODO: Replace oldTask with newTask if it exists
        int index = list.indexOf(oldTask);
        if (index != -1) {
            list.set(index, newTask);   

    }
}
    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
    public static void main(String[] args) {
        List<String> tasks = createTaskList();
        addTask(tasks, "Prepare slides");
        addUrgentTask(tasks, "Fix urgent bug");
        addTask(tasks, "Review PRs");

        List<String> extra = List.of("Schedule meeting", "Write documentation");
        mergeTaskLists(tasks, new ArrayList<>(extra));

        Set<String> done = Set.of("Prepare slides", "Schedule meeting");
        markCompleted(tasks, done);

        updateTask(tasks, "Review PRs", "Review pull requests");

        System.out.println("== Pending Tasks ==");
        reviewTasks(tasks);
    }
    
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
