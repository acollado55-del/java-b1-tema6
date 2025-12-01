import java.util.*;

/**
 * Registro de puntuaciones de estudiantes
 * ---------------------------------------
 * En una escuela, los profesores quieren mantener un registro de puntuaciones para cada estudiante.
 * Se necesita un sistema que:
 *
 * - Almacene las puntuaciones asociadas al nombre del estudiante.
 * - Permita añadir nuevas puntuaciones.
 * - Genere un listado ordenado alfabéticamente por nombre del estudiante.
 * - Calcule la media de cada estudiante.
 * - Permita eliminar un estudiante concreto.
 * - Muestre por pantalla todos los estudiantes y sus puntuaciones ordenadas.
 *
 * Para ello, se encapsula el libro de calificaciones dentro de una clase, de modo que todas las operaciones
 * se realicen sobre su estado interno. Se utiliza un TreeMap para mantener automáticamente el orden alfabético.
 *
 * MÉTODOS A IMPLEMENTAR:
 * -----------------------
 * - void addScore(String student, int score)
 *     -> Añade una puntuación a un estudiante. Si no existe, se crea su entrada.
 *        Argumentos: nombre del estudiante (student), puntuación (score).
 *
 * - double getAverage(String student)
 *     -> Devuelve la media de las puntuaciones del estudiante.
 *        Si el estudiante no existe, se devuelve -1.
 *        Si el estudiante existe pero no tiene ninguna nota, se devuelve 0.
 *        Argumentos: nombre del estudiante (student).
 *
 * - void removeStudent(String student)
 *     -> Elimina completamente al estudiante del registro.
 *        Argumentos: nombre del estudiante (student).
 *
 * - void printGradeBook()
 *     -> Muestra por la salida estándar todos los estudiantes con sus puntuaciones, ordenados por nombre.
 *
 * EJEMPLO:
 * --------
 * GradeBookManager gb = new GradeBookManager();
 * gb.addScore("Alice", 90);
 * gb.addScore("Bob", 75);
 * gb.addScore("Alice", 85);
 * gb.addScore("Carlos", 92);
 *
 * gb.printGradeBook();
 * System.out.println("Alice average: " + gb.getAverage("Alice"));
 * gb.removeStudent("Bob");
 * gb.printGradeBook();
 *
 * // SALIDA:
 * // Alice -> [90, 85]
 * // Bob -> [75]
 * // Carlos -> [92]
 * // Alice average: 87.5
 * // Alice -> [90, 85]
 * // Carlos -> [92]
 *
 * ---
 *
 * Registre de puntuacions dels estudiants
 * ---------------------------------------
 * En una escola, els professors volen mantenir un registre de les puntuacions de cada estudiant.
 * Cal un sistema que:
 *
 * - Emmagatzemi les puntuacions associades al nom de l’estudiant.
 * - Permeti afegir noves puntuacions.
 * - Generi un llistat ordenat alfabèticament per nom.
 * - Calculi la mitjana de cada estudiant.
 * - Permeti eliminar un estudiant.
 * - Mostri per pantalla tots els estudiants i les seves puntuacions.
 *
 * Per a això, s'encapsula el llibre de notes dins d'una classe, de manera que totes les operacions
 * es facin sobre el seu estat intern. Es fa servir TreeMap per mantenir l’ordre alfabètic automàticament.
 *
 * MÈTODES A IMPLEMENTAR:
 * -----------------------
 * - void addScore(String student, int score)
 *     -> Afegeix una puntuació a l'estudiant. Si no existeix, es crea.
 *        Arguments: nom de l’estudiant (student), puntuació (score).
 *
 * - double getAverage(String student)
 *     -> Retorna la mitjana de les puntuacions. Si no existeix, -1. Si no té puntuacions, 0.
 *        Arguments: nom de l’estudiant (student).
 *
 * - void removeStudent(String student)
 *     -> Elimina l'estudiant del registre.
 *        Arguments: nom de l’estudiant (student).
 *
 * - void printGradeBook()
 *     -> Mostra per la sortida estàndar les puntuacions de cada estudiant.
 *
 * EXEMPLE:
 * --------
 * GradeBookManager gb = new GradeBookManager();
 * gb.addScore("Alice", 90);
 * gb.addScore("Bob", 75);
 * gb.addScore("Alice", 85);
 * gb.addScore("Carlos", 92);
 *
 * gb.printGradeBook();
 * System.out.println("Alice average: " + gb.getAverage("Alice"));
 * gb.removeStudent("Bob");
 * gb.printGradeBook();
 *
 * // SORTIDA:
 * // Alice -> [90, 85]
 * // Bob -> [75]
 * // Carlos -> [92]
 * // Alice average: 87.5
 * // Alice -> [90, 85]
 * // Carlos -> [92]
 */

public class GradeBookManager 
{

    private Map<String, List<Integer>> gradeBook;

    public GradeBookManager() 
    {
        this.gradeBook = new TreeMap<>();
    }

    public void addScore(String student, int score) 
    {
        // TODO: Add score to the given student. Create new list if student does not exist.
        if (gradeBook.containsKey(student)) 
            {
            gradeBook.get(student).add(score);
            return;
            }
        List<Integer> scores = new ArrayList<>();
        scores.add(score);
        gradeBook.put(student, scores);
        
    }

    public double getAverage(String student) 
    {
        // TODO: Return average of the student's scores.
        // Return -1 if student does not exist, 0 if they have no scores.
        if (!gradeBook.containsKey(student)) 
            return -1;
        List<Integer> scores = gradeBook.get(student);
        if (scores.isEmpty())
        {
            return 0;
        }
        double sum = 0;
        for (int score : scores) 
        {
            sum += score;
        }
        return sum / scores.size(); 
       
    }

    public void removeStudent(String student) 
    {
        // TODO: Remove the student from the grade book.
        gradeBook.remove(student);

    }

    public void printGradeBook() 
    {
        // TODO: Print all students and their scores in alphabetical order.
        for (Map.Entry<String, List<Integer>> entry : gradeBook.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
    public static void main(String[] args) {
        GradeBookManager gb = new GradeBookManager();
        gb.addScore("Alice", 90);
        gb.addScore("Bob", 75);
        gb.addScore("Alice", 85);
        gb.addScore("Carlos", 92);
        gb.addScore("Bob", 70);

        gb.printGradeBook();
        System.out.println("Alice average: " + gb.getAverage("Alice"));
        System.out.println("Bob average: " + gb.getAverage("Bob"));
        gb.removeStudent("Bob");
        gb.printGradeBook();
    }
    
    // Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
    // -------------------------------------------------------------
}
