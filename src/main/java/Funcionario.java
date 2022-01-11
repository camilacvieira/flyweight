public class Funcionario {

    private String nome;
    private Cidade cidadeResidencia;

    public Funcionario(String nome, Cidade cidadeResidencia) {
        this.nome = nome;
        this.cidadeResidencia = cidadeResidencia;
    }

    public String obterFuncionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeResidencia.getNome() + '\'' +
                ", uf='" + cidadeResidencia.getUf() + '\'' +
                '}';
    }
}