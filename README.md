# POO — Alonso Leonard

Aquí están mis prácticas de Programación Orientada a Objetos. Cada ejercicio es su propio proyecto de NetBeans (Maven + JavaFX con FXML), así que para probar uno solo hay que abrir su carpeta con **File → Open Project** y darle **Run**. Si prefieres la terminal, `mvn clean javafx:run` dentro de la carpeta también funciona.

## Práctica 1 — Interfaces básicas

Las primeras ventanas en FXML. Aquí la idea era practicar la lógica básica (ciclos, condiciones, arreglos) y conectar los botones con el controlador.

- **1.1 Edad** (`Ejercicio1_1_Edad`): escribes tu fecha de nacimiento y te dice cuántos años y meses tienes.
- **1.2 Desglose** (`Ejercicio1_2_Desglose`): le das una cantidad de dinero y te dice cuántos billetes y monedas de cada tipo se necesitan, empezando por los de $500.
- **1.3 Cifras** (`Ejercicio1_3_Cifras`): analiza un número: cuántas cifras tiene, cuánto suman las pares y las impares, cuál es la mayor y la menor, y todos sus divisores.
- **1.4 Tabla** (`Ejercicio1_4_Tabla`): la tabla de multiplicar del número que le pongas.
- **1.5 Gastos** (`Ejercicio1_5_Gastos`): metes tus gastos de la semana y te saca el total y en qué gastaste más.

## Práctica 2 — Herencia e Interfaces

Estos son de consola. Tomé los diagramas UML y armé las clases para que la salida quedara igual a la del PDF, sin tocar el `main` (está en la clase `Test` de cada proyecto).

- **2.1 Personas** (`Ejercicio2_1_Personas`): `Persona` como clase padre, y de ahí salen `Alumno` y `Profesor`.
- **2.2 Figuras** (`Ejercicio2_2_Figuras`): una interfaz `FiguraPlana`, una clase abstracta `Figura2D` y, al final, `TrianguloRect` y `Circulo`, que calculan su área y su perímetro.

## Práctica 3 — Interfaces con Threads

Aquí entran los hilos, para que la ventana nunca se congele aunque algo esté tardando.

- **3.1 Conteo** (`Ejercicio3_1_Conteo`): un botón que cuenta clics y otro que llena una barra en 10 segundos. Mientras la barra avanza puedes seguir contando sin problema.
- **3.2 La liebre y la tortuga** (`Ejercicio3_2_LiebreTortuga`): cada animal corre en su propio hilo. La liebre sale disparada, se echa una siesta a la mitad y, cuando despierta, la tortuga ya casi llegó.
