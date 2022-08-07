package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Collection;

public class Mentoria extends Conteudo {

    LocalDate data;

    @Override
    public double caucularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + data +
                '}';
    }
}
