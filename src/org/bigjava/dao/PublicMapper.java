package org.bigjava.dao;

import org.bigjava.entitys.Student;
import org.bigjava.entitys.Teacher;
import org.bigjava.entitys.User;

public interface PublicMapper {
	public void add(Student student)throws Exception;
	
    public void insertUser(User user) throws Exception;                        //����û�
	
	public void updateUser(User user) throws Exception;                       //�û��޸�

	public User findUserById(User user) throws  Exception;                    //����ID��ѯ�û�

	public Teacher findTeacherById(Teacher teacher);                          //����ID��ѯ��ʦ

	public Student findStudentById(Student student);                          //����ID��ѯѧ��
}
