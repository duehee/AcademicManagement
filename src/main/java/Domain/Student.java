package Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor // 기본적으로 학생 관련 정보는 NOT NULL
@Getter
@Entity
public class Student {
    @Id
    @Column(name = "student_id") // 학생이 사용 할 아이디
    private String studentId;

    @Column(name = "student_pw") // 학생이 사용 할 비밀번호
    private String studentPw;

    @Column(name = "student_name") // 학생 이름
    private String studentName;

    @Column(name = "student_major") // 전공
    private String studentMajor;

    @Column(name = "student_grade") // 학년
    private int studentGrade;

    @Column(name = "student_semester") // 학기
    private int studentSemester;

    @Column(name = "student_address") // 주소
    private String studentAddress;

    @Column(name = "student_tel") // 전화번호
    private String studentTel;

    @Column(name = "student_attend") // 학적 상황
    private String studentAttend;

    @Column(name = "update_at") // 업데이트 시간
    private LocalDateTime updateAt;
}
