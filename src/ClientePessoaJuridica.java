import java.time.LocalDate;

public class ClientePessoaJuridica extends Cliente {

    private String cnpj;
    private String razaoSocial;
    private LocalDate dataAberturaSede;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public LocalDate getDataAberturaSede() {
        return dataAberturaSede;
    }

    public void setDataAberturaSede(LocalDate dataAberturaSede) {
        this.dataAberturaSede = dataAberturaSede;
    }
}
