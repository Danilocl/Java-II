package enumParametros;

public enum WhoisI {
	
	kratos("Deus da Guerra"),
	ezio("Assasino da Porra"),
	mario("Encanador Pica da Gal�xias viciado em cogumelos"),
	sonic("Porco espinho azul viciado em moedas"),
	hitman("Assasino careca");
	
	
    private String url;
    /*	
     * � preciso de um construtor para que o enum receba um par�metro
     */
    WhoisI(String url) {
        this.url = url;
    }
    //m�todo que ir� retornar a vari�vel
    public String url() {
        return url;
    }
}
