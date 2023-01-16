/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ingresso.facil.entity;

/**
 *
 * @author wesly
 */
public enum Categoria {
    PISTA(1,"Pista"),
    VIP(2,"VIP"),
    CAMAROTE(3,"Camarote");
    private int cod;
    private String descricao;

    private Categoria(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public static Categoria toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for(Categoria x : Categoria.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
    
}
