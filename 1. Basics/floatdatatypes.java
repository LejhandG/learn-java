/*
+-----------+------------------+-----------+------------------------+
| Data Type | Width (in bytes) | Min Value | Max Value              |
+-----------+------------------+-----------+------------------------+
| float     | 4                | 1.4E-45   | 3.4028235E38           |
+-----------+------------------+-----------+------------------------+
| double    | 8                | 4.9E-324  | 1.7976931348623157E308 |
+-----------+------------------+-----------+------------------------+
*/
//NOTE TO INITIALIZE A FLOAT VALUE YOU NEED TO USE F/f after the data or else it will throw an error
float a = 10.0f;
//Otherwise it automatically converts the value to double and throws an error
//So
float a = 10.0; //WRONG
float a = 10.0f; //CORRECT

//You can also type it as
float a = (float) 10.0;
//But using
float a = 10.0f; //This is easier and better
//Javas default datatype for decimal is double and not float because double is more accurate than float
//We use doubles as they are faster, accurate, compatible and larger range of numbers
