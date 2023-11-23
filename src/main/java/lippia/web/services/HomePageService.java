package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class HomePageService extends ActionManager {
        public static void menuInicio(){
                click(HomePageConstants.INICIO);
        }

        public static void sliders(){
               if (isVisible(HomePageConstants.SLIDER1)){
                       click(HomePageConstants.FLECHA);
                } else if(isVisible(HomePageConstants.SLIDER2)){
                        click(HomePageConstants.FLECHA);
                } else if (isVisible(HomePageConstants.SLIDER3)){
                        Assert.assertTrue(true);
                } else {
                       Assert.fail();
               }
        }

        public  static void arrival(){
                click(HomePageConstants.ARRIVAL);
        }

        public  static void libroElegido(){
                Assert.assertTrue(isVisible(HomePageConstants.LIBRO_ELEGIDO));
        }

        public  static void agregar(){
                click(HomePageConstants.AGREGAR);
        }

        public  static void cesta(){
                click(HomePageConstants.CESTA);
        }

        public  static void detalles(){
                Assert.assertTrue(isVisible(HomePageConstants.DETALLES));
        }


        public  static void valores(){
                WebElement valor1 = getElement(HomePageConstants.SUBTOTAL);
                WebElement valor2 = getElement(HomePageConstants.IMPUESTO);
                WebElement valor3 = getElement(HomePageConstants.TOTAL);

                int valor1S = Integer.parseInt(valor1.getText());
                int valor2I = Integer.parseInt(valor2.getText());
                int valor3T = Integer.parseInt(valor3.getText());

                int verificacion = valor1S + valor2I;

                if (verificacion == valor3T && valor1S < valor3T){
                        Assert.assertTrue(true);
                } else{
                    Assert.fail();
                }
        }


        public  static void pasarela(){
                click(HomePageConstants.PASARELA);
        }

        public  static void validacion(){
                click(HomePageConstants.PROCESO);
        }

        public  static void agregarCupon(){
                click(HomePageConstants.PROCESO);
        }

        public  static void datos(){
                click(HomePageConstants.PROCESO);
        }

        public  static void compra(){
                click(HomePageConstants.PROCESO);
        }
}
