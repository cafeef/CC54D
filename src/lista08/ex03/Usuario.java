package lista08.ex03;

public class Usuario {
	private String nome;
	private String senha;
	private boolean loginRealizado;
	
	//construtor
	public Usuario(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.loginRealizado = false;
	}
	
	//função de login
	public void realizarLogin(String nome, String senha) {
		try {
			if (this.nome.equals(nome)) {
				if (this.senha.equals(senha)) {
					System.out.println("Sucesso em realizar o login!");
					this.loginRealizado = true;
				}
				else {
					throw new SenhaIncorreta("Senha incorreta.");
				}
			}
			else {
				throw new NomeIncorreto("Nome incorreto.");
			}
		} catch (NomeIncorreto e)  {
			System.out.println(e.getMessage());
		}
		catch (SenhaIncorreta e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void modificarSenha(String senhaAtual, String novaSenha, String confimarSenha) {
	    try {
	        if (this.loginRealizado) {

	            if (this.senha.equals(senhaAtual)) {

	                if (novaSenha.equals(confimarSenha)) {

	                    if (isValidPassword(novaSenha)) {
	                        this.senha = novaSenha;
	                        System.out.println("Senha modificada com sucesso!");
	                    } else {
	                        throw new CaracteresIncompletos(
	                            "A nova senha deve ter no mínimo 8 caracteres, " +
	                            "conter letra maiúscula, letra minúscula e número."
	                        );
	                    }

	                } else {
	                    throw new SenhaIncorreta("A nova senha e sua confirmação não coincidem.");
	                }

	            } else {
	                throw new SenhaIncorreta("A senha atual e a cadastrada não coincidem.");
	            }

	        } else {
	            throw new LoginNaoRealizado("Você não realizou o login, não é possível modificar a senha.");
	        }

	    } catch (LoginNaoRealizado | SenhaIncorreta | CaracteresIncompletos e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	private boolean isValidPassword(String senha) {
	    if (senha == null) return false;

	    boolean hasUpper = false;
	    boolean hasLower = false;
	    boolean hasDigit = false;

	    if (senha.length() < 8) {
	        return false;
	    }

	    for (char c : senha.toCharArray()) {
	        if (Character.isUpperCase(c)) {
	            hasUpper = true;
	        } else if (Character.isLowerCase(c)) {
	            hasLower = true;
	        } else if (Character.isDigit(c)) {
	            hasDigit = true;
	        }
	    }

	    return hasUpper && hasLower && hasDigit;
	}
	
	
}
