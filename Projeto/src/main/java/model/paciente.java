package model;

public class paciente {
	private int cod_paciente;
	private String nome_paciente;
	private String sobrenome_paciente;
	public int getCod_paciente() {
		return cod_paciente;
	}
	public void setCod_paciente(int Cod_paciente) {
		this.cod_paciente = Cod_paciente;
	}
	public String getNome_paciente() {
		return nome_paciente;
	}
	public void setNome_paciente(String nome_paciente) {
		this.nome_paciente = nome_paciente;
	}
	public String getSobrenome_paciente() {
		return sobrenome_paciente;
	}
	public void setSobrenome_paciente(String sobrenome_paciente ) {
		this.sobrenome_paciente = sobrenome_paciente ;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		paciente other = (paciente) obj;
		if (sobrenome_paciente != other.sobrenome_paciente)
			return false;
		if (nome_paciente == null) {
			if (other.nome_paciente != null)
				return false;
		} else if (!nome_paciente.equals(other.nome_paciente))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "paciente [sobrenome_paciente=" + sobrenome_paciente + ", nome_paciente=" + nome_paciente + "]";
	}
	
	
}

