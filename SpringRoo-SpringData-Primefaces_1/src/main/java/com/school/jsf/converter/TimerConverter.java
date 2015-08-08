package com.school.jsf.converter;
import com.school.domain.Timer;
import javax.faces.convert.Converter;
import org.springframework.roo.addon.jsf.converter.RooJsfConverter;

@RooJsfConverter(entity = Timer.class)
public class TimerConverter implements Converter {
}
