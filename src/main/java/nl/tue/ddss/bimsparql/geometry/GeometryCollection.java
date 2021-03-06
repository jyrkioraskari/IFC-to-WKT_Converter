/*******************************************************************************
 * Copyright (C) 2017 Chi Zhang
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package nl.tue.ddss.bimsparql.geometry;

import java.util.ArrayList;
import java.util.List;

import nl.tue.ddss.bimsparql.geometry.visitor.GeometryVisitor;

public class GeometryCollection implements Geometry{
	
	List<Geometry> geometries=new ArrayList<Geometry>();
    String id;
    
	public void addGeometry(Geometry gg) {
		// TODO Auto-generated method stub
		geometries.add(gg);
	}
	
	public int numGeometries(){
		return geometries.size();
	}

	public Geometry geometryN(int i) {
		// TODO Auto-generated method stub
		return geometries.get(i);
	}

	@Override
	public boolean isMeasured() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public Geometry boundary() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GeometryType geometryTypeId() {
		// TODO Auto-generated method stub
		return GeometryType.TYPE_GEOMETRYCOLLECTION;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is3D() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String geometryType() {
		// TODO Auto-generated method stub
		return "GeometryCollection";
	}


	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	
	

}
