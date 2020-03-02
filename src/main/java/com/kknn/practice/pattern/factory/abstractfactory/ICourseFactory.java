package com.kknn.practice.pattern.factory.abstractfactory;

import com.kknn.practice.pattern.factory.common.ICourse;
import com.kknn.practice.pattern.factory.common.INote;
import com.kknn.practice.pattern.factory.common.IVideo;

/**
 * 所有的子工厂都实现该工厂
 * （一个品牌的抽象）
 *
 * @author kangfw5
 * @since 2019-05-18
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
