package com.ci_cd_ogreniyorum.demo_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HesapMakinesiTest {

    @Test
    void toplamaIslemiDogruCalismali() {
        HesapMakinesi makine = new HesapMakinesi();
        int sonuc = makine.topla(5, 5);
        
        // BEKLENTİ: 5 + 5 = 10 olmalı.
        // AMA BİZ: 11 bekliyoruz diyelim (HATA BURADA!)
        assertEquals(11, sonuc, "5 + 5 işlemi 10 yapmalıydı ama test 11 bekliyor!");
    }
}
