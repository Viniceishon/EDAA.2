
public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        criarFuncionariosFicticios(empresa);
        double folhaSalarial = empresa.calcularFolhaSalarial();
        System.out.println("Folha Salarial Total: R$ " + folhaSalarial);
    }

    public static void criarFuncionariosFicticios(Empresa empresa) {
        Funcionario desenvolvedor = new Desenvolvedor("PEDRO", 238, 7.452);
        Funcionario gerente = new Gerente("VINICIUS", 92, 11.291);
        Funcionario suporte = new Suporte("NICOLAS", 124, 4.879);

        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(suporte);

        System.out
                .println("DESENVOLVEDOR:  " + desenvolvedor.getNome() + ", Salário: R$ " + desenvolvedor.getSalario());
        System.out.println("GERENTE: " + gerente.getNome() + ", Salário: R$ " + gerente.getSalario());
        System.out.println("SUPORTE  " + suporte.getNome() + ", Salário: R$ " + suporte.getSalario());
    }
}
