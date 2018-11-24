package com.langsin.proxy;

//�����ɫ

public class ProxySubject extends Subject

{
    private RealSubject realSubject; // ����ʵ��ɫ��Ϊ�����ɫ������

    public ProxySubject()
    {
    }

    public void request() // �÷�����װ����ʵ�����request����

    {
        preRequest();

        if (realSubject == null)
        {
            realSubject = new RealSubject();
        }

        realSubject.request(); // �˴�ִ����ʵ�����request����

        postRequest();
    }

    private void preRequest()
    {

        // something you want to do before requesting

    }

    private void postRequest()
    {

        // something you want to do after requesting

    }

}
