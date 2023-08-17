import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AlugavelTest {


    @org.junit.jupiter.api.Test
    void adicionaAluguel() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals(true,a1.adicionaAluguel(a2));
    }

    @org.junit.jupiter.api.Test
    void getPrecoDiario() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        assertEquals(500,a1.getCodigo());
    }

    @org.junit.jupiter.api.Test
    void getTamanhoRoupa() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        assertEquals(40,a1.getTamanhoRoupa());
    }

    @org.junit.jupiter.api.Test
    void getCodigo() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        assertEquals(500,a1.getCodigo());
    }

    @org.junit.jupiter.api.Test
    void getNome() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        assertEquals("Camiseta Nike",a1.getNome());
    }

    @org.junit.jupiter.api.Test
    void getCorRoupa() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        assertEquals("Verde",a1.getCorRoupa());
    }

    @org.junit.jupiter.api.Test
    void getAluguel() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        a1.adicionaAluguel(a2);
        assertEquals(a2,a1.getAluguel().get(0));
    }

    @org.junit.jupiter.api.Test
    void setCodigo() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        a1.setCodigo(327);
        assertEquals(327,a1.getCodigo());
    }

    @org.junit.jupiter.api.Test
    void setNome() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        a1.setNome("Camiseta Adidas");
        assertEquals("Camiseta Adidas",a1.getNome());
    }

    @org.junit.jupiter.api.Test
    void setPrecoDiario() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        a1.setPrecoDiario(40);
        assertEquals(40,a1.getPrecoDiario());
    }

    @org.junit.jupiter.api.Test
    void setTamanhoRoupa() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        a1.setTamanhoRoupa(50);
        assertEquals(50,a1.getTamanhoRoupa());
    }

    @org.junit.jupiter.api.Test
    void setCorRoupa() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        a1.setCorRoupa("Azul");
        assertEquals("Azul",a1.getCorRoupa());
    }

    @org.junit.jupiter.api.Test
    void setAluguel() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        ArrayList<Aluguel> a3 = new ArrayList<Aluguel>();
        a3.add(a2);
        a1.setAluguel(a3);
        assertEquals(a2,a3.get(0));
    }
}