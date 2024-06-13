import classes.IPhone;
import classes.IPod;
import classes.Safari;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        IPod iPod = new IPod();
        Safari safari = new Safari();

        System.out.println("--------------- Funcões do telefone ---------------");
        iPhone.ligar(973593749);
        iPhone.setEstaLigado(true);
        iPhone.ligar(973593749);
        iPhone.atender();
        iPhone.setEstaTocando(true);
        iPhone.atender();
        iPhone.iniciarCorreioVoz(973593749);

        System.out.println("\n--------------- Funções do iPod ---------------");
        iPod.tocar();
        iPod.selecionarMusica("Where Is My Mind? - Pixies");
        iPod.tocar();
        iPod.pausar();

        System.out.println("\n--------------- Funções do Safari ---------------");
        safari.exibirPagina("https://www.google.com.br");
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
}