package com.langsin.dynamicproxy;

//�����ɫ

public class RealSubject implements Subject
{

    public RealSubject()
    {
    }

    public void request()
    {
        System.out.println("From real subject.");
    }

}
