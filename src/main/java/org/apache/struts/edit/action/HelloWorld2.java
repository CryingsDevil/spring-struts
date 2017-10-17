package org.apache.struts.edit.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.edit.model.Message;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.Random;

@ParentPackage("struts-default")
@Namespace("/helloWorld")
public class HelloWorld2 extends ActionSupport
{
    private Message message;


    public String execute() throws Exception {
//        message = new Message("HelloWorld!");
//        return SUCCESS;

        message = new Message();

        Random random = new Random();
        int rand = random.nextInt() % 2;
        if(rand == 1){
            setMessage();
            System.out.println("H2:HelloWorld return success!");
            return SUCCESS;
        }
        else
        {
            System.out.println("H2:HelloWorld return error!");
            setMessage("HelloWorld2: Hello world");
            return ERROR;
        }
    }

    public Message getMessage()
    {
        return message;
    }

    public void setMessage()
    {
        this.message.setMsg("Helloworld2: Chase the world");
    }

    public void setMessage(String mes)
    {
        this.message.setMsg(mes);
    }

    @Action(value = "helloworld3", results = {@Result(name = "success", location = "/jsp/helloworld.jsp"),
                                              @Result(name = "error", location = "/jsp/helloworld2.jsp")})
    public String randomPrint(){
        message = new Message();

        Random random = new Random();
        int rand = random.nextInt() % 3;
        if(rand == 1){
            setMessage("HelloWorld3: Hello world");
            System.out.println("H3:HelloWorld return success!");
            return SUCCESS;
        }
        else
        {
            System.out.println("H3:HelloWorld return error!");
            setMessage("HelloWorld3: Hello world");

            return ERROR;
        }
    }
}
