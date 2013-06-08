package cn.com.fighter.iteratorpattern.iterator;
import java.util.Iterator;

import cn.com.fighter.iteratorpattern.menu.MenuItem;
public class DinerMenuIterator implements Iterator {
	MenuItem [] items;
	int position = 0;
	
	public DinerMenuIterator (MenuItem [] items){
		this.items = items;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=items.length || items[position]==null){
			return false;
		}else {
			return true;
		}
	}

	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = items[position];
		position = position +1;
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if(position<=0){
			throw new IllegalStateException("you can not remove an item until you have done at last one next()");
		}
		if(items[position - 1] !=null){
			for(int i = position -1 ;i < (items.length - 1);i++){
				items[i] = items [i+1];
			}
			items[items.length - 1] = null;
		}
	}

}
