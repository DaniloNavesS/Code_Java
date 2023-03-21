public class Porta {
    boolean aberto = true;
    String cor = "preta";
    float dimensãoX, dimensãoY, dimensãoZ;

    void abre(Porta porta1) {
        if (porta1.aberto) {
            System.out.println("A porta está aberta");
        } else {
            porta1.aberto = true;
            System.out.println("A porta está aberta");
        }
    }

    void fecha(Porta porta1) {
        if (!porta1.aberto) {
            System.out.println("A porta está Fechada");
        } else {
            porta1.aberto = false;
            System.out.println("A porta está Fechada");
        }
    }

    void pinta(Porta porta1, String s) {
        porta1.cor = s;
        System.out.println("A cor da porta é : " + s);
    }

    boolean estaAberto(Porta porta1) {
        if (porta1.aberto) {
            System.out.println("Aberto");
            return true;
        }
        else {
            System.out.println("Fechado");
            return false;
        } 
    }
}
