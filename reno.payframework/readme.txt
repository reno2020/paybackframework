=============================================================
*******************************简单的支付回调逻辑总结*************************************************
1.本代码是参考目前工作中使用的支付回调相关业务逻辑进行整理的
2.本代码只是模拟了大致流程，具体数据层未实现（数据层根据自己的业务进行处理）
3.相关逻辑说明，目前模拟了2种方式：订单回调，发票回调
4.详细说明
4.1，IPayCallback定义外部回调接口，所有的业务回调必须使用Execute方法
4.2，PayCallback抽象类，需注入订单类，支付请求类，请求头部类（为了扩展，暂时保留）实现IPayCallback的Execute方法
        RequestFieldValidate用于基础的数据校验，InitContext用于初始化支付请求数据，
        ExecuteCallback具体的执行业务，AfterCallback业务员后续执行操作
4.3，CommonPayCallback通用支付回调类，继承PayCallback抽象类，具体实现PayCallback抽象类方法，通用的校验及后续处理可以在此类中处理
4.4，CommonPayCallbackFactory通用支付回调业务工厂类，创建具体的业务类
4.5，IExecutePayCallback内部支付处理接口，用于规范内部业务的处理流程
        BeforeExecutePayCallback方法用于具体业务执行前的处理，例如业务特殊的验证
        ExecutePayCallback方法用于执行相关业务回调的业务逻辑
        AfterExecutePayCallback方法用于执行业务回调执行完毕后续的操作，例如日志，发送邮件等
 4.6，OrderPayCallback订单回调类，InvoicePayCallback发票回调类
5.本代码只是简单说明支付回调的相关流程，还有很多不足之处，故在此说明，本代码只做参考使用
6.欢迎参考本代码，指出不足之处并给出相关指导和建议，谢谢。
6.作者：jinhongliang，联系方式：（QQ）459464766  （Email）jinhongliang@126.com


***注意：本项目仅限于参考，禁止外泄以及用于其他的商业目的***
        

=============================================================