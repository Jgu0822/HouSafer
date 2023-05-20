package com.project.HouSafer.Entity.Damage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "Damage")
public class Damage{

//    피해사례 : 제목, 진행상황(진행중, 완료, 미확인),
//    사기유형(테이블 참조), 피해 내용 상세경험담, 조회수, 피해금액,
//    피해지원신청여부(y/n), 회원아이디 참조)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long damageId;

    @Column(nullable = false)
    private String damageTitle;

//    진행상황에 대한 DamageStatus enum 객체를 이용
    @Column(nullable = false)
    private DamageStatus damageStatus;

//    사기 유형 테이블을 참조 하여 사기유형
    @Column(nullable = false)
    private String damageType;

    @Column(nullable = false)
    private String damageDetail;

//    조회수


    @Column(nullable = false)
    private String damageCost;


//    피해지원 신청 여부(Yes / No)
    @Column(nullable = false)
    private String damageSupportStatus;


}
