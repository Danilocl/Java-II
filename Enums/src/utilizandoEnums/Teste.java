package utilizandoEnums;

public class Teste {
	/*
	 * Fazendo teste com enums
	 */
	public static void main(String[] args) {

		// System.out.println(UserStatus.ativo + " " + UserStatus.inativo);
		
		for (UserStatus user : UserStatus.values()) {
			System.out.println(user);
		}
	

	}

}
