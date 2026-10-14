package negocio;

public class MainCarro {
    static void main() {
        System.out.println("El número de objetos de tipo Carro creados son: "+Carro.getNumCarros());
        System.out.println("El IVA de los vehiculos es: "+Carro.getIva());
        Carro c1 = new Carro(2,67);
        Carro c2 =  new Carro(-5,-100);
        Carro c3 =  new Carro();
        System.out.println("El número de objetos de tipo Carro creados son: "+Carro.getNumCarros());
        System.out.println("El precio de venta al público del carro 1 es: "c1.calcularPrecioTotal(21599));

      /*  c1.velocidad = 100;
        c1.potencia = 5;
        c1.setVelocidad(100);
        c1.setPotencia(5);

        c2.setVelocidad(-50);
        c2.setPotencia(-2);*/

       // System.out.println("La velocidad es "+c1.velocidad+" y la potencia es "+c1.potencia);
        System.out.println("La velocidad del carro 1 es "+c1.getVelocidad()+" y la potencia es "+c1.getPotencia());
        System.out.println("La velocidad del carro 2 es "+c2.getVelocidad()+" y la potencia es "+c2.getPotencia());
        System.out.println("La velocidad del carro 3 es "+c3.getVelocidad()+" y la potencia es "+c3.getPotencia());
        c1.acelerar();
        c1.frenar();

    }

}
