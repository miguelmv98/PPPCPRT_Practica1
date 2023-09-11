import fundamentos.*;

public class SimulaciónVehiculos {

	public static void main(String[] args) {
		Dibujo maqueta = new Dibujo("Ejemplo de circuitos",800,600);
		
		Circuito c1 = new Circuito(100,50,60,25,10);
		Circuito c2 = new Circuito(250,100,30,20,10);
		Circuito c3 = new Circuito(50,300,70,25,10);
		Circuito c4 = new Circuito(200,300,40,20,10);
        
        c1.pinta(maqueta,ColorFig.azul);
        c2.pinta(maqueta,ColorFig.azul);
        c3.pinta(maqueta,ColorFig.azul);
        c4.pinta(maqueta,ColorFig.azul);
        
        maqueta.pinta();
        
        Sleep(maqueta);
        
        Vehiculo v1 = new Vehiculo(c1,true,0,450,ColorFig.rojo,ColorFig.azul,maqueta);
        Vehiculo v2 = new Vehiculo(c2,false,0,1350,ColorFig.naranja,ColorFig.azul,maqueta);
        Vehiculo v3 = new Vehiculo(c3,true,0,2700,ColorFig.amarillo,ColorFig.azul,maqueta);
        Vehiculo v4 = new Vehiculo(c4,true,0,5400,ColorFig.verde,ColorFig.azul,maqueta);
      
        
        maqueta.pinta();
        Sleep(maqueta);
      
        // Recorre 100 posiciones en el circuito
        for (int i=1; i<=100; i++)
        {
        	Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            v2.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            v2.Avanza();
            v3.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            v2.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            Sleep(maqueta);
            v1.Avanza();
            v2.Avanza();
            v3.Avanza();
            v4.Avanza();
            
        }
	}
       private static void Sleep(Dibujo maqueta) {
    	maqueta.pinta();
		try {
 			Thread.sleep(45);
 		} catch (InterruptedException e) {}
	
	}
	
	

}
