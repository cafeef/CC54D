package lista07.ex03;

// IMPORTANTE:
// Você DEVE criar a classe 'Endereco' no pacote 'aula10'
// para que este import e o restante do código funcionem.
import aula10.Endereco;

public class LocadoraTeste {

    public static void main(String[] args) {
        
        // --- 0. Configuração Inicial (Mock Endereco) ---
        // Criando objetos Endereco (assumindo que a classe existe)
        Endereco endSocio = new Endereco("Rua dos Sócios", 123, "Centro", "Cidade Teste", "UF", "12345-000");
        Endereco endDep = new Endereco("Av. dos Dependentes", 456, "Bairro", "Cidade Teste", "UF", "54321-000");

        // --- 1. Criação dos Filmes ---
        Filme f1 = new Filme("Matrix", 136, 7.50, 2.50);
        Filme f2 = new Filme("Interestelar", 169, 8.00, 3.00);
        
        System.out.println("==================================================");
        System.out.println("      PAINEL DE TESTES DA LOCADORA");
        System.out.println("==================================================");


        System.out.println("\n====== CENÁRIO 1: CRIAÇÃO DE SÓCIO ======");
        // --- 2. Teste: Criar Sócio ---
        Socio socio1 = new Socio("Carlos Andrade", "15/03/1990", "98888-1000", endSocio);
        socio1.imprimirDados();


        System.out.println("\n====== CENÁRIO 2: ADICIONAR DEPENDENTE ======");
        // --- 3. Teste: Adicionar Dependente ---
        // ATENÇÃO: Isso causará NullPointerException SEM A CORREÇÃO na classe Socio!
        try {
            socio1.adicionarDependente("Ana Andrade", "20/11/2005", "98888-1001", endDep);
            System.out.println("\n[SUCESSO] Dependente 'Ana Andrade' adicionado.");
        } catch (NullPointerException e) {
            System.out.println("\n[ERRO] Falha ao adicionar dependente! (NullPointerException)");
            System.out.println("Lembre-se de inicializar a 'List<Dependente>' no construtor de Socio.");
        }
        
        // Criamos um dependente avulso para os próximos testes
        Dependente dep1 = new Dependente("Ana Andrade (Avulso)", "20/11/2005", "98888-1001", endDep);


        System.out.println("\n====== CENÁRIO 3 e 4: LOCAR E DEVOLVER (SEM ATRASO) ======");
        System.out.println("--- Status Inicial (Filme 1) ---");
        f1.imprimirDados();
        
        System.out.println("\n--- Tentativa de Locação (Sócio Carlos) ---");
        f1.locarFilme(10, socio1); // Locado no dia 10 (Previsão de devolução: 13)
        
        System.out.println("\n--- Status Pós-Locação (Filme 1) ---");
        f1.imprimirDados(); // Deve mostrar 'indisponível' e dados do Carlos

        System.out.println("\n--- Tentativa de Locação Duplicada (Deve Falhar) ---");
        f1.locarFilme(11, dep1); // Deve falhar, já está locado

        System.out.println("\n--- Tentativa de Devolução (Sem Atraso) ---");
        f1.devolverFilme(13); // Devolvido no dia 13 (Data Limite). Sem multa.
        
        System.out.println("\n--- Status Pós-Devolução (Filme 1) ---");
        f1.imprimirDados(); // Deve mostrar 'disponível'


        System.out.println("\n====== CENÁRIO 5: LOCAR E DEVOLVER (COM ATRASO) ======");
        System.out.println("--- Status Inicial (Filme 2) ---");
        f2.imprimirDados();
        
        System.out.println("\n--- Tentativa de Locação (Dependente Ana) ---");
        f2.locarFilme(20, dep1); // Locado no dia 20 (Previsão de devolução: 23)

        System.out.println("\n--- Status Pós-Locação (Filme 2) ---");
        f2.imprimirDados(); // Deve mostrar 'indisponível' e dados da Ana

        System.out.println("\n--- Tentativa de Devolução (COM Atraso) ---");
        // Atraso de 2 dias (25 - 23). Valor Atraso: 3.00
        // Multa esperada: 2 * 3.00 = 6.00
        f2.devolverFilme(25); // Devolvido no dia 25.
        
        System.out.println("\n--- Status Pós-Devolução (Filme 2) ---");
        f2.imprimirDados(); // Deve mostrar 'disponível'


        System.out.println("\n====== TESTE EXTRA: DEVOLUÇÃO DE FILME NÃO LOCADO ======");
        // (Note o "livro" no print de erro, vindo da sua classe Filme)
        f1.devolverFilme(30); // Deve falhar
        
        System.out.println("\n==================================================");
        System.out.println("            TESTES CONCLUÍDOS");
        System.out.println("==================================================");
    }
}