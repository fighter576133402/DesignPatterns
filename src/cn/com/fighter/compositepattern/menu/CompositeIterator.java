package cn.com.fighter.compositepattern.menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	/**
	 * 将我们要遍历的顶层组合的迭代器传入。
	 * 我们把它抛进一个堆栈数据结构中
	 * @param iterator
	 */
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
		System.out.println("stacl size:  "+stack.size());
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		//想要知道是否还有下一个元素，我们检查堆栈是否被清空，如果已经空了，就表示没有下一个元素了
		if(stack.empty()){
			return false;
		}else {
			//否则我们就从堆栈的顶层中取出迭代器
			Iterator iterator = (Iterator)stack.peek();
			//看看是否还有下一个元素。如果它没有元素，我们将它弹出堆栈，然后递归的调用hashNext();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else {
				//否则表示还有下一个元素，我们返回true
				return true;
			}
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		//好了，当客户想要取得下一个元素的时候，我们先调用hasNext()来确定是否还有下一个
		if(hasNext()){
			//如果还有下一个元素，我们就从堆栈中取出目前的迭代器
			Iterator iterator = (Iterator)stack.peek();
			
			//然后取得下一个元素
			MenuComponent component = (MenuComponent)iterator.next();
			//如果元素是一个菜单，我们有了另一个需要被包含进遍历中的组合，所以我们将它丢进堆栈中
			//不管是不是菜单我们都返回该组件
			if(component instanceof Menu){
				System.out.println("menu count" + component.getName());
				stack.push(component.createIterator());
			}
			return component;
		}else {
			return null;
		}
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
