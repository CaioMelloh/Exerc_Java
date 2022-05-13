/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melhoriaListaDemissao;

import java.util.List;

/**
 *
 * @author caioh
 */
/*claase responsavel por demitir um funcionario*/
public class Boss {
    /*metodo de demissao*/
    
    public List<Empregado> youAreFired(List<Empregado> list, int pos) {
        /* metodo do tipo list empregado recebe a mesma caracteristica e uma posicao*/
       list.remove(pos);
       return list;
    }
}
