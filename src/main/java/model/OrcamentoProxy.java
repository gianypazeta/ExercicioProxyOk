
package model;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{
    
    private BigDecimal descontoOrcamento;

    private Orcamento orcamento;
    
    
    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public BigDecimal getDescontoOrcamento() {
        if (descontoOrcamento == null){
            this.descontoOrcamento = orcamento.getDescontoOrcamento();
        }
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    } 
}
