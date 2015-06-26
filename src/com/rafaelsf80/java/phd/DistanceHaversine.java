package com.rafaelsf80.java.phd;

/**
 * DistanceHaversine
 * <p>
 * This program reads a TSV file, then calculates row distance using Haversine formula and returns a new TSV file with distances
 * In the case, we do not use Google matrix distance web service since it only returns walking, cycling or driving distances
 * The Haversine formula is an important equation in navigation, giving great-circle distances between two points on
 * a sphere from their longitudes and latitudes.
 * </p>
 * Expected TSV input format (note X, Y coordinates on columns 1, 2)
 * CO	-43.2048672	-22.9102197	0
 * CO1	-43.2048672	-22.9102197	0
 * FAT1	-43.2050014	-22.9102593	0
 * ClienteE	-43.2047814	-22.9103542	0
 * FAT2	-43.2048672	-22.9102197	0
 * ClienteF	-43.2030014	-22.9102513	0
 * ClienteP	-43.2027814	-22.9103532	0
 * ClienteE	-43.2018672	-22.9102197	0
 * ClienteP	-43.2000014	-22.9102593	0
 *
 * @return TSV output file
 * @author rafaelsanchez
 *
 */
public class DistanceHaversine {

	public static void main(String[] args) {


	}

}
