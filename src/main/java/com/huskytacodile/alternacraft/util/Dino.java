package com.huskytacodile.alternacraft.util;

import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.Random;

public enum Dino {
    EMPTY("empty", DNATier.COMMON),
    ACRO("acrocanthosaurus", DNATier.COMMON),
    ALBERTO("albertosaurus", DNATier.COMMON),
    ATROCIRAPTOR("atrociraptor", DNATier.COMMON),
    BARYG1("baryg1", DNATier.COMMON),
    BARYG2("baryg2", DNATier.COMMON),
    CARCHARODONTOSAURUS("carcharodontosaurus", DNATier.COMMON),
    CARNORAPTOR("carnoraptor", DNATier.COMMON),
    CARNOTAURUS("carnotaurus", DNATier.COMMON),
    CERATO("cerato", DNATier.COMMON),
    COELOPHYSIS("coelophysis", DNATier.COMMON),
    DILOPHOSAURUS("dilophosaurus", DNATier.COMMON),
    GIGANTOSAURUS("giganotosaurus", DNATier.COMMON),
    GIRAFFTITAN("girafftitan", DNATier.COMMON),
    HERRERASAURUS("herrerasaurus", DNATier.COMMON),
    IBEROSPINUS("iberospinus", DNATier.COMMON),
    ICHTYOVENATOR("ichtyovenator", DNATier.COMMON),
    INDOMINUS_REX("indominus_rex", true, DNATier.TIER3),
    INDORAPTOR("indoraptor", true, DNATier.TIER3),
    MOROS_INTREPIDUS("moros_intrepidus", DNATier.TIER3),
    MOSASAURUS("mosasaurus", DNATier.TIER2),
    OVIRAPTOR("oviraptor", DNATier.TIER2),
    PYRORAPTOR("pyroraptor", DNATier.TIER3),
    QIANZHOUSAURUS("qianzhousaurus", DNATier.COMMON),
    SARCHOSUCHUS("sarchosuchus", DNATier.COMMON),
    SCORPIOS_REX("scorpios_rex", true, DNATier.COMMON),
    SIAMOSAURUS("siamosaurus", DNATier.COMMON),
    SIAMOSAURUSG2("siamosaurusg2", DNATier.COMMON),
    SKORPIOVENATOR("skorpiovenator", DNATier.COMMON),
    SPINOJP3("spinosaurus_jp3", DNATier.COMMON),
    SPINOG2("spinosaurusg2", DNATier.COMMON),
    SUCHOMIMUS("suchomimus", DNATier.COMMON),
    SUSSYAMOGUSAURUS("sussyamogusaurus", DNATier.COMMON),
    TARBOSAURUS("tarbosaurus", DNATier.COMMON),
    TYRANOSAURUS("tyranosaurus", DNATier.COMMON),
    VELOCIRAPTOR("velociraptor", DNATier.COMMON)
    ;

    private final String name;
    private Item syringeItem;
    private final boolean isHybrid;
    private final DNATier tier;

    Dino(String name, DNATier tier) {
        this.name = name;
        this.isHybrid = false;
        this.tier = tier;
    }

    Dino(String name, boolean hybrid, DNATier tier) {
        this.name = name;
        this.isHybrid = hybrid;
        this.tier = tier;
    }

    public DNATier getTier() {
        return tier;
    }

    public String getName() {
        return name;
    }

    public void setSyringeItem(Item item) {
        this.syringeItem = item;
    }

    public Item getSyringeItem() {
        return this.syringeItem;
    }

    public static Dino getDinoByItem(Item item) {
        for (Dino dino : values()) {
            if(dino.getSyringeItem() == item) {
                return dino;
            }
        }

        return Dino.EMPTY;
    }

    public static Item getRandomSyringeByTier(DNATier tier) {
        Random random = new Random();
        var validValues = Arrays.stream(values()).filter(d -> d.getTier() == tier).toList();

        return validValues.get(random.nextInt(validValues.size())).syringeItem;
    }
}
