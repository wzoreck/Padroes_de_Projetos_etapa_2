import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.List;

public class PublicacaoPrivada extends Publicacao {
    private List<Usuario> amigosProximos;
    private PropriedadesPerfil tipo;

    public PublicacaoPrivada(List<Usuario> amigosProximos, PropriedadesPerfil tipo) {
        this.amigosProximos = amigosProximos;
        this.tipo = tipo;
    }

    public void addPropriedades(Perfil perfil) {
        System.out.println();
        System.out.println(tipo);
        perfil.addPropriedade(this.tipo, 1);
    }
}
