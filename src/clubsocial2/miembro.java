/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubsocial2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author GCAM
 */

public class miembro {
	
	public int NumberodeMembresia;
	public Date FechaDeEmisionMembresia;
	public Date FechaVencimientoMembresia; 
	private List<miembro> listMiembro;
	public void MiembroController () {
		listMiembro = new ArrayList();
	}
	public void Add(miembro Obj) {
		listMiembro.add(Obj);
	}
	public List<miembro> GetList() {	
		return listMiembro;
	}
}