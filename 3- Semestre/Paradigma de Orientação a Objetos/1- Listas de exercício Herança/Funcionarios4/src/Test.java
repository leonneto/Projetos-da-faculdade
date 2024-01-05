
public class Test {

	public static void main(String[] args) {
		AssistenteTecnico assistenteTecnico = new AssistenteTecnico("Jaime", "12345678", 3000.0, 0, 500.0);
        AssistenteAdministrativo assistenteAdministrativo = new AssistenteAdministrativo("Jaime", 2000.0,"Noturno", "12345", 2000, 25);

        System.out.println("Dados do Assistente Técnico:");
        assistenteTecnico.exibeDados();

        System.out.println("\nDados do Assistente Administrativo:");
        assistenteAdministrativo.exibeDados();

}
}