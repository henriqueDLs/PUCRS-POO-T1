import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AluguelTest {

    @Test
    void calculaValorFinal() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals(158.4,a2.calculaValorFinal());
    }

    @Test
    void setData() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        a2.setData("22/07/2021");
        assertEquals("22/07/2021",a2.getData());
    }

    @Test
    void setPeriodo() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        a2.setPeriodo(10);
        assertEquals(10,a2.getPeriodo());
    }

    @Test
    void setCpf() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        a2.setCpf("049.250.102-02");
        assertEquals("049.250.102-02",a2.getCpf());
    }

    @Test
    void setNome() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        a2.setNome("Maria");
        assertEquals("Maria",a2.getNome());
    }

    @Test
    void setValorFinal() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        a2.setValorFinal(500);
        assertEquals(500,a2.getValorFinal());
    }

    @Test
    void setAlugavel() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        Alugavel a3 = new Alugavel(200,"Camiseta Adidas",25,43,"Azul");
        a2.setAlugavel(a3);
        assertEquals(a3,a2.getAlugavel());
    }

    @Test
    void getData() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals("22/06/2021",a2.getData());
    }

    @Test
    void getPeriodo() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals(8,a2.getPeriodo());
    }

    @Test
    void getCpf() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals("523.867.240-85",a2.getCpf());
    }

    @Test
    void getNome() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals("Matheus",a2.getNome());
    }

    @Test
    void getValorFinal() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals(220,a2.getValorFinal());
    }

    @Test
    void getAlugavel() {
        Alugavel a1 = new Alugavel(500,"Camiseta Nike",22,40,"Verde");
        Aluguel a2 = new Aluguel("22/06/2021",8,"523.867.240-85","Matheus",220,a1);
        assertEquals(a1,a2.getAlugavel());
    }
}