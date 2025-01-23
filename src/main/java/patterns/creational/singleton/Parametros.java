package patterns.creational.singleton;

public class Parametros {
    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String usuarioLogado;
    private String codigoLaboratorio;

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String getCodigoLaboratorio(){
        return codigoLaboratorio;
    }

    public void setCodigoLaboratorio(String codigoLaboratorio){
        this.codigoLaboratorio = codigoLaboratorio;
    }
}
