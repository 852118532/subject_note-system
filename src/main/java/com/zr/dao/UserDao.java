package com.zr.dao;

public interface UserDao {
	/**
	 * ������ݿ����Ƿ��и��û���
	 * @param uname
	 * @return �����ڸ��û��� �򷵻�1 ���򷵻�-1
	 */
	public int selectUnameByUName(String uname);
	
	/**
	 * ��½ʱ�����û��Ƿ����
	 * @param uname password
	 * @return �����ڸ��û� �򷵻�1 ���򷵻�-1
	 */
	public int selectUser(String uname,String password);
	
	/**
	 * ע���û�
	 * @param uname password
	 * @return ��ע��ɹ� �򷵻�1 ���򷵻�-1
	 */
	public int insertUser(String uname, String password);
}
