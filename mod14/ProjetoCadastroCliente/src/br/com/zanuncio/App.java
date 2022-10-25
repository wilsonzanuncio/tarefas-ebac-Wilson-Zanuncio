package br.com.zanuncio;

import br.com.zanuncio.dao.ClienteMapDAO;
import br.com.zanuncio.dao.IClienteDAO;
import br.com.zanuncio.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para Cadastro, 2 para Consulta, 3 para Exclusão, 4 para Alteração ou 5 para Sair.",
                "Sistema para Cadastro de Clientes", JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            if (isOpcaoSair(opcao) || "".equals(opcao)) {
                sair();
                break;
            } else if (!isOpcaoValida(opcao)) {
                JOptionPane.showMessageDialog(null,
                        "Opção inválida.",
                        "Sistema para Cadastro de Clientes", JOptionPane.INFORMATION_MESSAGE);
            } else if (isOpcaoCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados apenas por vírgulas (Ex: Nome,CPF,Telefone,Endereço,Número,Cidade,Estado).",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isOpcaoConsulta(opcao)) {
                String cpf = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente (apenas números)",
                        "Consulta", JOptionPane.INFORMATION_MESSAGE);
                consultar(cpf);
            } else if (isOpcaoExclusao(opcao)) {
                String cpf = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente (apenas números)",
                        "Exclusão", JOptionPane.INFORMATION_MESSAGE);
                excluir(cpf);
            } else if (isOpcaoAlteracao(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados apenas por vírgulas (Ex: Nome,CPF,Telefone,Endereço,Número,Cidade,Estado).",
                        "Alteração", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para Cadastro, 2 para Consulta, 3 para Exclusão, 4 para Alteração ou 5 para Sair.",
                    "Sistema para Cadastro de Clientes", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");

        Cliente cliente = new Cliente(dadosSeparados[0], Long.parseLong(dadosSeparados[1]),
                Long.parseLong(dadosSeparados[2]), dadosSeparados[3], Integer.parseInt(dadosSeparados[4]),
                dadosSeparados[5], dadosSeparados[6]);

        boolean isAlterado = iClienteDAO.alterar(cliente);

        if (isAlterado) {
            JOptionPane.showMessageDialog(null,
                    "Alterações realizadas com sucesso.",
                    "Alteração realizada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Alterações não realizadas. O cliente " + cliente.toString()
                            + " não está cadastrado no banco de dados.",
                    "Alteração não realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoAlteracao(String opcao) {
        return "4".equals(opcao);
    }

    private static void excluir(String cpf) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpf));

        if (cliente != null) {
            JOptionPane.showMessageDialog(null,
                    "Cadastro do cliente " + cliente.toString() + " excluído com sucesso.",
                    "Exclusão realizada", JOptionPane.INFORMATION_MESSAGE);

            iClienteDAO.excluir(Long.parseLong(cpf));
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cadastro do cliente não encontrado.",
                    "Exclusão não realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoExclusao(String opcao) {
        return "3".equals(opcao);
    }

    private static void consultar(String cpf) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpf));

        if (cliente != null) {
            JOptionPane.showMessageDialog(null,
                    "Cadastro encontrato com sucesso. Cliente " + cliente.toString() + ".",
                    "Consulta realizada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cadastro do cliente não encontrado.",
                    "Consulta realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoConsulta(String opcao) {
        return "2".equals(opcao);
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");

        Cliente cliente = new Cliente(dadosSeparados[0], Long.parseLong(dadosSeparados[1]),
                Long.parseLong(dadosSeparados[2]), dadosSeparados[3], Integer.parseInt(dadosSeparados[4]),
                dadosSeparados[5], dadosSeparados[6]);

        boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        if (isCadastrado) {
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso.",
                    "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente já cadastrado no banco de dados.",
                    "Cadastro não realizado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null,
                "Sistema encerrado.",
                "Sistema para Cadastro de Clientes", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        switch (opcao) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                return true;
            default:
                return false;
        }
    }
}
