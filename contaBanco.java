
public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void mostarestado(){
        System.out.println("----------------------------");
        System.out.println("conta: " +this.getNumConta());
        System.out.println("tipo: " +this.getTipo());
        System.out.println("dono: " +this.getDono());
        System.out.println("saldo: " +this.getSaldo());
        System.out.println("status: " +this.getStatus());
        System.out.println("----------------------------");
    }
    
    public contaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if(t == "cc"){
        this.setSaldo(50);;
    }else if(t == "cp"){
        this.setSaldo(150);
    }
    }
    public void fecharConta(){
    if(this.getSaldo() > 0 ){
        System.out.println("conta com dinheiro");
    }else if(this.getSaldo() < 0){
        System.out.println("conta com dinheiro");
    }else{
        this.setStatus(false);
        System.out.println("fechada");
    }
    }
    public void depositar(double v){
     if(this.getStatus() == true){
        this.setSaldo(this.getSaldo()+v);
     }else{
      System.out.println("impossivel depositar");
     }
    }
    public void sacar(double v){
      if(this.getStatus() == true){
        if(this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("saldo realizado");
        }
      }else{
        System.out.println("saldo indisponivel para saque");
      }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "cc"){
            v=12;
        }else if(this.getTipo() == "cp"){
            v = 20;

        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidadde paga por " + this.getDono());
        }else{
            System.out.println("impossivel pagar");
        }
    }
    public void setNumConta(int n){
        this.numConta=n;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
        this.tipo=t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono=d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(double s){
        this.saldo=s;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setStatus(boolean st){
        this.status=st;
    }
    public boolean getStatus(){
        return status;
    }
}
