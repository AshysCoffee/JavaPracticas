package superTIA;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

	private ArrayList<Empleado> Personal;
	

    public Tienda() {
        Personal = new ArrayList<Empleado>();
      
    }

    
    public List<Empleado> getPersonal() {
		return Personal;
	}


	public void agregarEmpleado(Empleado e) {
		Personal.add(e);
    }
	
	
}
