package org.example;

public class Competicao {

    Musico musico;
    private Musico[] competidores = new Musico[3];

    public void addMusico(Musico musico) {
        for (int i = 0; i < competidores.length; i++) {
            if (competidores[i] == null) {
                competidores[i] = musico;
                break;
            }
        }
    }

    public void listarCompetidores() {
        for (int i = 0; i < competidores.length; i++) {
            if (competidores[i] != null) {
                if (competidores[i] instanceof Cellista) {
                    Cellista auxCellista = (Cellista) competidores[i];
                    auxCellista.mostrarInfo();
                    auxCellista.tocar();
                    auxCellista.desafinar();
                } else if (competidores[i] instanceof Violinista) {
                    Violinista auxViolinista = (Violinista) competidores[i];
                    auxViolinista.mostrarInfo();
                    auxViolinista.tocar();
                    auxViolinista.desafinar();
                } else {
                    Pianista auxPianista = (Pianista) competidores[i];
                    auxPianista.mostrarInfo();
                    auxPianista.tocar();
                    auxPianista.tocarAcorde();
                    auxPianista.errarPausa();
                }
            }
        }

    }

}
