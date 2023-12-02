//To initialize a char variable we do
char myChar = 'D';
//Note: For character we use single quotes and not double
//"Hello World" is a String and 'D' is a character
//Remember String is a collection of characters
/*
+------------------------------------+-----------------------------------+
| char                               | String                            |
+------------------------------------+-----------------------------------+
| Holds one, and only one, character | Can hold multiple characters      |
+------------------------------------+-----------------------------------+
| Literal enclosed in Single Quotes  | Literal enclosed in Double Quotes |
+------------------------------------+-----------------------------------+
*/
//If we add more than One Character in the char datatype it would give an error
//It is easier to initialize the character 'D' than finding the unicode of the number and initializing it
//What is Unicode?
//Unicode is an universal code which is given to characters
//By using unicodes you can also initialize special characters
//Just search on the internet "Unicode (of what you want)"
//Example the unicode of D is U+0044 so to initialize it this way do
char uniChar = '\u0044'; //This initializes 'D'
//You can also initialize using the ASCII value
char asciiChar = 68; //This also initializes to 'D'
//A boolean value allows for two opposite choices, true or false, yes or no, one or zero.
//In Java terms, we've got a boolean primitive type, and it can be set to two values only, either true or false.
//Example:
boolean hasVoted = false;
boolean isLegal = true;
