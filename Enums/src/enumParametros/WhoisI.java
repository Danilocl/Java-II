package enumParametros;

public enum WhoisI {
	
	kratos("Deus da Guerra"),
	ezio("Assasino da Porra"),
	mario("Encanador Pica da Galáxias viciado em cogumelos"),
	sonic("Porco espinho azul viciado em moedas"),
	hitman("Assasino careca");
	
	
    private String url;
    /*	
     * É preciso de um construtor para que o enum receba um parâmetro
     */
    WhoisI(String url) {
        this.url = url;
    }
    //método que irá retornar a variável
    public String url() {
        return url;
    }
}
