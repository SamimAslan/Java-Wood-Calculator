//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ch.iet_gibb.heatcreatorfx.model;

import ch.iet_gibb.heatcreatorfx.Proporty.Property;

import java.util.ArrayList;
import java.util.List;

public class WoodCalculator extends ch.iet_gibb.heatcreatorfx.model.Heater {
    private String woodType;
    private double ster;

    public WoodCalculator(String name, String woodType, double kWh) {
        super(name, kWh);
        this.woodType = woodType;
    }

    public double getVolumePerWoodType() {
        this.getKgPerKWh();
        if (this.woodType.equals("beech")) {
            this.volumeM3 = this.kg / 500.0;
        } else if (this.woodType.equals("fir")) {
            this.volumeM3 = this.kg / 400.0;
        } else if (this.woodType.equals("mixed")) {
            this.volumeM3 = this.kg / 425.0;
        }

        return this.volumeM3;
    }

    public double getKgPerKWh() {
        this.kg = this.kWh / 4.0;
        return this.kg;
    }

    public double getSterVolume() {
        this.getVolumePerWoodType();
        return this.volumeM3 * 0.75;
    }

    public String getWoodType() {
        return this.woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public double getSter() {
        return this.ster;
    }

    public void setSter(double ster) {
        this.ster = ster;
    }

    public String toString() {
        String var10000 = this.getName();
        return "Your wood calculation results from the " + var10000 + " heater: \nWOOD TYPE: \t" + this.woodType.toUpperCase() + "\nKG: \t\t" + this.getKgPerKWh() + "\nSTER: \t\t" + this.getSterVolume() + "\nM^3: \t\t" + this.getVolumePerWoodType() + "\n";
    }

    @Override
    public String getTitle() {
        return getName();
    }

    @Override
    public List<Property> getProporties() {
        List<Property>properties = super.getProporties();
        Property woodType = new Property("Wood Type:",getWoodType());
        properties.add(woodType);
        return properties;


    }
}
