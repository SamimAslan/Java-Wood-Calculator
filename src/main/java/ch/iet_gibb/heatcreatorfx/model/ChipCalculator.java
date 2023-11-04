//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ch.iet_gibb.heatcreatorfx.model;


import ch.iet_gibb.heatcreatorfx.Proporty.Property;

import java.util.ArrayList;
import java.util.List;

public class ChipCalculator extends Heater {
    private String woodType;

    public ChipCalculator(String name, String woodType, double kWh) {
        super(name, kWh);
        this.woodType = woodType;
    }

    public double getVolumePerWoodType() {
        this.getKgPerKWh();
        if (this.woodType.equals("beech")) {
            this.volumeM3 = this.kg / 280.0;
        } else if (this.woodType.equals("fir")) {
            this.volumeM3 = this.kg / 230.0;
        } else if (this.woodType.equals("mixed")) {
            this.volumeM3 = this.kg / 250.0;
        }

        return this.volumeM3;
    }

    public double getKgPerKWh() {
        this.kg = this.kWh / 3.5;
        return this.kg;
    }

    public String getWoodType() {
        return this.woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public String toString() {
        String var10000 = this.getName();
        return "Your chip calculation results from the " + var10000 + " heater: \nWOOD TYPE: \t" + this.woodType.toUpperCase() + "\nKG: \t\t" + this.getKgPerKWh() + "\nM^3: \t\t" + this.getVolumePerWoodType() + "\n";
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
