package ch.iet_gibb.heatcreatorfx.Proporty;

public class Property {

        private String key;
        private String value;

        public Property(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
