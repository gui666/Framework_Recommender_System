package test.java;



import main.java.block.DataSplit;
import org.junit.jupiter.api.Test;

import java.io.File;

public class DataSplitTest {

    @Test
    public void read() {
        String path = "/home/gregorio/Documentos/Guilherme IC/sessoesJOAcomRecOrdenado.csv";
        File logs = new File(path);
        path = "/home/gregorio/Dropbox/Ufop/Iniciação Cientifica 2/DadosUnificados/dados.csv";
        File dados = new File(path);
        DataSplit b = new DataSplit(2, dados, logs);
        b.run();
    }
}