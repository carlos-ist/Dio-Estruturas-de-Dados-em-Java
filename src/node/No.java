package node;

public class No {

    private String conteudo;
    private No proximoNo; // É necessário ter uma referência/variável do tipo nó, para que seja possível 
    					  // atribuir uma instância de objeto nó para a mesma.
                          // Então um nó, possui como atributo uma referência que pode apontar para outro nó.
    					  // Caso não haja próximo nó, o contrutor já inicializa esta referência como null.
    
    public No(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) { // Aqui é coletado a referência do próximo objeto. Que é do tipo Nó.
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() { // Necessário visualizar os encadeamentos de uma forma amigável.
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}