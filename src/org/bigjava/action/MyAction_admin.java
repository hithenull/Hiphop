package org.bigjava.action;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.bigjava.action.tool.AllUTL;
import org.bigjava.action.tool.AllUserTool;
import org.bigjava.action.tool.Page;
import org.bigjava.biz.AdminMapperBiz;
import org.bigjava.entitys.Management;

import org.bigjava.entitys.DanceClass;

import org.bigjava.entitys.News;
import org.bigjava.entitys.SchoolInformation;
import org.bigjava.entitys.Teacher;
import org.bigjava.entitys.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MyAction_admin extends ActionSupport implements ModelDriven<News>{
	
	
	private AllUTL	allUTL;
	private AdminMapperBiz adminMapperBiz;	//娉ㄥ叆adminMapperBiz
	private Page page;
	private String account ;
	private String password ;
	private AllUserTool allUserTool;
   
	

	public void setAllUserTool(AllUserTool allUserTool) {
		this.allUserTool = allUserTool;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	private News news = new News();
	private User user = new User();
	private DanceClass dClass = new DanceClass();
	
	
	public void setdClass(DanceClass dClass) {
		this.dClass = dClass;
	}

	private SchoolInformation schoolIf = new SchoolInformation();
	
	public void setSchoolIf(SchoolInformation schoolIf) {
		this.schoolIf = schoolIf;
	}
	public void setAdminMapperBiz(AdminMapperBiz adminMapperBiz) {
		this.adminMapperBiz = adminMapperBiz;
	}
	public void setAllUTL(AllUTL allUTL) {
		this.allUTL = allUTL;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public News getModel() {
		// TODO Auto-generated method stub
		return news;
	}
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}


	/**
	 * 	鍒嗛〉鏌ヨ瀛︾敓
	 * @return
	 */
	 public String findPage() {
//		int pageNo=1;
//		if(page!= null) {
//			System.out.println("page涓嶄负绌�");
//			pageNo=page.getPageno();
//		}else {
//			System.out.println("page涓虹┖");
//		}
//		int pageSize=1;
//		int totalCount = myServlet.findCount();
//		Page page=new Page(pageNo,pageSize,totalCount);
//		List<Student> list=myServlet.findPage(page);
//		if(list!=null){
//			HttpServletRequest request=ServletActionContext.getRequest();
//	        request.setAttribute("list", list);
//	        request.setAttribute("page", page);
//	        return SUCCESS;
//	     }else{
//	        return ERROR;
//	     }
		 return SUCCESS;
	  }
	  
	  /**
	   * 	娣诲姞鏂伴椈
	   * @return
	   * @throws Exception
	   */
	  
	  public String addNew() throws Exception {
		  
		  adminMapperBiz.addNew(news);
		  
		  return SUCCESS;
	  }
	 /**
	  * 	淇敼寰呭鎵圭敤鎴风殑瀹℃壒鐘舵��
	  * @return
	  */
	  public String updateUserAs() {
		  
		  
		  return SUCCESS;
	  }
	  
	  /**
	   * 	鏌ヨ寰呭鎵圭殑鑰佸笀
	   * @return
	   */
	  public String findUserWait() {
		  int pageNo=1;
			if(page!= null) {
				System.out.println("page涓嶄负绌�");
				pageNo=page.getPageno();
			}else {
				System.out.println("page涓虹┖");
			}
			int pageSize=1;
			int totalCount = adminMapperBiz.findWaitCount();
			Page page=new Page(pageNo,pageSize,totalCount);
			List<User> list= adminMapperBiz.findUserWait(page);
			if(list!=null){
				HttpServletRequest request=ServletActionContext.getRequest();
		        request.setAttribute("list", list);
		        request.setAttribute("page", page);
		        return SUCCESS;
		     }else{
		        return ERROR;
		     }
	  }
	  /**
	   * 	鍒嗛〉鏌ヨ鍏ㄩ儴鑰佸笀
	   * @return
	   */
	  public String findTeacher() {
		  int pageNo=1;
			if(page!= null) {
				System.out.println("page涓嶄负绌�");
				pageNo=page.getPageno();
			}else {
				System.out.println("page涓虹┖");
			}
			int pageSize=1;
			int totalCount = adminMapperBiz.findTeacherCount();
			Page page=new Page(pageNo,pageSize,totalCount);
			List<User> list= adminMapperBiz.findTeacher(page);
			if(list!=null){
				HttpServletRequest request=ServletActionContext.getRequest();
		        request.setAttribute("list", list);
		        request.setAttribute("page", page);
		        return SUCCESS;
		     }else{
		        return ERROR;
		     }
	  }
	  
	  /**
	   * 	淇敼鑰佸笀鐨勭敵璇风姸鎬�
	   * @return
	   */
	  public String updateTeacherWait() {
		  adminMapperBiz.updateTeacherWait(user);
		  return SUCCESS;
	  }
	  /**
	   * 	澧炲姞瀛︽牎鐨勪俊鎭�
	   * @return
	   */
	  public String addSchoolIf() {
		  
		  adminMapperBiz.addSchoolIf(schoolIf);
		  
		  return SUCCESS;
	  }
	  
	  /**
	   * 	娣诲姞鐝骇
	   * @return
	   */
	  public String addDClass() {
		  
		   adminMapperBiz.addDClass(dClass);
		  return SUCCESS;
	  }
	  
	  
	  /**
	   * 	娣诲姞绠＄悊鍛�
	   * @return
	   */
	  public String adminadd() {
		  System.out.println("寰楀埌璐﹀彿"+account);
		  System.out.println("寰楀埌璐﹀彿鍜屽瘑鐮�"+password);
		  Management management=new Management();
		  management.setAccount(account);
		  management.setPassword(password);
		  adminMapperBiz.adminadd(management);
		  return SUCCESS;
		  
	  }
	  
	  /*
	   *鍒犻櫎绠＄悊鍛�
	   */
	  public String admindel() {
		  adminMapperBiz.admindel();
		return SUCCESS;
		  
	  }
	  
	  /**
	   * 鏌ヨ鍗曚釜
	   */
	  int id=2;
	  public String adminupdate() {
		  System.out.println("hahaha");
		 List<Management>list= adminMapperBiz.adminupdate(id);
		 System.out.println(list);
		 HttpServletRequest request=ServletActionContext.getRequest();
         request.setAttribute("listi", list);
		return SUCCESS;
		  
	  }
	  /*
	   * 淇敼
	   */
	
	  public String adminupdate1() {
		  System.out.println("淇敼");
		 System.out.println("杈撳嚭璐﹀彿"+account+"瀵嗙爜"+password);
		 Management management1=new Management();
		  management1.setAccount(account);
		  management1.setPassword(password);
		  adminMapperBiz.adminupdate1(management1);
		return SUCCESS;
		  
	  }
	  
	  /*
	   *鍒嗛〉鏌ヨ绠＄悊鍛�
	   */
	
	  
	  public String adminfind() {
		  System.out.println("findPage_admin");
			int pageNo=1;
			if(page!= null) {
				System.out.println("page涓嶄负绌�");
				pageNo=page.getPageno();
			}else {
				System.out.println("page涓虹┖");
			}
			int pageSize=1;
			int totalCount = adminMapperBiz.findCount_admin();
			Page page=new Page(pageNo,pageSize,totalCount);
			List<Management> list=adminMapperBiz.findPage_admin(page);
		  if(list!=null){
			  System.out.println("list涓嶄负绌�");
	             HttpServletRequest request=ServletActionContext.getRequest();
	             request.setAttribute("list", list);
	             request.setAttribute("page", page);
	             return SUCCESS;
	         }else{
	             return ERROR;
	         }

	  }
	
}
