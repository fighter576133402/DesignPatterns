package cn.com.fighter.weatherstation.controler;
/**
 * ����
 * @author Fighter
 *
 */
public interface Subject {
	//��������������Ҫһ���۲�����Ϊ�������ù۲���������ע���ɾ���ġ�
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	//������״̬�ı�ʱ����������ᱻ���ã���֪ͨ���й۲��ߡ�
	public void motifyObserver();
}
