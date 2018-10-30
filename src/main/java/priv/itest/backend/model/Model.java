package priv.itest.backend.model;

import com.google.common.collect.Lists;
import org.modelmapper.ModelMapper;
import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create By ab.xie.
 * 0n 2018/10/30 14:52.
 */
public abstract  class Model {
    private ModelMapper mm = new ModelMapper();

    public Model(){
        super();
    }

    public <T> T convertTo(Class<T> target){
        return mm.map(this, target);
    }

    public String toString(){
        Class clazz = this.getClass();
        List<Field> fields = Lists.newArrayList(clazz.getDeclaredFields());
        List<String> nameValues = fields.stream().map(field -> {
            field.setAccessible(true);
            String name = field.getName();
            Object value = null;
            try {
                value = field.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return name + "=" + value;
        }).collect(Collectors.toList());
        return String.format("[含有 %d 个成员] - %s", fields.size(), nameValues);
    }
}
