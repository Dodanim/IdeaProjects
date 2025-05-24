package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/*Eliminamos el modificador de acceso public de la clase, para efectos de buenas
prácticas.
*/
class AppTest {
    /*Utilizamos la anotación @Test con eso estamos diciendo que el metodo será para
prueba de alguna de las clases que tenemos en nuestro proyecto*/
     @Test
    void  testCreateInstanceAppClass(){
         App app = new App();
         Assertions.assertNotNull(app);

     }
     @Test
    void testGetNumbers(){
         App app = new App();
         List<Integer> numbers = app.getNumbers();
         Assertions.assertNotNull(numbers);
         Assertions.assertEquals(  2, numbers.get(1));
         Assertions.assertEquals(  5, numbers.size());
     }
@Test
    void testOperate(){
         Calculadora cal = new Calculadora();
         double result = cal.sumar(1,3);
         Assertions.assertEquals(4,result);
}

}
