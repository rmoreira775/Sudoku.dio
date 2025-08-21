public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Passe o estado do jogo como argumento.");
            return;
        }
        String jogo = args[0];

        controller.GameController controller = new controller.GameController();
        controller.newGameFromArg(jogo);

        // Opcional: salvar, carregar, etc.
    }
}
