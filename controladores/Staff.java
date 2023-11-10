package controladores;

import Sql.SqlMedico;
import java.util.ArrayList;
import entidades.Medico;
import java.util.Scanner;

public class Staff {
    private SqlMedico sql = new SqlMedico();
    private ArrayList<Medico> staff = new ArrayList<Medico>();
    Scanner inputString = new Scanner(System.in);

    public void adicionar5Medicos() throws Exception {
        for (int i = 1; i < 6; i++) {
            System.out.println("\nDigite o nome do médico " + i + ":");
            String nome = inputString.nextLine();
            System.out.println("\nDigite a especialidade do médico " + i + ":");
            String especialidade = inputString.nextLine();
            Medico medico = new Medico(nome, especialidade);
            staff.add(medico);
        }
        sql.adicionar5Medicos(staff);
        staff.clear();
    }

    public void adicionarMedico(String nome, String especialidade) throws Exception {
        sql.adicionarMedico(nome, especialidade);
        return;
    }

    public void removerMedico(int id) throws Exception {
        sql.removerMedico(id);
        return;
    }

    public void alterarMedico(String nome, String especialidade, int id) throws Exception {
        sql.alterarMedico(id, nome, especialidade);
    }

    public void listarMedicos() throws Exception {
        sql.listarMedicos();
    }

    public boolean selecionarMedico(int id) throws Exception {
        if (sql.selecionarMedico(id)) {
            return true;
        }
        return false;
    }

    public void buscarMedicosPorNome(String nome) throws Exception {
        sql.buscarMedicosPorNome(nome);
    }

}