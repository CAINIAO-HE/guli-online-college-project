package com.liuscoding.edu.service;

import com.liuscoding.edu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liuscoding.edu.model.form.CourseInfoForm;
import com.liuscoding.edu.model.vo.CourseInfoVo;
import com.liuscoding.edu.model.vo.CoursePublishVo;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author liusCoding
 * @since 2020-05-10
 */
public interface CourseService extends IService<Course> {

    /**
     *  保存课程信息
     * @param courseInfoForm 课程信息
     * @return String 课程id
     */
    String saveCourseInfo(CourseInfoForm courseInfoForm);

    /**
     * 根据课程id 查询课程信息
     * @param courseId
     * @return
     */
    CourseInfoVo getCourseInfoByCourseId(String courseId);

    /**
     * 修改课程信息
     * @param courseInfoForm
     */
    void updateCourse(CourseInfoForm courseInfoForm);

    /**
     * 根据课程id查询课程确认信息
     * @param id 课程id
     * @return CoursePublishVo
     */
    CoursePublishVo publishCourseInfo(String id);

    /**
     * 根据课程id删除课程信息
     * @param courseId 课程id
     */
    void deleteCourse(String courseId);
}
