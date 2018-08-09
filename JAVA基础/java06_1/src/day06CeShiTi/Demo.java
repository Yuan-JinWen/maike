package day06CeShiTi;
/*
1.项目经理类Manager
		属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
    工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,
分配任务,检查员工提交上来的代码.....
 */
public class Demo {
    public static void main(String[] args) {
        Manager m = new Manager("项目经理",123,15000,6000);
            m.work();
            Manager t = new Manager();

         t.setName("项目经理");
         t.setId(123);
         t.setSalary(15000);
         t.setBonus(6000);
        m.work();
            Coder c = new Coder("程序员",135,10000);
            c.work();
            Coder l = new Coder();
            l.setName("程序员");
            l.setId(135);
            l.setSalary(10000);
            l.work();
    }

}
