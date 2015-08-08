package com.school.jsf;
import com.school.domain.Timer;
import org.springframework.roo.addon.jsf.managedbean.RooJsfManagedBean;
import org.springframework.roo.addon.serializable.RooSerializable;

@RooSerializable
@RooJsfManagedBean(entity = Timer.class, beanName = "timerBean")
public class TimerBean {
}
