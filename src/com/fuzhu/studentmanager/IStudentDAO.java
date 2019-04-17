package com.fuzhu.studentmanager;

import java.util.List;

public interface IStudentDAO {
	/**
	 * 			ѧ����Ϣ��ѯ
	 * @param string			��������
	 * @return					ѧ������
	 * @throws Exception
	 */
		public Student findStudent(String name) throws Exception;
		public Student insertStudent(Student student) throws Exception;
		public Student deleteStudent(String name) throws Exception;
		public Student updateStudent(String proviousName, String nowName) throws Exception;
		@SuppressWarnings("unchecked")
		public List StSelect() throws Exception;
}
