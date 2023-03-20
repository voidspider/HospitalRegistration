package cn.zwz.doctor.entity;


import cn.zwz.basics.baseClass.ZwzBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "a_teacher")
@TableName("a_teacher")
public class S extends ZwzBaseEntity {
    private static final long serialVersionUID = 1L;
    private String id;
    //private  createTime;
    private String name;
    private int wages;

}
