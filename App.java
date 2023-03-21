
class App {
   public static void main(String[] args) {
      Porta porta = new Porta();
      porta.estaAberto(porta);
      porta.fecha(porta);
      porta.estaAberto(porta);
      porta.abre(porta);
      porta.estaAberto(porta);
      porta.pinta(porta, "Azul");
      porta.estaAberto(porta);
   }
}