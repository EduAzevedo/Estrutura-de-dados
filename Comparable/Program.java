import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>();

        list.add(new Funcionario("Eduardo", 2.935));
        list.add(new Funcionario("Pedro", 1.548));
        list.add(new Funcionario("Carlos", 9.652));
        list.add(new Funcionario("Arthur", 1.255));
        list.add(new Funcionario("Bia", 4.824));

        Collections.sort(list);

        for (Funcionario fun : list) {
            System.out.println("Nome: " + fun.getName() + " | Salário: " + fun.getSalario());
        }

    }

}
