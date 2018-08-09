package com.itheima.demo03访问修饰符01;

/*
    Java中有四大权限:
        public: 公开的
        protected: 受保护的
        什么都不写: 默认的
        private: 私有的
 */
public class Fu {

    public void publicMethod() {}
    protected void protectedMethod() {}
    void defaultMethod() {}
    private void privateMethod() {}

    public void test01() {
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
