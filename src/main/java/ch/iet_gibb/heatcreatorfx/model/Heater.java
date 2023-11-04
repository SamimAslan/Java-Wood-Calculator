//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ch.iet_gibb.heatcreatorfx.model;

import ch.iet_gibb.heatcreatorfx.Proporty.Property;

import java.util.ArrayList;
import java.util.List;

public abstract class Heater implements InterfaceHeater {
    protected String name;
    private static int nextId = 1;
    protected double kWh;
    protected double kg;
    protected double volumeM3;

    public Heater(String name, double kWh) {
        this.name = name;
        this.checkKWh(kWh);
    }

    protected void checkKWh(double kWh) {
        if (!(kWh < 200000.0) && !(kWh > 0.0)) {
            throw new IllegalArgumentException("kWh exceeds maximum limit!");
        } else {
            this.kWh = kWh;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getkWh() {
        return this.kWh;
    }

    public void setkWh(double kWh) {
        this.kWh = kWh;
    }

    public double getKg() {
        return this.kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getVolumeM3() {
        return this.volumeM3;
    }

    public void setVolumeM3(double volumeM3) {
        this.volumeM3 = volumeM3;
    }

    @Override
    public List<Property> getProporties() {
        List<Property>properties = new ArrayList<>();
        Property id = new Property("HeaterId:",getName());
        properties.add(id);
        Property kwh = new Property("Heater kWh:",String.valueOf(getkWh()));
        properties.add(kwh);
        return properties;


    }
}
