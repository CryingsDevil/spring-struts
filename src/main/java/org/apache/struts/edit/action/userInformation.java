package org.apache.struts.edit.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.edit.model.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class userInformation extends ActionSupport
{
    private User usr = new User();

    public userInformation(){}

    public userInformation(User usr)
    {
        this.usr = usr;
    }

    public User getUsr()
    {
        return usr;
    }

    public void setUsr(User usr)
    {
        this.usr = usr;
    }

    @Override
    public String execute() throws Exception
    {
        System.out.println("user printing");
        setSampleUser();
        ActionContext actionContext = ActionContext.getContext();
        HttpServletRequest req = ServletActionContext.getRequest();
        Map<String, Object> requestMap = (Map<String, Object>)actionContext.get("request");
        actionContext.put("userKey", usr);
        requestMap.put("userMap", usr);
        req.setAttribute("userReq", usr);
        return SUCCESS;
    }

    private void setSampleUser(){
        usr.setUserName("Sample");
        usr.setPassword("Sample123");
        usr.setSign("SampleSign");
        usr.setPhoneNumber("13312345678");
        usr.setAddress("Founder");
    }
}
