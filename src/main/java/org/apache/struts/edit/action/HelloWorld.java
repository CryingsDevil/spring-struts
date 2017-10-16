package org.apache.struts.edit.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.FADD;
import org.apache.struts.edit.model.Message;

import java.util.Random;

public class HelloWorld extends ActionSupport
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
            System.out.println("HelloWorld return success!");
            return SUCCESS;
        }
        else
        {
            System.out.println("HelloWorld return error!");
            setMessage("Hello world");
            return ERROR;
        }

    }
    public Message getMessage()
    {
        return message;
    }

    public void setMessage()
    {
        this.message.setMsg("Chase the world");
    }

    public void setMessage(String mes)
    {
        this.message.setMsg(mes);
    }
}
