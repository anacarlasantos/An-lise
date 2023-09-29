import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SistemaBancarioTabajara {
    public static void main(String[] args) {
        try {
            Connection conn = Conexao.abrir();
            criarTabelaSeNaoExistir(conn); // Crie a tabela se ainda não existir

            Scanner scanner = new Scanner(System.in);
            int escolha;
            
                System.out.println("Sistema Bancário Tabajara");
                System.out.println("1 - Cadastrar conta");
                System.out.println("2 - Consultar conta");
                System.out.println("3 - Alterar conta");
                System.out.println("4 - Remover conta");
                System.out.println("5 - Exibir todas as contas");
                System.out.println("6 - Sair do sistema");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();

            do {

                switch (escolha) {
                    case 1:
                        cadastrarConta(conn);
                        break;
                    case 2:
                        consultarConta(conn);
                        break;
                    case 3:
                        alterarConta(conn);
                        break;
                    case 4:
                        removerConta(conn);
                        break;
                    case 5:
                        exibirTodasContas(conn);
                        break;
                    case 6:
                        System.out.println("Saindo do sistema.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (escolha != 6);

            Conexao.fechar(conn);
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void criarTabelaSeNaoExistir(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS contas (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "nome VARCHAR(255)," +
                     "saldo DECIMAL(10, 2))";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
    }

    private static void cadastrarConta(Connection conn) throws SQLException {
        // Implemente a lógica para cadastrar uma conta no banco de dados
    }

    private static void consultarConta(Connection conn) throws SQLException {
        // Implemente a lógica para consultar uma conta no banco de dados
    }

    private static void alterarConta(Connection conn) throws SQLException {
        // Implemente a lógica para alterar uma conta no banco de dados
    }

    private static void removerConta(Connection conn) throws SQLException {
        // Implemente a lógica para remover uma conta do banco de dados
    }

    private static void exibirTodasContas(Connection conn) throws SQLException {
        // Implemente a lógica para exibir todas as contas do banco de dados
    }
}
