package com.company.entidade;

import java.util.Collection;

public class Veiculo {

    private Long id;
    private String marca;
    private String modelo;
    private Double valorDiaria;
    private Double valorKmAdicional;
    private Long   kmAtual;
    private Collection<Locacao> locacoes;

    public Long      getId()                 {  return id;              }
    public String    getMarca()              {  return marca;           }
    public String    getModelo()             {  return modelo;          }
    public Double    getValorDiaria()        {  return valorDiaria;     }
    public Double    getValorKmAdicional()   {  return valorKmAdicional;}
    public Long      getKmAtual()            {  return kmAtual;}
    public Collection<Locacao> getLocacoes() {
         return locacoes;
    }

    public void setId(Long id)                               {   this.id = id;    }
    public void setMarca(String marca)                       {   this.marca = marca;   }
    public void setModelo(String modelo)                     {   this.modelo = modelo;   }
    public void setValorDiaria(Double valorDiaria)           {   this.valorDiaria = valorDiaria;    }
    public void setValorKmAdicional(Double valorKmAdicional) {   this.valorKmAdicional = valorKmAdicional;   }
    public void setKmAtual(Long  kmAtual) { this.kmAtual = kmAtual;}


    public void setLocacoes(Collection<Locacao> locacoes)    {
        this.locacoes = locacoes;
    }

    public Boolean estaLocado() {

        Boolean estaLocado = false;

        for (Locacao l : this.getLocacoes()) {

            if (l.getFim() == null) {
                estaLocado = true;
                break;
            }
        }
        return estaLocado;
    }
}
