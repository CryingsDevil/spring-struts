package org.apache.struts.edit.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.edit.model.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class userInformation extends ActionSupport
{
    private static User user = new User("Sample", "Sample123", "SampleSign", "13312345678", "Founder");

    public userInformation(){}

    public userInformation(User user)
    {
        this.user = user;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String execute() throws Exception
    {
        System.out.println("user printing");
//        setSampleUser();
        ActionContext actionContext = ActionContext.getContext();
        HttpServletRequest req = ServletActionContext.getRequest();
        Map<String, Object> requestMap = (Map<String, Object>)actionContext.get("request");
        actionContext.put("userKey", user);
        requestMap.put("userMap", user);
        req.setAttribute("userReq", user);
        return SUCCESS;
    }

    private void setSampleUser(){
        user.setUserName("Sample");
        user.setPassword("Sample123");
        user.setSign("SampleSign");
        user.setPhoneNumber("13312345678");
        user.setAddress("Founder");
    }

    public String registerUser()
    {
        System.out.println(user.toString());
        return SUCCESS;
    }
}
