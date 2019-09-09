# cs541-Unit_Convertor-android-app



Shrutika Thorat 
B00763589
sthorat2@binghamton.edu


This Unit_Converter app is developed in Android Studio and the results are tested using NEXUS 5X API 25 emulator

Started with an Android Hello World Project

Started changes to convert the basic project to an Unit Convertor App

In folder hierarchy "app" -> "res" -> "layout" -> "activity_main.xml",edit "activity_main.xml" file to edit the screen layout of the app. Added EditText "Enter Number" to enter a number for conversion.
Added 6 RadioButtons named "From cm to mm", "From cm to m", "From cm to km", "From mm to cm", "From m to cm", "From km to cm" inside a RadioGroup, the radio buttons are self explanatory.
Added a submit button called "Convert" to submit the number to convert to selected units.
The app has background color,texting font styles and many customizations.

Convert button calls the convert() {METHOD} from MainActivity.java file 
The method checks which radio button in the group is active and calls corresponding conversion method from the class UnitConverter.java


