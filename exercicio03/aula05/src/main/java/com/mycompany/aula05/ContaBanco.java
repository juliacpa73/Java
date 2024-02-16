package com.mycompany.aula05;

public class ContaBanco {

    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

  /*  public void abrirConta() {//ABRIR A CONTA
        input = new Scanner(System.in);
        this.setStatus(true);
        System.out.println("Digite o seu nome: ");
        this.dono = input.nextLine();
        System.out.println("Informe o numero da conta a ser utilizado: ");
        this.numConta = Integer.parseInt(input.nextLine());
        System.out.print("Informe o tipo de conta:\ncc-CONTA CORRENTE\ncp-CONTA POUPANÇA\n");
        this.tipo = input.nextLine();
        if (this.tipo.equals("cc")) {
            this.setSaldo(50);
        } else if (this.tipo.equals("cp")) {
            this.setSaldo(150);
        }

    }

    */
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.saldo >= 0) {
            System.out.println("Conta com dinheiro.");
        } else if (saldo <= 0) {
            System.out.println("Conta em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(float valor) {
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono() + ".");
        } else {
            System.out.println("Não é possível depositar!");
        }
    }

    public void sacar(float valor) {
        if (isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono() + ".");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Não é possível sacar!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (isStatus()) {
            this.getSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + ".");
        } else {
            System.out.println("Não é possível realizar pagamento!");
        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private void getSaldo(float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
