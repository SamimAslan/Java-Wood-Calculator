//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ch.iet_gibb.heatcreatorfx.model;

import ch.iet_gibb.heatcreatorfx.Proporty.Property;

import java.util.ArrayList;
import java.util.List;

public class PelletCalculator extends ch.iet_gibb.heatcreatorfx.model.Heater {
    public PelletCalculator(String name, double kWh) {
        super(name, kWh);
    }

    public double getVolume3ByKg() {
        this.getKgPerKWh();
        this.volumeM3 = this.kg / 650.0;
        return this.volumeM3;
    }

    public double getKgPerKWh() {
        this.kg = this.kWh / 4.8;
        return this.kg;
    }

    public double getVolume3() {
        return this.volumeM3;
    }

    public void setVolume3(double volume3) {
        this.volumeM3 = volume3;
    }

    public String toString() {
        String var10000 = this.getName();
        return "Your pellet calculation results from the " + var10000 + " heater: \nKG: \t\t" + this.getKgPerKWh() + "\nM^3: \t\t" + this.getVolume3ByKg() + "\n";
    }

    @Override
    public String getTitle() {
        return getName();
    }

    @Override
    public List<Property> getProporties() {
        return super.getProporties();


    }
}
