package modulo2.encapsulamento.listas_extras.exercicio05;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private static int geradorId = 0;

    private final int id;
    private final Cliente cliente;
    private String situacao;
    private final OffsetDateTime dataHoraAbertura;
    private double desconto;

    public Pedido(Cliente cliente) {
        geradorId++;
        this.id = geradorId;
        this.cliente = cliente;
        this.situacao = "ABERTO";
        this.dataHoraAbertura = OffsetDateTime.now();
        this.desconto = 0.0;
    }

    public void exibirFicha() {
        System.out.printf("Pedido #%d | Cliente: %s (Cód %d) | Status: %s | Desconto: %.0f%% | Data/Hora: %s%n",
                id, cliente.getNome(), cliente.getCodigo(), situacao, desconto * 100, getDataHoraAberturaFormatada());
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getSituacao() {
        return situacao;
    }

    public OffsetDateTime getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public String getDataHoraAberturaFormatada() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return formato.format(dataHoraAbertura);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}