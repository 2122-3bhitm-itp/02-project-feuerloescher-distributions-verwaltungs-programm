package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class GeraetTest {

    Raum raum252 = new Raum("252", 2);
    List<Geraet> geraet = new ArrayList<>();
    Kategorie bildschirm = new Kategorie("Bildschirme");
    Firma iiyama = new Firma("iiyama");

    @Test
    void createGeraet() {
        Geraet klassenBildschirm = new Geraet(1234, raum252, geraet, bildschirm, iiyama, false, true);

        assertThat(klassenBildschirm.getGeraeteNr()).isEqualTo(1234);
        assertThat(klassenBildschirm.getRaum()).isEqualTo(raum252);
        assertThat(klassenBildschirm.getGeraet()).isEqualTo(geraet);
        assertThat(klassenBildschirm.getKategorie()).isEqualTo(bildschirm);
        assertThat(klassenBildschirm.getFirma()).isEqualTo(iiyama);
        assertThat(klassenBildschirm.isKabellos()).isEqualTo(false);
        assertThat(klassenBildschirm.isAustauschbar()).isEqualTo(true);
    }

}