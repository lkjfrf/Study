package chapter8.makeHuman;

public class Woman {

	public Woman() {			//�ȸ��� �����Ϸ��� ������ �������
		// TODO Auto-generated constructor stub
	}
	
	public Woman(int privatee, int privateee) {
		// TODO Auto-generated constructor stub
	}
	
	public boolean hello() {
		
		boolean result = 1 == 2;
		return result;
		
	}
	
	
	int publicc;				//�����ϸ� public ���� �������
	public int publiccc;
	private int privatee;			//�ν��Ͻ� ����
	private int privateee;
	
	
	public int getPublicc() {
		return publicc;
	}

	public void setPublicc(int publicc) {
		this.publicc = publicc;
	}

	public int getPrivatee() {
		
		privatee = 22;
		return privatee;
	}

	public void setPrivatee(int privatee) {
		this.privatee = privatee;
	}

	
	
	
}
