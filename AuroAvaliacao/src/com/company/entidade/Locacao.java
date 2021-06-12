package com.company.entidade;

import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Locacao {
    private Long                id;
    private Date                inicio;
    private Date                fim;
    private Long                kmRetirada;
    private Long                kmDevolucao;
    private Boolean             paga;
    private Locatario           locatario;
    private Veiculo             veiculo;


    public Locacao() {}


    public Long     getId()          {return id; }
    public Date     getInicio()      {return inicio; }
    public Date     getFim()         {return fim;    }
    public Long     getKmRetirada()  {return kmRetirada; }
    public Long     getKmDevolucao() {return kmDevolucao; }

    public Boolean  isPaga()        {return paga; }
    public Locatario getLocatario()  {return locatario; }
    public Veiculo   getVeiculo()    {return veiculo;    }

    public void setId(Long _id)                     {this.id = _id;    }
    public void setInicio(Date _inicio)             {this.inicio = _inicio;  }
    public void setFim(Date _fim)                   {this.fim = _fim;  }
    public void setKmRetirada(Long _kmRetirada)     {this.kmRetirada = _kmRetirada;    }
    public void setKmDevolucao(Long _kmDevolucao)   {this.kmDevolucao = _kmDevolucao;    }

    public void setPaga(Boolean _paga)              {this.paga = _paga;    }
    public void setLocatario(Locatario locatario)   {this.locatario = locatario; }
    public void setVeiculo(Veiculo veiculo)         {this.veiculo = veiculo;   }

    public Long duracaoEmDias() {

        Long duracaoEmMilisegundos = this.getFim().getTime() - this.getInicio().getTime();
        Long duracaoEmdias = TimeUnit.DAYS.convert(duracaoEmMilisegundos, TimeUnit.MILLISECONDS);

        if (duracaoEmdias == 0L) {
            duracaoEmdias = 1L;
        }

        return duracaoEmdias;

    }

    public Long kmRodados() {
        return this.getKmDevolucao() - this.getKmRetirada();
    }

    public Double valor() {
        Double valorDiarias = this.duracaoEmDias() * this.getVeiculo().getValorDiaria();
        Double valorKmAdicionais = 0.0;
        Long kmAdicionais = (this.kmRodados()) - (this.duracaoEmDias() * 200);

        if (kmAdicionais > 0) {
            valorKmAdicionais = kmAdicionais * this.getVeiculo().getValorKmAdicional();
        }

        // 3. Somar o cálculo de cada locação em um valor total.
        return  valorDiarias + valorKmAdicionais;
    }


    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", kmRetirada=" + kmRetirada +
                ", kmDevolucao=" + kmDevolucao +
                ", paga=" + paga +
                ", locatario=" + locatario +
                ", veiculo=" + veiculo +
                '}';
    }
}
