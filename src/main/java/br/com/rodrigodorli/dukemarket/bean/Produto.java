/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigodorli.dukemarket.bean;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qualifica
 */
public class Produto {
private int id;
private String codBarras;
private String descricao;
private double qtd;
private double valorCompra;
private double valorVenda;
private Calendar dataCadrastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Calendar getDataCadrastro() {
        return dataCadrastro;
    }

    public void setDataCadrastro(Calendar dataCadrastro) {
        this.dataCadrastro = dataCadrastro;
    }
public void setDataCadastro(String strDataCadastro){
    try{
        this.dataCadrastro = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.dataCadrastro.setTime(sdf.parse(strDataCadastro));
    }catch (ParseException ex){
        Logger.getLogger(Produto.class.getName()).log(Level.SEVERE,null,ex);
        
    }
}
public String getDataCadastro(){
    if(this.dataCadrastro !=null){
        SimpleDateFormat sdf =new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
        return sdf.format(this.dataCadrastro.getTime());
        
    }else{
        return "";
    }
}
public String toString(){
    return String.format("%3d |  %15s | %-30s | %10.2f | %10.2f | %10.2f | %10s",this.id,this.codBarras,this.descricao,this.qtd,this.valorCompra,this.valorVenda,this.getDataCadrastro());
}
}
