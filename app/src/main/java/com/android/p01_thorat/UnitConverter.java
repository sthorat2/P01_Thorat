package com.android.p01_thorat;

public class UnitConverter {



        public static double centimeter_to_millimeter(double mm){

            return (mm*10);
        }

        public static double millimeter_to_centimeter(double cm){

            return (cm/10);
        }

        public static double centimeter_to_meter(double m){

            return (m/100);
        }

        public static double centimeter_to_kilometer(double km){

            return (km/1000);
        }

        public static double meter_to_centimeter(double m){

            return (m*100);
        }

        public static double kilometer_to_centimeter(double km){

            return (km*1000);
        }
}

