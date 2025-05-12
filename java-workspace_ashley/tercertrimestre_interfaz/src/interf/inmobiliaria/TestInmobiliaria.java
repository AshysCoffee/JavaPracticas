package interf.inmobiliaria;

public class TestInmobiliaria {

	public static void main(String[] args) {
		
		Agencia_Inmobiliaria a1 = new Agencia_Inmobiliaria ("TecnoCasa");
		
		Inmueble s1 = new Solar("Calle Sol 12", 50000, 200, 1, TipoSolar.URBANO);
		Inmueble s2 = new Solar("Camino Viejo", 30000, 500, 2, TipoSolar.RUSTICO);
		Inmueble s3 = new Solar("Avenida Libertad", 75000, 250, 3, TipoSolar.URBANO);
		Inmueble s4 = new Solar("Finca El Prado", 20000, 600, 4, TipoSolar.RUSTICO);


		Inmueble l1 = new Local_Comercial("Centro Comercial Sur", 150000, 120, 5, EstadoConstruccion.NUEVA);
		Inmueble l2 = new Local_Comercial("Calle Comercio 8", 85000, 95, 6, EstadoConstruccion.SEGUNDA_MANO);
		Inmueble l3 = new Local_Comercial("Plaza Mayor", 120000, 130, 7, EstadoConstruccion.SEGUNDA_MANO);
		Inmueble l4 = new Local_Comercial("Av. de la Empresa", 180000, 160, 8, EstadoConstruccion.NUEVA);

		
		Inmueble v1 = new Vivienda("Calle Flor 3", 180000, 90, 9, 3, 2, EstadoConstruccion.NUEVA);
		Inmueble v2 = new Vivienda("Paseo del Parque", 150000, 85, 10, 2, 1, EstadoConstruccion.SEGUNDA_MANO);
		Inmueble v3 = new Vivienda("Av. Verde 14", 220000, 100, 11, 800, 4, 3, EstadoConstruccion.NUEVA);
		Inmueble v4 = new Vivienda("Calle Luna 7", 130000, 75, 12, 600, 2, 1, EstadoConstruccion.SEGUNDA_MANO);

		
		Inmueble g1 = new Plaza_Garaje("Calle Ruedas 10", 12000, 12, 13, TipoGaraje.PUBLICA);
		Inmueble g2 = new Plaza_Garaje("Parking Centro", 18000, 15, 14, TipoGaraje.PRIVADA);
		Inmueble g3 = new Plaza_Garaje("Garaje Norte", 10000, 10, 15, TipoGaraje.PUBLICA);
		Inmueble g4 = new Plaza_Garaje("Sótano Plaza Este", 16000, 14, 16, TipoGaraje.PRIVADA);

		a1.addInmueble(s1);
		a1.addInmueble(s2);
		a1.addInmueble(s3);
		a1.addInmueble(s4);
		
		a1.addInmueble(l1);
		a1.addInmueble(l2);
		a1.addInmueble(l3);
		a1.addInmueble(l4);
		
		a1.addInmueble(v1);
		a1.addInmueble(v2);
		a1.addInmueble(v3);
		a1.addInmueble(v4);
		
		a1.addInmueble(g1);
		a1.addInmueble(g2);
		a1.addInmueble(g3);
		a1.addInmueble(g4);
		
		System.out.println(a1.getNombre_agencia()+"\n");
		for(Inmueble i:a1.getAgencia()) {
			System.out.println(i.toString());
		}
		
		Agencia_Inmobiliaria a2 = new Agencia_Inmobiliaria ("RedPiso");
		
		Plaza_Garaje g5 = new Plaza_Garaje("Garaje Subterráneo A", 14000, 13, 17, TipoGaraje.PUBLICA);
		Plaza_Garaje g6 = new Plaza_Garaje("Parking Mercado Central", 20000, 16, 18, TipoGaraje.PRIVADA);
		Plaza_Garaje g7 = new Plaza_Garaje("Calle Estación 22", 9500, 11, 19, TipoGaraje.PUBLICA);
		Plaza_Garaje g8 = new Plaza_Garaje("Garaje Residencial Las Palmas", 17000, 14, 20, TipoGaraje.PRIVADA);
		
		Solar s5 = new Solar("Camino del Bosque", 27000, 350, 21, TipoSolar.RUSTICO);
		Solar s6 = new Solar("Av. del Sol 45", 62000, 180, 22, TipoSolar.URBANO);
		Solar s7 = new Solar("Callejón Real", 24000, 400, 23, TipoSolar.RUSTICO);
		Solar s8 = new Solar("Bulevar Norte", 80000, 300, 24, TipoSolar.URBANO);

		Local_Comercial l5 = new Local_Comercial("Calle Nueva 1", 95000, 100, 25, EstadoConstruccion.SEGUNDA_MANO);
		Local_Comercial l6 = new Local_Comercial("Zona Industrial Sur", 130000, 140, 26, EstadoConstruccion.NUEVA);
		Local_Comercial l7 = new Local_Comercial("Plaza del Pueblo", 110000, 110, 27, EstadoConstruccion.SEGUNDA_MANO);
		Local_Comercial l8 = new Local_Comercial("Callejón del Comercio", 145000, 150, 28, EstadoConstruccion.NUEVA);

		
		Vivienda v5 = new Vivienda("Calle Girasol 9", 170000, 88, 29, 3, 2, EstadoConstruccion.SEGUNDA_MANO);
		Vivienda v6 = new Vivienda("Paseo Marítimo", 210000, 95, 30, 2, 1, EstadoConstruccion.NUEVA);
		Vivienda v7 = new Vivienda("Av. del Río", 195000, 92, 31, 750, 3, 2, EstadoConstruccion.SEGUNDA_MANO);
		Vivienda v8 = new Vivienda("Urbanización Los Álamos", 240000, 105, 32, 950, 4, 3, EstadoConstruccion.NUEVA);


		a1.addInmueble(s5);
		a1.addInmueble(s6);
		a1.addInmueble(s7);
		a1.addInmueble(s8);
		
		a1.addInmueble(l5);
		a1.addInmueble(l6);
		a1.addInmueble(l7);
		a1.addInmueble(l8);
		
		a1.addInmueble(v5);
		a1.addInmueble(v6);
		a1.addInmueble(v7);
		a1.addInmueble(v8);
		
		a1.addInmueble(g5);
		a1.addInmueble(g6);
		a1.addInmueble(g7);
		a1.addInmueble(g8);
		
		System.out.println(a2.getNombre_agencia()+"\n");
		for(Inmueble i:a2.getAgencia()) {
			System.out.println(i.toString());
		}
		
		Agencia_Inmobiliaria a3 = a1.FusionAgInmobiliaria(a2);
		
		System.out.println("Nueva Inmobiliaria");
		for(Inmueble i:a3.getAgencia()) {
			System.out.println(i.toString());
		}
		
		
		
	}

}
