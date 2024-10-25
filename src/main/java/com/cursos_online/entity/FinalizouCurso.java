package com.cursos_online.entity;

import java.util.Objects;
import jakarta.persistence.Embeddable;

@Embeddable
public class FinalizouCurso {

    private boolean finalizoucurso;

    // Construtor padrão necessário para o JPA
    protected FinalizouCurso() {
    }

    // Construtor com valor inicial
    public FinalizouCurso(boolean finalizoucurso) {
        this.finalizoucurso = finalizoucurso;
    }

    public boolean getFinalizoucurso() {
        return finalizoucurso;
    }

    // Sobrescreva equals para garantir comparação por valor
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinalizouCurso that = (FinalizouCurso) o;
        return finalizoucurso == that.finalizoucurso;
    }

    // Sobrescreva hashCode para garantir que objetos iguais tenham o mesmo código hash
    @Override
    public int hashCode() {
        return Objects.hash(finalizoucurso);
    }

    @Override
    public String toString() {
        return Boolean.toString(finalizoucurso);
    }
}

