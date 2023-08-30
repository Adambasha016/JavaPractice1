package org.abijeeth.jdbc;

public class Circle implements Comparable<Circle>{
int radius;
public Circle(int r) {
this.radius=r;
}
@Override
public int compareTo(Circle arg0) {
	return radius-((Circle)arg0).radius;
}
}
