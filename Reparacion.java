import java.text.SimpleDateFormat;
import java.util.Date;

public class Reparacion {

	private String tipo;
	private boolean resuelta;
	private long fechaDeCreacion;

	public Reparacion(String tipo) throws ExParametrosNoValidos {
		this.tipo = tipo;
		Date creacion = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		this.setFechaDeCreacion(Long.parseLong(dateFormat.format(creacion)));
	}

	public Reparacion(boolean resuelta) {

		this.resuelta = resuelta;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}

	public void setFechaDeCreacion(long fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public void setResuelta(boolean resuelta) {
		this.resuelta = resuelta;
	}

	@Override
	public String toString() {
		return "Reparacion{" + ",tipo=" + tipo + ", resuelta=" + resuelta + ", fechaDeCreacion=" + fechaDeCreacion
				+ '}';
	}
}