package cn.com.fighter.compositepattern.menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	/**
	 * ������Ҫ�����Ķ�����ϵĵ��������롣
	 * ���ǰ����׽�һ����ջ���ݽṹ��
	 * @param iterator
	 */
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
		System.out.println("stacl size:  "+stack.size());
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		//��Ҫ֪���Ƿ�����һ��Ԫ�أ����Ǽ���ջ�Ƿ���գ�����Ѿ����ˣ��ͱ�ʾû����һ��Ԫ����
		if(stack.empty()){
			return false;
		}else {
			//�������ǾʹӶ�ջ�Ķ�����ȡ��������
			Iterator iterator = (Iterator)stack.peek();
			//�����Ƿ�����һ��Ԫ�ء������û��Ԫ�أ����ǽ���������ջ��Ȼ��ݹ�ĵ���hashNext();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else {
				//�����ʾ������һ��Ԫ�أ����Ƿ���true
				return true;
			}
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		//���ˣ����ͻ���Ҫȡ����һ��Ԫ�ص�ʱ�������ȵ���hasNext()��ȷ���Ƿ�����һ��
		if(hasNext()){
			//���������һ��Ԫ�أ����ǾʹӶ�ջ��ȡ��Ŀǰ�ĵ�����
			Iterator iterator = (Iterator)stack.peek();
			
			//Ȼ��ȡ����һ��Ԫ��
			MenuComponent component = (MenuComponent)iterator.next();
			//���Ԫ����һ���˵�������������һ����Ҫ�������������е���ϣ��������ǽ���������ջ��
			//�����ǲ��ǲ˵����Ƕ����ظ����
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
