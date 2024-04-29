package com.kh.PropertiesEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
Properties : 속성, 설정. 필히 넣어야하는 값을 작성
	Map과 비슷한 형태의 데이터를 관리하는데 사용
	
	key(키) 와 value(값)으로 이루어져 있음
	
	키와 값이 숫자가 아니라 문자열인 형태로 가지고 있음
	
메서드
	setProperty(String key, String value) : 지정된 키와 값으로 맵에 항목을 추가
	getProperty(String key) : 주어진 키에 대한 값을 반환
	getProperty(String key, String value) : 주어진 키에 대한 값을 전달하지만, 해당 키가 없을 경우
	 										기본값을 반환
	load(InputStream in) : 입력스트림에서 속성 목록을 읽어옴
	store(OutputStream out, String comment) : 출력스트림에서 속성 목록을 저장
	
properties의 경우에는 프로그램이나 코드를 실행할 때 필수로 설정해줘야하는 내용을 작성한 후
코드가 아니라 파일로 주로 존재

map은 주로 데이터를 다루지만 properties의 경우 인증키나 회원인증번호를 보내기 위해서
인증을 위해 필요한 내용을 작성해놓는 공간

*/
public class PropertiesEx {
	
	public static void main(String[] args) {
		//Properties 객체 생성
		Properties setting = new Properties();
		
		try {
			//File
			File realFile = new File("setting.properties");
			//만약 파일이 존재하지 않는다면 파일 만들어주기
			if(realFile.exists()) {
				System.out.println("파일이 존재합니다.");
			}else {
				System.out.println("설정 파일이 없습니다. 새로운 파일을 생성합니다.");
				realFile.createNewFile();
			}
			
			
			//설정파일 만들기 만약에 만들어진 setting.properties 가 없다면 새로운 파일이 생성될 것
			FileInputStream fileOpen = new FileInputStream("setting.properties");
			setting.load(fileOpen);//fileMkr 대기
			fileOpen.close();//fileMkr 끝
			
			//관리자 이름, 비밀번호 가져올 것
			String managerName = setting.getProperty("manager name");
			String managerPassword = setting.getProperty("manager password");
			
			System.out.println("manager name : " + managerName);
			System.out.println("manager password : " + managerPassword);
			
			//만약 null값으로 아무런 값도 없는 것이 싫다면 설정값을 변경해줄 수 있음
			setting.setProperty("manager name", "manager1");
			setting.setProperty("manager password", "1234");
			
			//변경된 설정을 파일에 저장
			FileOutputStream fileSave = new FileOutputStream("setting.properties");
			
			//새로운내용 저장과 저장할 때 어떤 내용을 수정/삭제/추가 했는지 작성
			setting.store(fileSave, "new name and password save");
			
			//파일 저장 종료
			fileSave.close();
			
			System.out.println("관리자가 성공적으로 변경되었습니다.");
			
			
		}catch(FileNotFoundException e) { 
			System.out.println("파일이 존재하지 않습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
