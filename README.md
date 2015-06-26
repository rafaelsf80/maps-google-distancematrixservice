# tsv2Distancematrix #
Java standalone program that reads a TSV file, then calls matrix distance web service (Google Maps API) and returns a new TSV file with distances. Input and output file formats are adapted to requirements of my PhD. See info of matrix distance web service [here](https://developers.google.com/maps/documentation/distancematrix).

## Usage

Execution without parameters. Must set input and output filenames inside the code

 Expected TSV input format (note X, Y coordinates on columns 1, 2)
 CO	-43.2048672	-22.9102197	0
  
 CO1	-43.2048672	-22.9102197	0
 
 FAT1	-43.2050014	-22.9102593	0
 
 ClienteE	-43.2047814	-22.9103542	0
 
 FAT2	-43.2048672	-22.9102197	0
 
 ClienteF	-43.2030014	-22.9102513	0
 
 ClienteP	-43.2027814	-22.9103532	0
 
 ClienteE	-43.2018672	-22.9102197	0
 
 ClienteP	-43.2000014	-22.9102593	0
 
 TSV output  format (Distances in meters)
 	FAT1	FAT2	
 ClienteE	1851	2365	
 ClienteP	1878	2391	
 ClienteE	1769	2283	
 ClienteE	1798	2311	
 ClienteP	1743	2256

 
## Known limitations
URL length of 2048 characters

## Libraries
Compiled with univocity-parsers-1.3.0.jar and unirest-java-1.3.37

## License
GNU GPL v3