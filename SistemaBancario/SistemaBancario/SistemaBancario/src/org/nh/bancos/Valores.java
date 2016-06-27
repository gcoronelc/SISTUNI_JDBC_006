package org.nh.bancos;

import org.nh.cuentas.Usuario;

public class Valores {
	private Usuario[] personas = new Usuario[5];
	
	public Valores() {
		// TODO Auto-generated constructor stub
		cargar_usuarios();
	}

	private void cargar_usuarios() {
		// TODO Auto-generated method stub
		personas[0] = new Usuario("u01", "Jorge Guerra", "profe", "profe");
		personas[1] = new Usuario("u02", "Luis Ramirez", "lucho", "123456");
		personas[2] = new Usuario("u03", "Maria Jara", "marian", "rrtty");
		personas[3] = new Usuario("u04", "Jose Perez", "pepito", "9123");
		personas[4] = new Usuario("u05", "Marde Arana", "mardelia", "bbb44");
	}

	public Usuario[] getPersonas() {
		return personas;
	}
   
}
