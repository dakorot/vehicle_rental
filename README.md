# Vehicle Rental Application

A very simple application for vehicle rental. 

## Data Loading 
Data can be loaded via a `.txt` file with a semicolon as a delimeter, which is executed automatically when an `IVehicleRepository` instance is created.

## Data processing
When a `.txt` file is being read, first letter of each line is analysed in order to classify whether an incoming vehicle is a car or a motorcycle. Then a `builder` is called for each type of vehicle. Builder approach was chosen in order to try out best Java practices specifically having a case in which each vehicle has many fields to fill. 

## Getting a list of all vehicles
A list of all vehicles performs deep copying which is solved via copying constructors in `Car` and `Vehicle` classes respectively.

## Output possibilities 
Data about all the vehicles can be exported into a `.csv` file which is supported by customised `toString()` methods in both `Car` and `Motorcycle` classes.