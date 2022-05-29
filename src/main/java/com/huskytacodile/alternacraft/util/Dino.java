package com.huskytacodile.alternacraft.util;

public enum Dino {
    ACRO("acrocanthosaurus"),
    ALBERTO("albertosaurus"),
    ATROCIRAPTOR("atrociraptor"),
    BARYG1("baryg1"),
    BARYG2("baryg2"),
    CARCHARODONTOSAURUS("carcharodontosaurus"),
    CARNORAPTOR("carnoraptor"),
    CARNOTAURUS("carnotaurus"),
    CERATO("cerato"),
    COELOPHYSIS("coelophysis"),
    DILOPHOSAURUS("dilophosaurus"),
    GIGANTOSAURUS("giganotosaurus"),
    GIRAFFTITAN("girafftitan"),
    HERRERASAURUS("herrerasaurus"),
    IBEROSPINUS("iberospinus"),
    ICHTYOVENATOR("ichtyovenator"),
    INDOMINUS_REX("indominus_rex"),
    INDORAPTOR("indoraptor"),
    MOROS_INTREPIDUS("moros_intrepidus"),
    MOSASAURUS("mosasaurus"),
    OVIRAPTOR("oviraptor"),
    PYRORAPTOR("pyroraptor"),
    QIANZHOUSAURUS("qianzhousaurus"),
    SARCHOSUCHUS("sarchosuchus"),
    SCORPIOS_REX("scorpios_rex"),
    SIAMOSAURUS("siamosaurus"),
    SIAMOSAURUSG2("siamosaurusg2"),
    SKORPIOVENATOR("skorpiovenator"),
    SPINOJP3("spinosaurus_jp3"),
    SPINOG2("spinosaurusg2"),
    SUCHOMIMUS("suchomimus"),
    SUSSYAMOGUSAURUS("sussyamogusaurus"),
    TARBOSAURUS("tarbosaurus"),
    TYRANOSAURUS("tyranosaurus"),
    VELOCIRAPTOR("velociraptor")
    ;

    private final String name;

    Dino(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
