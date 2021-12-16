package EuskalmetHibernate;
// Generated 16 dic 2021 19:50:39 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Municipios generated by hbm2java
 */
public class Municipios implements java.io.Serializable {

	private int codMunicipio;
	private Provincia provincia;
	private String nombre;
	private String descripcion;
	private Set estacioneses = new HashSet(0);
	private Set espaciosNaturaleses = new HashSet(0);
	private Set usuarioses = new HashSet(0);

	public Municipios() {
	}

	public Municipios(int codMunicipio, Provincia provincia, String nombre, String descripcion) {
		this.codMunicipio = codMunicipio;
		this.provincia = provincia;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Municipios(int codMunicipio, Provincia provincia, String nombre, String descripcion, Set estacioneses,
			Set espaciosNaturaleses, Set usuarioses) {
		this.codMunicipio = codMunicipio;
		this.provincia = provincia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estacioneses = estacioneses;
		this.espaciosNaturaleses = espaciosNaturaleses;
		this.usuarioses = usuarioses;
	}

	public int getCodMunicipio() {
		return this.codMunicipio;
	}

	public void setCodMunicipio(int codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getEstacioneses() {
		return this.estacioneses;
	}

	public void setEstacioneses(Set estacioneses) {
		this.estacioneses = estacioneses;
	}

	public Set getEspaciosNaturaleses() {
		return this.espaciosNaturaleses;
	}

	public void setEspaciosNaturaleses(Set espaciosNaturaleses) {
		this.espaciosNaturaleses = espaciosNaturaleses;
	}

	public Set getUsuarioses() {
		return this.usuarioses;
	}

	public void setUsuarioses(Set usuarioses) {
		this.usuarioses = usuarioses;
	}

}
