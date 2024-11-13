package ifrn.pi.darlingBeauty.models;

<<<<<<< HEAD:src/main/java/ifrn/pi/darlingBeauty/models/cadastroUsuario.java
import jakarta.persistence.Entity;

@Entity
public class CadastroUsuario {
=======
public class Usuarios {
>>>>>>> 373d3503946d53702bd0e7a260e0370ee5b749c7:src/main/java/ifrn/pi/darlingBeauty/models/Usuarios.java

	private String cpf;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String senha;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
