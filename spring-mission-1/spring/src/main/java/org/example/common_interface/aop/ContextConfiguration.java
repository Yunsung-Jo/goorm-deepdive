package org.example.common_interface.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration("aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {
}
