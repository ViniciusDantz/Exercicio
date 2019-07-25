public class Agenda {
    
    Contato[] contatos;
    
    public Agenda(){
        contatos = new Contato[20];
    }
        
    public boolean addContato(Contato contato){
        for (int i = 0; i < 20; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                return true;
            }
        }
        return false;
    }
    
    public Contato buscaNome(String nome){
        for (int i = 0; i < 20; i++) {
            if(contatos[i] != null){
                if(nome.equalsIgnoreCase(contatos[i].getNome())){
                    return contatos[i];
                }
            }
        }
        return null;
    }
    
    public boolean excluiContato(String nome){
        for (int i = 0; i < 20; i++) {
            if(nome.equalsIgnoreCase(contatos[i].getNome())){
                contatos[i] = null;
                return true;
            }
        }
        return false;
    }
}