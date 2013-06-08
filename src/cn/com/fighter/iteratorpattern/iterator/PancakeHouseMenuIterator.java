package cn.com.fighter.iteratorpattern.iterator;

import java.util.ArrayList;

import cn.com.fighter.iteratorpattern.menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> arrayList ;
	int position = 0;
	
	public PancakeHouseMenuIterator (ArrayList<MenuItem> arrayList ){
		this.arrayList = arrayList;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=arrayList.size() || arrayList.get(position)==null){
			return false;
		}else {
			return true;
		}
	}

	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = arrayList.get(position);
		position = position +1;
		return menuItem;
	}

}
